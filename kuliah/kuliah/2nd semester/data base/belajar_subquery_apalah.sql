-- 1
SELECT *
FROM PRODUCTS
WHERE LIST_PRICE IN ( SELECT MIN(LIST_PRICE)
                        FROM PRODUCTS );
-- 2
SELECT oi.* ,(quantity * unit_price) AS TOTAL_COST
FROM ORDER_ITEMS oi
WHERE quantity * unit_price > ( SELECT AVG(quantity * unit_price) AS CHECKOUT
                                FROM ORDER_ITEMS );
                                
--3
SELECT oi.* ,(quantity * unit_price) AS MAX_COST
FROM ORDER_ITEMS oi
WHERE quantity * unit_price in ( SELECT MAX(quantity * unit_price) AS MAX_COST
                                FROM ORDER_ITEMS );


--4
SELECT *
FROM ORDER_ITEMS oi
LEFT JOIN PRODUCTS p ON oi.PRODUCT_ID = p.PRODUCT_ID
WHERE p.product_name in ( SELECT product_name
                          FROM PRODUCTS 
                          WHERE PRODUCT_NAME NOT LIKE '%Intel%');
                          
--5
SELECT p.*
FROM PRODUCTS p
WHERE p.PRODUCT_ID IN (SELECT PRODUCT_ID
                       FROM ORDER_ITEMS
                       GROUP BY PRODUCT_ID
                       HAVING COUNT(ORDER_ID) > 1);





                        