-- day12 Exam2 연동
CREATE DATABASE mydb0813;
use mydb0813;
create table test ( no int AUTO_INCREMENT PRIMARY key , name VARCHAR(30) );
INSERT INTO test (name) VALUES
('김철수'),
('이영희'),
('박민수'),
('최지우'),
('정현우'),
('강수진'),
('윤서준'),
('한지민'),
('오민재'),
('송예린');
SELECT * FROM test;