-- DB 특징 : 실시간접근 , 동시 공유 , 데이터 참조 , 지속적인 변화
-- 종류 : 1. 관계형 데이터베이스(SQL) , 2. NOSQL  3.
/*
[SQL] : 관계형 데이터베이스 데이터를 조작/제어 하기 위한 표준 언어
1. DDL 데이터 정의 어   : create ~ , drop ~ , 
2. DML 데이터 조작 어   : 테이블 내 데이터들을 조작 
3. DCL 데이터 제어 어   : 데이터베이스 접근 권한  /  계정관리
4. TCL 트랜잭션 제어 어 : DML 실행 결과를 취소/적용     (정처기 필기에 한문제는 나옴 )

*/
# [1] 데이터베이스 삭제 
drop DATABASE if EXISTS mydb0805; #[1] 데이터 베이스 삭제 # ctrl +엔터

CREATE DATABASE mydb0805;   #[2] 데이터 베이스 생성

SHOW DATABASES;    # [3]  데이터 베이스 목록

use mydb0805;   # [4]  데이터 베이스 선택 / 서버에는 여러가지 데이터 베이스가 존재하므로 사용할 dB를 선택해줘야됨. 

#---------------------------------------------------------------------------#
# DDL  : 데이터베이스 / 테이블 생성 / 삭제 / 수정 / 수정 질의어 ( ** RollBack 이 안됨. /  auto commit ) 트랜잭션 불가능함. 

# 1) 테이블 생성 : 1. 테이블 생성할 데이터베이스 활성화 2) create table 테이블명 ( 속성명 타입, 속성명 타입 ....);
CREATE Table if test1 ( 필드명1 int , 필드명2 DOUBLE , 필드명3  TEXT);

# 2) 테이블 목록 조회
SHOW TABLES

# 3) 특정 테이블 속성 확인
DESCRIBE test1;

# 4) 특정 테이블 삭제 
DROP Table test1;

# 5) 테이블 수정 
# 1) 필드/속성 추가 
alter table test1 add 필드명4 float;
# 2) 필드/속성의 타입 수정 
alter table test1 modify 필드명3 longtext;
# 3) 필드/속성명 , 타입 수정
alter table test1 change 필드명1 필드명5 bigint;

#

# 6) 테이블 이름 변경 
RENAME TABLE test1 to new_test1;
#-------------------------------#
# 테이블의 속성/필드 타입 * DBMS 회사마다 차이 *

use mydb0805;
-- CREATE Table test2(필드명 타입 , 필드명 타입 , 필드명 타입 );

CREATE Table test2(
    정수필드1 TINYINT , 정수필드2 SMALLINT , 정수필드3 MEDIUMINT , 
    정수필드4 int     , 정수필드5 BIGINT   , 정수필드6 int UNSIGNED,
    -- UNSIGNED 부호없음. TINYINT ( 1바이트 -128 ~ 127 ) --> 0~225개 
    실수필드1 FLOAT   , 실수필드2 DOUBLE   , 실수필드3  DECIMAL ,
    -- decimal 문자타입 이며서 소수점 오차 없음
    날짜필드1 DATE  , 시간필드 TIME ,   날짜시간필드 DATETIME,
    문자필드1 CHAR(3) ,  문자필드2 VARCHAR(3)  ,  문자필드3 TEXT , 문자필드4 longtext  ,
    -- char(문자길이 / 고정길이 ) vs VARCHAR( 문자 가변 길이 )
    -- 첨부파일 저장시 : 4G 가능한 longtext 권장
    논리필드 BOOLEAN   --  논리 필드는 tinyint형으로 저장됨.
)


DESCRIBE test2


# ========================================================================================  #
# 속성 / 필드 제약조건

CREATE Table test3(
    필드명1 TINYINT not null , -- 해당 필드 / 속성 에는 null 저장할 수 없도록 설정 * 같이 null 이면 오류 발생
    필드명2 SMALLINT UNIQUE , -- 해당 필드 / 속성에는 중복값을 저장할 수 없도록 설정 * 값이 다른 레코드와 같다면 BIGINT
    필드명3 int DEFAULT 100 , -- 해당 필드 / 속성에 레코드(행) 추가시 기본값 10 대입된다.
    필드명4 DATETIME DEFAULT now(), -- 레코드 삽입시 현재 날짜 시간/ now() 자동대입
    필드명5 BIGINT AUTO_INCREMENT , 
    constraint PRIMARY key( 필드명5 ) -- 특정 필드 / 속성을 pk로 설정한다. 
    -- 레코드(행) 삽입 시 자동으로 순서번호 대입됨.  ,  1 2 3 4 5 6 7 BIGINT
    -- PRIMARY key(pk) : 기본/식별 키 , 식별가능한 고유 한 값 갖는 필드 ( not null + unique 내장됨)
    -- 학번 , 사번 , ~~ 코드 / 번호 등등 BIGINT
    -- foreign key (fk) : 참조/ 외래 키 (pk가 다른테이블에 위치한 경우 fk라고도 함. )
    -- 수강신청한학번 , 급여지급사번  ,   판매된 제품코드
    -- 참조 옵션 : PK가 삭제 / 수정된 경우 FK는 어떻게 관리하냐
        -- on delete(같이 삭제 ) / update casecade  -> PK가 삭제/수정되면 FK도 같이 삭제/ 수정 
        -- ondelete/update  set null                -> PK가  삭제 / 수정되면 FK는 null 으로 수정
        -- on delete / update restrict              -> (생략시 기본값) pk가 fk로 부터 참조중이면 삭제 / 수정 불가능 
)

create table test4 ( 
    필드명1 BIGINT , 
    constraint FOREIGN key(필드명1) REFERENCES test3(필드명5) on delete CASCADE
)


-- cscode

# 예제 1 회원제 게시판 ------------------------------------------------------------------- #
# 1) 데이터베이스 생성한다. 

drop DATABASE if EXISTS boardService0805; # 1) 데이터 베이스 존재하면 삭제한다. 

CREATE DATABASE boardService0805; # 2) 데이터베이스 생성한다. 
USE boardService0805; # 3) 데이터베이스 활성화한다. 

CREATE Table member (         # 4)  회원테이블 생성한다. 
    mno INT AUTO_INCREMENT , -- 자동회원번호 BIGINT
    constraint PRIMARY key ( mno ) , -- 회원번호를 pk 로 설정 BIGINT
    mid VARCHAR(30) not NULL UNIQUE , -- 회원아이디 이면서 최대 30글자 , 공백불가능 , 중복 불가능 
    mpwd VARCHAR(20) not NULL , -- 회원비밀번호 이면서 최대 20글자 , 공백불가능 , 종복 가능 설정
    mname VARCHAR(10) not NULL , -- 회원닉네임
    mdate DATETIME DEFAULT now() -- 회원가입날짜/시간 자동으로 기본값 설정 
    -- 레코드 삽입/시간 수정날짜/시간을 넣어서 유지보수 함

);

Create table board (   -- # 5)
    bno INT AUTO_INCREMENT,
    constraint PRIMARY KEY ( bno ),  -- 게시물번호 Pk 설정 * 테이블 1개당 pk 1개 이상 권장 *
    btitle VARCHAR(255), -- 게시물 제목 BIGINT
    bcontent longtext , 
    -- 게시물 내용 , 대용량(사진)포함한 최고 4GBYte
    bdate datetime DEFAULT now(), 
    -- 회원가입날짜/시간 , 현재 날짜/ 시잔 B
    bview int DEFAULT  0 ,
    mno int , -- 작성자 ( mid / 회원아이디가 아니고  mno / 회원번호 ) , 관례적ㅇ로 Pk-Fk빌드명
    constraint FOREIGN key(mno) REFERENCES member(mno) 
        on delete CASCADE -- 회원이 삭제 / 탈퇴하면 그 회원이 작성한 작성된 갑여로
);