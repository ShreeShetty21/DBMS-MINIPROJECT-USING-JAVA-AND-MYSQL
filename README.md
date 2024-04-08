The Excavator Rental Management System is a software solution designed to streamline the process of managing excavator rentals for construction companies, contractors, and rental agencies.


NETBEANS IDE AND MYSQL CLIENT



TABLES USED IN MYSQL ARE:



ADMIN---------------------


CREATE TABLE ’ADMIN’ (’ADMIN-ID’ char(15) NOT NULL,
’ADMIN-PASSWORD’ varchar(15) NOT NULL
PRIMARY KEY’(ADMIN-ID’));





EXCAVATOR---------------------



CREATE TABLE ’EXCAVATOR’(’EX-ID’ int(20)AUTOINCREMENT NOT NULL,
’EX-NAME’ varchar(20),
’AVAILABLE’ char(3),
’CAPACITY’ int,
’PRICE’ int,
’FUEL-TYPE’ char(10),
PRIMARY KEY(’EX-ID’));





USER--------------------------



CREATE TABLE ’USER’(’FNAME’ char(10)NOT NULL,
’LNAME’ char(10)NOT NULL,
’EMAIL’ varchar(50)NOT NULL,
’PASSWORD’ varchar(50)NOT NULL,
’GENDER’ char(6)NOT NULL,
’PHONE’ int NOT NULL,
’LIC-NO’ varchar(50)NOT NULL,
PRIMARY KEY(EMAIL));





BOOKING----------------------------



CREATE TABLE ’BOOKING’(’BOOK-ID’ int AUTOINCREMENT NOT NULL,
’BOOK-PLACE’ char(10)NOT NULL,
’BOOK-DATE’ date NOT NULL,
’PRICE’ int NOT NULL,
’DESTINATION’ varchar(100) NOT NULL,
’RETURN-DATE’ date NOT NULL,
’EX-ID’ int(20) NOT NULL,
’EMAIL’ varchar(50) NOT NULL,
PRIMARY KEY(’BOOK-ID’),FOREIGN KEY(’EX-ID’)REFERENCES ’EXCAVATOR’(’EX-ID’)ON DELETE
CASCADE);




PAYMENT--------------------------------



CREATE TABLE ’PAYMENT’(’PAYMENT-ID’ int AUTOINCREMENT NOT NULL,
’CARD-NO’ int NOT NULL,
’EXP-DATE’ date NOT NULL,
’CVV’ int NOT NULL,
’PRICE’ int NOT NULL,
’BOOK-ID’ int NOT NULL,
PRIMARY KEY(PAYMENT-ID),
FOREIGN KEY(BOOK-ID)REFERENCES ’BOOKING’(’BOOK-ID’)ON DELETE
CASCADE);




FEEDBACK-----------------------------------



CREATE TABLE ’FEEDBACK’(’FEED-ID’ int AUTOINCREMENT NOTNULL,
’COMMENT’ Varchar(200)NOT NULL,
’EMAIL’ varchar(50),
PRIMARY KEY(’PAYMENT-ID’),
FOREIGN KEY(’EMAIL’)REFERENCES ’USER’(’EMAIL’)ON DELETE
CASCADE);




