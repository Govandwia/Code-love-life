CREATE TABLE EVALUATIONS_LOG ( log_date DATE
                             , action VARCHAR2(50));

CREATE OR REPLACE TRIGGER EVAL_CHANGE_TRIGGER
  AFTER INSERT OR UPDATE OR DELETE
  ON CUSTOMERS
DECLARE
  log_action  EVALUATIONS_LOG.action%TYPE;
BEGIN
  IF INSERTING THEN
    log_action := 'Insert';
  ELSIF UPDATING THEN
    log_action := 'Update';
  ELSIF DELETING THEN
    log_action := 'Delete';
  ELSE
    DBMS_OUTPUT.PUT_LINE('This code is not reachable.');
  END IF;

  INSERT INTO EVALUATIONS_LOG (log_date, action)
    VALUES (SYSDATE, log_action);
END;
/

SELECT * FROM EVALUATIONS_LOG;


-- Latihan nomor 1
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (177,'United Continental Holdings','2904 S Salina St, Syracuse, NY',5000,'http://www.unitedcontinentalholdings.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (180,'INTL FCStone','5344 Haverford Ave, Philadelphia, PA',5000,'http://www.intlfcstone.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (184,'Publix Super Markets','1795 Wu Meng, Muang Chonburi, ',1200,'http://www.publix.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (187,'ConocoPhillips','Walpurgisstr 69, Munich, ',2400,'http://www.conocophillips.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (190,'3M','Via Frenzy 6903, Roma, ',1200,'http://www.3m.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (192,'Exelon','Via Luminosa 162, Firenze, ',500,'http://www.exeloncorp.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (208,'Tesoro','Via Notoriosa 1942, Firenze, ',500,'http://www.tsocorp.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (207,'Northwestern Mutual','1831 No Wong, Peking, ',3600,'http://www.northwesternmutual.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (200,'Enterprise Products Partners','Via Notoriosa 1949, Firenze, ',2400,'http://www.enterpriseproducts.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (204,'Rite Aid','Piazza Cacchiatore 23, San Giminiano, ',3600,'http://www.riteaid.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (212,'Qualcomm','Piazza Svizzera, Milano, ',500,'http://www.qualcomm.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (216,'EMC','Via Delle Grazie 11, San Giminiano, ',700,'http://www.emc.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (220,'Time Warner Cable','1597 Legend St, Mysore, Kar',3700,'http://www.twc.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (223,'Northrop Grumman','1606 Sangam Blvd, New Delhi, ',5000,'http://www.northropgrumman.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (39,'Lear','2115 N Towne Ln Ne, Cedar Rapids, IA',500,'http://www.lear.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (43,'Facebook','5112 Sw 9Th St, Des Moines, IA',500,'http://www.facebook.com');
Insert into CUSTOMERS (CUSTOMER_ID,NAME,ADDRESS,CREDIT_LIMIT,WEBSITE) values (46,'Supervalu','8989 N Port Washington Rd, Milwaukee, WI',500,'http://www.supervalu.com');

-- Table latihan 1
CREATE TABLE LOG_DEL_CUSTOMERS ( NAME VARCHAR2(255), ADDRESS VARCHAR2(255), WEBSITE VARCHAR2(255), STATUS VARCHAR2(50));
ALTER TABLE LOG_DEL_CUSTOMERS ADD DELETED_TIME DATE;

-- Trigger latihan 1
CREATE OR REPLACE TRIGGER DEL_SAVE_CUSTOMERS_DATA
  AFTER DELETE ON CUSTOMERS
  FOR EACH ROW
DECLARE
  vstatus LOG_DEL_CUSTOMERS.STATUS%TYPE;
BEGIN
  IF DELETING THEN
    vstatus := 'Deleted';
  ELSE
    DBMS_OUTPUT.PUT_LINE('This code is not reachable.');
  END IF;
  
  INSERT INTO LOG_DEL_CUSTOMERS (NAME ,ADDRESS, WEBSITE, STATUS, DELETED_TIME)
    VALUES (:old.NAME, :old.ADDRESS, :old.WEBSITE, vstatus, SYSDATE);
END;
/

-- delete row
DELETE FROM CUSTOMERS WHERE CUSTOMER_ID = 46;
DELETE FROM CUSTOMERS WHERE CUSTOMER_ID = 177;

--view log_del_customers table
SELECT * FROM LOG_DEL_CUSTOMERS;
SELECT * FROM CUSTOMERS;



-- Latihan nomor 2

-- table order item
CREATE TABLE order_items
  (
    order_id   NUMBER( 12, 0 )                                , -- fk
    item_id    NUMBER( 12, 0 )                                ,
    product_id NUMBER( 12, 0 ) NOT NULL                       , -- fk
    quantity   NUMBER( 8, 2 ) NOT NULL                        ,
    unit_price NUMBER( 8, 2 ) NOT NULL                        
);

-- insert table latihan 2
Insert into ORDER_ITEMS (ORDER_ID,ITEM_ID,PRODUCT_ID,QUANTITY,UNIT_PRICE) values (70,7,32,132,469.99);
Insert into ORDER_ITEMS (ORDER_ID,ITEM_ID,PRODUCT_ID,QUANTITY,UNIT_PRICE) values (73,5,192,124,519.99);
Insert into ORDER_ITEMS (ORDER_ID,ITEM_ID,PRODUCT_ID,QUANTITY,UNIT_PRICE) values (74,7,27,92,800.74);
Insert into ORDER_ITEMS (ORDER_ID,ITEM_ID,PRODUCT_ID,QUANTITY,UNIT_PRICE) values (75,11,6,128,849.99);
Insert into ORDER_ITEMS (ORDER_ID,ITEM_ID,PRODUCT_ID,QUANTITY,UNIT_PRICE) values (76,10,95,106,109.99);
Insert into ORDER_ITEMS (ORDER_ID,ITEM_ID,PRODUCT_ID,QUANTITY,UNIT_PRICE) values (81,7,79,127,659.99);
Insert into ORDER_ITEMS (ORDER_ID,ITEM_ID,PRODUCT_ID,QUANTITY,UNIT_PRICE) values (82,9,284,138,54.99);
Insert into ORDER_ITEMS (ORDER_ID,ITEM_ID,PRODUCT_ID,QUANTITY,UNIT_PRICE) values (83,8,174,117,798.26);

-- trigger latihan 2
CREATE OR REPLACE TRIGGER check_order_quantity
BEFORE INSERT OR UPDATE ON ORDER_ITEMS
FOR EACH ROW
DECLARE
    invalid_quantity EXCEPTION;
BEGIN
    IF :NEW.quantity < 5 THEN
        RAISE_APPLICATION_ERROR(-20001, 'quantity must be over 5');
    ELSIF :NEW.quantity > 500 THEN
        RAISE_APPLICATION_ERROR(-20002, 'quantity must be below 500');
    END IF;
END;
/


-- insert untuk mengetest trigger yang telah dibuat
INSERT INTO ORDER_ITEMS (ORDER_ID, ITEM_ID, PRODUCT_ID, QUANTITY, UNIT_PRICE) VALUES (101, 15, 321, 3, 150.75); --error
INSERT INTO ORDER_ITEMS (ORDER_ID, ITEM_ID, PRODUCT_ID, QUANTITY, UNIT_PRICE) VALUES (202, 30, 456, 520, 799.99); -- error

SELECT * FROM ORDER_ITEMS;


-- latihan nomor 3
CREATE OR REPLACE TRIGGER unit_price_discount
BEFORE INSERT ON ORDER_ITEMS
FOR EACH ROW
BEGIN
    :new.unit_price := :new.unit_price * 0.95; -- Applying 5% discount to unit_price
END;
/

--test nomor 3
INSERT INTO ORDER_ITEMS (ORDER_ID, ITEM_ID, PRODUCT_ID, QUANTITY, UNIT_PRICE) VALUES (666, 666, 99, 35, 100);

DELETE FROM ORDER_ITEMS WHERE ORDER_ID = 666;

-- melihat discounted unit_price
SELECT * FROM ORDER_ITEMS WHERE ORDER_ID = 666;