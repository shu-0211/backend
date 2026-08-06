CREATE DATABASE practice2

USE practice2;

show DATABASES

-- 문제1
CREATE TABLE members(
    member_id INT AUTO_INCREMENT ,
    constraint PRIMARY key(member_id) ,
    member_name VARCHAR(50) NOT NULL ,
    email VARCHAR(100) NOT NULL, 
    join_date DATETIME DEFAULT now(),
    is_active BOOLEAN DEFAULT true
)

DESCRIBE members

-- 문제 2

CREATE TABLE products (
    product_id int AUTO_INCREMENT,
    constraint PRIMARY key(product_id),
    product_name VARCHAR(100) NOT null,
    price int UNSIGNED  not NULL , 
    stock int DEFAULT 0 not null ,
    created_at DATETIME DEFAULT now()
)

DESCRIBE products