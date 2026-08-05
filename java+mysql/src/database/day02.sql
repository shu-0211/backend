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

alter table test1 MODIFY 필드명3 longtext;
    

alter table test1 CHANGE 필드명1 필드명5 bigint;

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
