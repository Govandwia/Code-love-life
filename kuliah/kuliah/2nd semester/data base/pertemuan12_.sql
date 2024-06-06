-- 1
CREATE OR REPLACE PROCEDURE cari_nama_warehouse
    IS vnamawarehouse WAREHOUSES.WAREHOUSE_NAME%TYPE;
BEGIN 
    SELECT WAREHOUSE_NAME INTO vnamawarehouse FROM WAREHOUSES WHERE WAREHOUSE_ID = 4;
    DBMS_OUTPUT.PUT_LINE('Name : ' || vnamawarehouse);
END;
/

SET SERVEROUTPUT ON
EXECUTE CARI_NAMA_WAREHOUSE;
/

-- 2
CREATE OR REPLACE FUNCTION cari_namawarehouse
    RETURN WAREHOUSES.WAREHOUSE_NAME%TYPE
    IS vnamawarehouse WAREHOUSES.WAREHOUSE_NAME%TYPE;
BEGIN 
    SELECT WAREHOUSE_NAME INTO vnamawarehouse FROM WAREHOUSES WHERE WAREHOUSE_ID = 4;
    RETURN vnamawarehouse;
END;
/

SET SERVEROUTPUT ON
DECLARE
    Nama WAREHOUSES.WAREHOUSE_NAME%TYPE;
BEGIN
    Nama := cari_namawarehouse;
    DBMS_OUTPUT.PUT_LINE(Nama);
END;

-- 3 Ubahlah prosedur pada soal no 1 sehingga prosedur dapat menentukan nama suplier
-- berdasarkan kode suplier yang dimasukkan sebagai parameternya
CREATE OR REPLACE PROCEDURE cari_nama_warehouse (p_warehouse_id WAREHOUSES.WAREHOUSE_ID%TYPE)
    IS vnamawarehouse WAREHOUSES.WAREHOUSE_NAME%TYPE;
BEGIN 
    SELECT WAREHOUSE_NAME INTO vnamawarehouse FROM WAREHOUSES WHERE WAREHOUSE_ID = p_warehouse_id;
    DBMS_OUTPUT.PUT_LINE('Name : ' || vnamawarehouse);
END;
/

SET SERVEROUTPUT ON
EXECUTE CARI_NAMA_WAREHOUSE(9);
/

-- 4
CREATE OR REPLACE PROCEDURE cari_nama_warehouse (
    p_warehouse_id IN WAREHOUSES.WAREHOUSE_ID%TYPE,
    p_warehousename OUT WAREHOUSES.WAREHOUSE_NAME%TYPE
) 
IS
BEGIN 
    -- Selecting the warehouse name into the output parameter
    SELECT WAREHOUSE_NAME 
    INTO p_warehousename 
    FROM WAREHOUSES 
    WHERE WAREHOUSE_ID = p_warehouse_id;
END;
/

DECLARE 
    v_warehousename WAREHOUSES.WAREHOUSE_NAME%TYPE;
BEGIN
    cari_nama_warehouse(7,v_warehousename);
    DBMS_OUTPUT.PUT_LINE('Name : ' || v_warehousename);
END;
/


-- 5
CREATE OR REPLACE PROCEDURE cari_nama_warehouse (
    p_warehouse_id IN OUT WAREHOUSES.WAREHOUSE_ID%TYPE,
    p_warehouse_name IN OUT WAREHOUSES.WAREHOUSE_NAME%TYPE
) 
IS
BEGIN 
    -- Memilih nama gudang ke dalam parameter keluaran
    SELECT WAREHOUSE_NAME 
    INTO p_warehouse_name 
    FROM WAREHOUSES 
    WHERE WAREHOUSE_ID = p_warehouse_id;
END;
/

DECLARE
    kode WAREHOUSES.WAREHOUSE_ID%TYPE := 3;
    name WAREHOUSES.WAREHOUSE_NAME%TYPE;
BEGIN
    cari_nama_warehouse(kode, name);
    DBMS_OUTPUT.PUT_LINE('Nama : ' || name);
END;
/