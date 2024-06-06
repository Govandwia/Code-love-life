INSERT INTO customers VALUES(700,'Albertos inc.','Yogyakarta','albertos.com',100000);

INSERT INTO customers(customer_id,name) VALUES(708,'Avengers inc.');

-- check value yang baru ditambhakan
SELECT *
FROM CUSTOMERS
WHERE name = 'Avengers inc.';

SELECT *
FROM CUSTOMERS
WHERE name = 'Albertos inc.';

--DEScribe
DESCRIBE CUSTOMERS;

--update
UPDATE customers
SET name = 'Avengers'
WHERE customer_id = 708;

UPDATE customers
SET name = 'Avengers', address = 'New York'
WHERE customer_id=708;

-- check value yang telah diupdate
SELECT *
FROM customers
WHERE customer_id = 708;

SELECT *
FROM customers
WHERE customer_id = 708;

DELETE FROM customers WHERE customer_id = 708;
DELETE FROM customers WHERE customer_id = 700;

--check value yang telah di delete
SELECT *
FROM customers
WHERE customer_id = 708; --kosong (tidak ada)

SELECT *
FROM customers
WHERE customer_id = 700; --kosong (tidak ada)

--select-select an dah
SELECT max(list_price) FROM products;
SELECT sum(quantity) FROM order_items GROUP BY order_id;
SELECT sum(quantity) FROM order_items GROUP BY order_id ORDER BY sum(quantity);




--latihan
--1
SELECT CUSTOMERS.name, ORDERS.status
FROM CUSTOMERS,ORDERS
WHERE CUSTOMERS.customer_id = ORDERS.customer_id AND ORDERS.status = 'Pending';

--2
SELECT count(name)
FROM CUSTOMERS;

--3
SELECT PRODUCT_NAME AS CPU_NAMES
FROM PRODUCTS, PRODUCT_CATEGORIES
WHERE products.category_id = product_categories.category_id AND product_categories.category_name = 'CPU';

--SELECT PRODUCT_NAME AS CPU_NAMES
--FROM PRODUCTS, PRODUCT_CATEGORIES
--WHERE products.category_id = product_categories.category_id AND products.category_id = 1;

--4
SELECT count(PRODUCT_NAME)
FROM PRODUCTS, PRODUCT_CATEGORIES
WHERE products.category_id = product_categories.category_id AND product_categories.category_name = 'CPU';

--5
SELECT LOCATIONS.CITY , WAREHOUSES.WAREHOUSE_NAME
FROM LOCATIONS, WAREHOUSES
WHERE WAREHOUSES.location_id = LOCATIONS.location_id;

--6
SELECT PRODUCTS.PRODUCT_NAME , WAREHOUSES.WAREHOUSE_NAME
FROM PRODUCTS,INVENTORIES,WAREHOUSES
WHERE PRODUCTS.product_id = INVENTORIES.product_id AND INVENTORIES.WAREHOUSE_ID = WAREHOUSES.WAREHOUSE_ID AND WAREHOUSES.WAREHOUSE_NAME = 'Toronto';

--7
SELECT count(ORDER_ID)
FROM ORDERS, EMPLOYEES
WHERE ORDERS.SALESMAN_ID = 3;--salesman_id = 3 => salesman_id milik Blake Cooper