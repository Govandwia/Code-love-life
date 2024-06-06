-- view pertemuan 11
-- example
CREATE VIEW view_example AS
SELECT product_name
FROM PRODUCTS 
WHERE PRODUCT_NAME NOT LIKE '%Intel%';

SELECT *
FROM view_example;

--tugas
--1 a
CREATE VIEW view_barang AS
SELECT product_id AS kode_barang, product_name AS nama_produk, list_price AS satuan
FROM products;
-- 1 b 
SELECT *
FROM view_barang;

-- 2 a
CREATE VIEW view_order_info AS
SELECT
    o.ORDER_ID,
    o.ORDER_DATE,
    c.CUSTOMER_ID,
    c.NAME AS CUSTOMER_NAME,
    c.ADDRESS AS CUSTOMER_ADDRESS,
    p.PRODUCT_ID,
    p.PRODUCT_NAME AS PRODUCT_NAME,
    p.LIST_PRICE AS PRODUCT_PRICE,
    oi.QUANTITY,
    (oi.QUANTITY * p.LIST_PRICE) AS TOTAL_PRICE
FROM
    ORDERS o
JOIN
    CUSTOMERS c ON o.CUSTOMER_ID = c.CUSTOMER_ID
JOIN
    ORDER_ITEMS oi ON o.ORDER_ID = oi.ORDER_ID
JOIN
    PRODUCTS p ON oi.PRODUCT_ID = p.PRODUCT_ID;

-- 2 b
SELECT *
FROM view_order_info;

SELECT product_id, product_name, product_price, quantity, total_price
FROM view_order_info;

SELECT order_id, order_date, customer_id, customer_name, customer_address
FROM view_order_info;

--3 a
CREATE OR REPLACE VIEW view_barang AS
SELECT product_id AS kode_barang, product_name AS nama_produk, list_price AS satuan
FROM products
WITH READ ONLY;

--3 b
UPDATE view_barang
SET  NAMA_PRODUK = 'Nvidia RTX 2050'
WHERE kode_barang = 183;

SELECT *
FROM view_barang;
