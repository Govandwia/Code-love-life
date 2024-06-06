--1 Tampilkan data customer yang belum pernah melakukan pembelian!
SELECT *
FROM CUSTOMERS c
LEFT JOIN ORDERS o ON c.CUSTOMER_ID = o.CUSTOMER_ID
WHERE o.CUSTOMER_ID IS NULL;

SELECT count(c.NAME)
FROM customers c
WHERE c.customer_id NOT IN (SELECT ORDERS.customer_id FROM ORDERS); --subqueary

--2 Tampilkan berapa total order yang sudah dilakukan!
SELECT COUNT(*)
FROM ORDERS;

--3 Tampilkan berapa nilai rata-rata order quantity!
SELECT AVG(QUANTITY)AS AVG_QUANTITY
FROM ORDER_ITEMS;

-- 4 Tampilkan data total order dikelompokkan berdasarkan produk-nya (PRODUCT NAME, total_order_quantity) khusus untuk PRODUK yang mengandung kata 'INTEL' atau 'AMD'!
SELECT COUNT(i.ORDER_ID) AS OrderCount, p.PRODUCT_NAME
FROM PRODUCTS p
JOIN ORDER_ITEMS i ON p.PRODUCT_ID = i.PRODUCT_ID
JOIN ORDERS o ON i.ORDER_ID = o.ORDER_ID
WHERE p.PRODUCT_NAME LIKE '%Intel%' OR p.PRODUCT_NAME LIKE '%AMD%'
GROUP BY p.PRODUCT_NAME;

-- 5 Tampilkan total nilai pesanan tertinggi untuk tiap pelanggan (id_customer, max_order)!
SELECT CUSTOMER_ID, MAX(total_order) AS max_order
FROM (SELECT customer_id, SUM(quantity*unit_price) AS total_order
      FROM ORDERS o JOIN ORDER_ITEMS oi ON (o.ORDER_ID = oi.ORDER_ID)
      GROUP BY CUSTOMER_ID)
GROUP BY CUSTOMER_ID;

-- 6 Tampilkan total nilai pesanan tertinggi untuk tiap pelanggan (id_customer, full_name, max_order)!
SELECT CUSTOMER_ID, c.NAME , MAX(total_order) AS max_order
FROM (SELECT customer_id, SUM(quantity*unit_price) AS total_order
      FROM ORDERS o, CUSTOMERS c JOIN ORDER_ITEMS oi ON (o.ORDER_ID = oi.ORDER_ID)
      JOIN CUSTOMERS c ON (o.CUSTOMER_ID = c.CUSTOMER_ID)
      GROUP BY CUSTOMER_ID)
GROUP BY c.CUSTOMER_ID, c.NAME; -- eror
-- 6
SELECT c.CUSTOMER_ID, c.NAME, ot.total_order AS max_order
FROM (SELECT o.CUSTOMER_ID, SUM(oi.QUANTITY * oi.UNIT_PRICE) AS total_order
    FROM ORDERS o
    JOIN ORDER_ITEMS oi ON o.ORDER_ID = oi.ORDER_ID
    GROUP BY o.CUSTOMER_ID) ot
JOIN CUSTOMERS c ON ot.CUSTOMER_ID = c.CUSTOMER_ID;

-- 7 Tampilkan jumlah order yang terjadi tiap tahun!
SELECT COUNT(*)
FROM ORDERS
WHERE ORDER_DATE BETWEEN '01-01-2016' AND '31-12-2016' OR '01-0102017' AND '31-12-2017' --eror
ORDER BY ORDER_DATE ASC; --eror

SELECT EXTRACT(YEAR FROM ORDER_DATE) AS order_year, COUNT(*) AS order_count
FROM ORDERS
GROUP BY EXTRACT(YEAR FROM ORDER_DATE)
ORDER BY order_year ASC;

-- 8 Tampilkan tahun dengan order yang tertinggi
SELECT MAX(order_year) AS max_year_order
FROM (SELECT EXTRACT(YEAR FROM ORDER_DATE) AS order_year, COUNT(*) AS order_count
    FROM ORDERS
    GROUP BY EXTRACT(YEAR FROM ORDER_DATE));

-- 9 Tampilkan data customer yang telah melakukan order lebih dari 2x!
SELECT c.CUSTOMER_ID, c.NAME, c.ADDRESS
FROM CUSTOMERS c
WHERE (
    SELECT COUNT(*)
    FROM ORDERS o
    WHERE o.CUSTOMER_ID = c.CUSTOMER_ID
) > 2;




-- 10 menampilkan data produk yang memiliki rata-rata quantity pada pemesanan lebih dari 5!
SELECT p.product_id, p.product_name --, oi.AVG(quantity)
FROM products p
JOIN ORDER_ITEMS oi ON p.product_id = oi.product_id
GROUP by p.product_id, p.product_name
HAVING AVG(oi.quantity) > 5;

-- 11 Tampilkan data customer yang belum pernah melakukan penyewaan!



