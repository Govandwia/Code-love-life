-- 1
-- table student tanpa primary key
CREATE TABLE STUDENT (
    FIRST_NAME VARCHAR2(255) NOT NULL,
    MIDDLE_NAME VARCHAR2(255) NOT NULL,
    LAST_NAME VARCHAR2(255) NOT NULL,
    DOB DATE,
    PHONE VARCHAR2(25)
);

-- 2
-- table book dengan primary key
CREATE TABLE BOOK (
    BOOK_ID INT GENERATED BY DEFAULT AS IDENTITY START WITH 1 PRIMARY KEY,
    BOOK_NAME VARCHAR2(255),
    PRICE INT,
    AUTHORS VARCHAR2(255) NOT NULL
);

--3
-- menambah property primary key pada column stu_id di tabel student
ALTER TABLE STUDENT ADD STU_ID INT GENERATED BY DEFAULT AS IDENTITY START WITH 1 PRIMARY KEY;


--4
-- tabel ketiga (hasil relasi)
CREATE TABLE READS (
    NO_PINJAM INT GENERATED BY DEFAULT AS IDENTITY START WITH 1 PRIMARY KEY,
    STU_ID INT,
    BOOK_ID INT,
    TGL_MULAI DATE,
    TGL_SELESAI DATE,
    FOREIGN KEY (BOOK_ID) REFERENCES BOOK(BOOK_ID),
    FOREIGN KEY (STU_ID) REFERENCES STUDENT(STU_ID)
);

--5 
-- INPUT 5 BARIS DATA PADA TABEL STUDENT
INSERT INTO STUDENT(first_name, middle_name, last_name, dob, phone)
VALUES ('Muhammad','Irfan','Valerian', DATE '2005-05-05', '628576063655');

INSERT INTO STUDENT(first_name, middle_name, last_name, dob, phone)
VALUES ('Poernomo','Maulana','Rofif', DATE '2004-03-03', '62456785645');

INSERT INTO STUDENT(first_name, middle_name, last_name, dob, phone)
VALUES ('Govan', 'Dwi', 'Aditya', DATE '2005-11-04', '623457869603');

INSERT INTO STUDENT(first_name, middle_name, last_name, dob, phone)
VALUES ('Muhammad','Rifqi', 'Renaldo', DATE '2005-04-12', '626262345676');

INSERT INTO STUDENT(first_name, middle_name, last_name, dob, phone)
VALUES ('Muhammad', 'Raihan', 'Bandar', DATE '2005-11-11', '621234546');


-- 6
-- input 5 baris data untuk book dan reads
--book
INSERT INTO BOOK (BOOK_NAME, PRICE, AUTHORS)
VALUES ('The Great Gatsby', 30000, 'F. Scott Fitzgerald');

INSERT INTO BOOK (BOOK_NAME, PRICE, AUTHORS)
VALUES ('To Kill a Mockingbird', 40000, 'Harper Lee');

INSERT INTO BOOK (BOOK_NAME, PRICE, AUTHORS)
VALUES ('1984', 180000, 'George Orwell');

INSERT INTO BOOK (BOOK_NAME, PRICE, AUTHORS)
VALUES ('Pride and Prejudice', 25000, 'Jane Austen');

INSERT INTO BOOK (BOOK_NAME, PRICE, AUTHORS)
VALUES ('The Catcher in the Rye', 22000, 'J.D. Salinger');

--reads
INSERT INTO READS (STU_ID, BOOK_ID, TGL_MULAI, TGL_SELESAI)
VALUES (1, 1, DATE '2024-04-20', DATE '2024-05-10');

INSERT INTO READS (STU_ID, BOOK_ID, TGL_MULAI, TGL_SELESAI)
VALUES (2, 2, DATE '2024-04-18', DATE '2024-05-05');

INSERT INTO READS (STU_ID, BOOK_ID, TGL_MULAI, TGL_SELESAI)
VALUES (3, 3, DATE '2024-04-22',DATE '2024-05-15');

INSERT INTO READS (STU_ID, BOOK_ID, TGL_MULAI, TGL_SELESAI)
VALUES (4, 4, DATE  '2024-04-25', DATE '2024-05-20');

INSERT INTO READS (STU_ID, BOOK_ID, TGL_MULAI, TGL_SELESAI)
VALUES (5, 5, DATE '2024-04-28', DATE '2024-05-25');


--7
-- menambah kolom email
ALTER TABLE STUDENT ADD EMAIL VARCHAR2(255);

--8
-- isi email pada salah satu
UPDATE STUDENT
SET EMAIL = 'rofikeren@yahoooo.com'
WHERE LAST_NAME = 'Rofif';

--9
--menghapus kolom email pada student
ALTER TABLE STUDENT DROP COLUMN EMAIL;


--10
-- tampilkan judul buku dan harganya diurutkan dari harga buku termahal
SELECT BOOK_NAME, PRICE
FROM BOOK
ORDER BY PRICE DESC;


--11
-- menampilkan id mahasiswa, nama mahasiswa, dan judul yang dibaca
SELECT s.STU_ID,  s.LAST_NAME, b.BOOK_NAME
FROM STUDENT s, READS r, BOOK b 
WHERE s.STU_ID = r.STU_ID AND r.BOOK_ID = b.BOOK_ID;


-- check
SELECT * FROM READS;


--12
-- menampilkan mahasiswa yang belum pernah baca buku
--contoh nama mahasiswa yang tidak membaca
INSERT INTO STUDENT (first_name,middle_name,last_name,dob,phone)
VALUES ('Mulia', 'Simajuntak', 'Gom gom', DATE '2005-01-01', '6276326423');

--SELECT CONCAT(FIRST_NAME, '', MIDDLE_NAME, '', LAST_NAME) AS NAME
SELECT FIRST_NAME
FROM STUDENT
WHERE STU_ID NOT IN(SELECT STU_ID FROM READS);


