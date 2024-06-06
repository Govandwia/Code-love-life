-- bentuk umum
SET SERVEROUTPUT ON
DECLARE
    teks VARCHAR2 (20);
BEGIN
    teks := 'Belajar Oracle';
    DBMS_OUTPUT.PUT_LINE(teks);
END;
/

-- struktur umum
DECLARE
    X integer;
    Alamat varchar2(40);
    No_induk char(8);
BEGIN
    X := 12;
    Alamat := 'Gelatik Dalam 391, Bandung';
    No_induk := 'DOG29549';
END;
/

-- contoh dengan eksepsi
SET SERVEROUTPUT ON
DECLARE
    X Integer;
BEGIN
    X := 'Belajar Oracle';
    DBMS_OUTPUT.PUT_LINE( TO_CHAR(X) );
EXCEPTION
    WHEN VALUE_ERROR THEN
        DBMS_OUTPUT.PUT_LINE ('Kesalahan pada pengisisan nilai');
END;
/

-- LATIHAN
-- 1
BEGIN
DBMS_OUTPUT.PUT_LINE('Belajar Oracle');
END;
/

-- 2
SET SERVEROUTPUT ON
/

--3
SET SERVEROUTPUT ON
DECLARE
nama varchar2 (100);
alamat varchar2 (100);
BEGIN
SELECT name, address INTO nama,alamat
FROM customers WHERE customer_id = 124;
dbms_output.put_line('Data customer dengan kode 124');
dbms_output.put_line('Nama : ' || nama);
dbms_output.put_line('Alamat : ' || alamat);
END;
/

-- RECORD
TYPE Alamat IS RECORD (
    NamaJalan VARCHAR2(100),
    NOJalan NUMBER,
    NoRumah VARCHAR2(5),
    Kota VARCHAR2 (20)
);

TYPE PemilikRumah IS RECORD (
    Nama VARCHAR2(100),
    Domisili Alamat
);

-- LATIHAN
SET SERVEROUTPUT ON
DECLARE
    TYPE Alamat IS RECORD (
        NamaJalan VARCHAR2(100),
        NOJalan NUMBER,
        NoRumah VARCHAR2(5),
        Kota VARCHAR2(20)
    );
    TYPE PemilikRumah IS RECORD (
        Nama VARCHAR2(100),
        Domisili Alamat
    );
    REC PemilikRumah;
BEGIN
    REC.Nama := 'Ahmad Subianto';
    REC.Domisili.NamaJalan := 'Jalan melati';
    REC.Domisili.NoJalan := 10;
    REC.Domisili.NoRumah := '10B';
    REC.Domisili.Kota := 'Palembang';
    DBMS_OUTPUT.PUT_LINE (REC.Nama);
    DBMS_OUTPUT.PUT_LINE (rec.domisili.namaJalan || ' ' ||
    rec.domisili.noJalan || ' ' || 'No' || ' ' ||
    rec.domisili.NoRumah || ' ' || rec.domisili.kota);
END;
/

-- ARRAY
-- CONTOH
SET SERVEROUTPUT ON
DECLARE
    TYPE LARIK IS TABLE OF NUMBER INDEX BY BINARY_INTEGER;
    A LARIK;
BEGIN 
    A(1) := 10; 
    A(2) := 20;
    A(3) := 30; 
    A(4) := 40;

    DBMS_OUTPUT.PUT_LINE('nilai elemen larik ke 1 : ' || TO_CHAR(A(1)));
    DBMS_OUTPUT.PUT_LINE('nilai elemen larik ke 2 : ' || TO_CHAR(A(2)));
    DBMS_OUTPUT.PUT_LINE('nilai elemen larik ke 3 : ' || TO_CHAR(A(3)));
    DBMS_OUTPUT.PUT_LINE('nilai elemen larik ke 4 : ' || TO_CHAR(A(4)));
END;
/

-- PERCABANGAN
--LATIHAN
-- 1
SET SERVEROUTPUT ON
DECLARE
    BIL INTEGER := 100;
BEGIN
    IF MOD(BIL,2)=0 THEN
        DBMS_OUTPUT.PUT_LINE(TO_CHAR(BIL)|| ' adalah bilangan Genap');
    END IF;
END;
/

-- 2
SET SERVEROUTPUT ON
DECLARE
    BIL INTEGER := 99;
BEGIN
    IF MOD(BIL,2)=0 THEN
        DBMS_OUTPUT.PUT_LINE(TO_CHAR(BIL)|| ' adalah bilangan Genap');
    ELSE 
        DBMS_OUTPUT.PUT_LINE(TO_CHAR(BIL)|| ' adalah bilangan GANJIL');
    END IF;
END;
/

-- 3
SET SERVEROUTPUT ON
DECLARE
    BIL INTEGER := -99;
BEGIN
    IF MOD(BIL,2)=0 THEN
        DBMS_OUTPUT.PUT_LINE(TO_CHAR(BIL)|| ' adalah bilangan Genap');
    ELSIF BIL < 0 THEN
        DBMS_OUTPUT.PUT_LINE(TO_CHAR(BIL)|| ' adalah bilangan negatif');
    ELSE 
        DBMS_OUTPUT.PUT_LINE(TO_CHAR(BIL)|| ' adalah bilangan GANJIL');
    END IF;
END;
/


-- PERULANGAN
-- LATIHAN
-- 1
SET SERVEROUTPUT ON
DECLARE
    I INTEGER;
BEGIN
    I := 0;
    LOOP
        I:= I+1;
        DBMS_OUTPUT.PUT_LINE('sukses dengan oracle');
        EXIT WHEN i = 10;
    END LOOP;
END;
/

--2
SET SERVEROUTPUT ON
DECLARE
    I INTEGER := 0;
BEGIN 
    WHILE (I < 10) LOOP
        DBMS_OUTPUT.PUT_LINE('sukses dengan oracle (while loop)');
        I:= I+1;
    END LOOP;
END;
/

-- 3
SET SERVEROUTPUT ON
DECLARE
BEGIN 
    FOR I IN 1..10 LOOP
        DBMS_OUTPUT.PUT_LINE('sukses dengan oracle (FOR loop)');
    END LOOP;
END;
/