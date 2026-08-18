-- day12 Exam2 연동

drop DATABASE if EXISTS mydb0813;
create DATABASE mydb0813;
use mydb0813;
create table board(
    no int AUTO_INCREMENT,
    content VARCHAR(255),
    writer VARCHAR(30),
    constraint PRIMARY key(no)
);
insert into board ( content , writer ) values("안녕하세요" , "유재석" ) , ( " 하하 " , "강호동"); -- 샘플 데이터 2개 