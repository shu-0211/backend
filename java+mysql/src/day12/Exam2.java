package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Exam2 {
    public static void main(String[] args) {

        // JDBC란 ? 자바와 데이터베이스 연동 제공하는 인터페이스 
        // [준비] 프로젝트내 lib 폴더에 'mysql-connector-j-26.7.0.jar' 파일을 저장한다.
        // [연동]
        // [1] mysql 회사에서 제공하는 Driver 구현체 (동적) 로드 * 예외처리 필수 *
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver 연동성공");

            // [2] 데이터베이스 서버연동 * 예외처리 필수 *
            // DriverManager.getConnection( "jdbc:mysql://ip번호:3306/데이터베이스명" , "계정명" , "비밀번호" )
            String url = "jdbc:mysql://127.0.0.1:3306/mydb0813";
            String user = "root"; String password = "1234";
            Connection conn = DriverManager.getConnection(url,user,password);

            // [3] 데이터베이스 내 DML(insert, select, update, delete)
            //  1. insert 하기  - insert into 테이블명 ( 필드명 ) values(값)
            String sql = "insert into test( name ) values( '유재석' )"; // 자바 문자열에 sql작성( 자동완성 안됨. )
            PreparedStatement ps = conn.prepareStatement(sql);  
            // conn(연동된인터페이스).prepareStatement( 기재할 SQL )
            
            // PreparedStatement ( SQL이 기재된 인터페이스 )
            int result = ps.executeUpdate(); //  ps.executeUpdate // ps (SQL 기재된인터페이스에서 SQL 실행)
            System.out.println(result); // 1: 성공 0 : 
            System.out.println("레코드 등록성공");


            // 2. select 하기 - select 필드명 from 테이블명 ; 
            String sql2 = "select * from test";
            PreparedStatement ps2 = conn.prepareStatement(sql2); // 작성한 SQL 기재한다. 
            ResultSet rs = ps2.executeQuery(); // 기재된 SQL 실행, 결과를 rs(ResultSet) 인터페이스 대입
            rs.next();    // 조회결과 다음레코드로 이동
            System.out.println(rs.getInt("no"));  // rs.get타입("속성명")
            System.out.println(rs.getString("name"));  // rs.get타입 ( "속성명 ");

            
            // 3. delete 하기 
            String sql3 = "delete from test";
            PreparedStatement ps3 = conn.prepareStatement(sql3);
            result = ps3.executeUpdate();
            System.out.println("삭제된 레코드 수 : " + result);
            


        }catch( ClassNotFoundException e){
            System.out.println("Driver(클래스) 가 존재하지 않습니다." + e);
        }catch( SQLException e){
            System.out.println("DB서버와 연동실패 " + e );
        }


    
    } // main end
}
