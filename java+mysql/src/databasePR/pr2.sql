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

-- 문제 3
create Table orders(
    order_id BIGINT AUTO_INCREMENT,
    constraint PRIMARY key(order_id),
    member_id int ,
    constraint Foreign Key (member_id) REFERENCES members(member_id),
    order_date DATETIME  DEFAULT now(),
    total_price int UNSIGNED NOT NULL
);
describe orders;

-- 문제 4
create TABLE order_items(
    item_id int AUTO_INCREMENT,
    constraint PRIMARY key(item_id),
    order_id BIGINT , 
    constraint Foreign Key (order_id) REFERENCES orders(order_id),
    product_id int , 
    constraint Foreign Key (product_id) REFERENCES products(product_id),
    quantity int DEFAULT 1,
    price int UNSIGNED not NULL
);
DESCRIBE order_items;

-- 문제 5
CREATE Table students (
    student_id CHAR(10),
    constraint PRIMARY key(student_id),
    student_name VARCHAR(30) not NULL,
    major VARCHAR(50) , 
    grade TINYINT UNSIGNED,
    enrolled_date DATE DEFAULT (CURRENT_Date)
);
DESCRIBE students;

-- 문제 6
CREATE TABLE employees(
    emp_id int AUTO_INCREMENT,
    CONSTRAINT PRIMARY KEY(emp_id),
    emp_name VARCHAR(40) NOT NULL,
    salary int UNSIGNED NOT NULL,
    hire_date DATE DEFAULT (CURRENT_Date) NOT NULL,
    department VARCHAR(50)
);

DESCRIBE employees;

-- 문제 7
create TABLE boards(
    board_id int AUTO_INCREMENT ,
    constraint PRIMARY key(board_id),
    title varchar(200) not null,
    content text not null,
    writer_id int ,
    constraint Foreign Key (writer_id) REFERENCES members(member_id),
    created_at DATETIME default now()

);
describe boards;

-- 문제 8
CREATE table comments(
    comment_id int AUTO_INCREMENT,
    CONSTRAINT PRIMARY KEY(COMMENT_id),
    board_id int,
    constraint Foreign Key (board_id) REFERENCES boards(board_id),
    writer_id int ,
    constraint FOREIGN key (writer_id) REFERENCES members(member_id),
    content varchar(300) NOT NULL,
    created_at datetime DEFAULT now()

);
DESCRIBE comment;

-- 문제 9
create table payments(
    payments_id bigint AUTO_INCREMENT,
    constraint PRIMARY KEY(payments_id),
    order_id BIGINT,
    constraint Foreign Key (order_id) REFERENCES orders(order_id),
    payment_amount int UNSIGNED NOT NULL,
    payment_method VARCHAR(30),
    payment_date DATETIME DEFAULT now()

);
DESCRIBE payments;

-- 문제 10 
create table reviews(
    review_id int AUTO_INCREMENT,
    constraint PRIMARY KEY(review_id),
    product_id int,
    constraint Foreign Key (product_id) REFERENCES products(product_id),
    member_id int,
    constraint Foreign Key (member_id) REFERENCES members(member_id),
    rating TINYINT UNSIGNED NOT NULL,
    review_text text,
    created_at DATETIME DEFAULT now()
)

DESCRIBE reviews;