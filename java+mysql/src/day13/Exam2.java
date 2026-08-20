package day13;

import java.rmi.registry.LocateRegistry;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exam2 {
    public static void main(String[] args) {
        

        // [1] 래퍼 클래스 : 기본타입 --> 참조타입 표현 , 참조타입은 상태/기능 갖는다.
        int value1 = 100;           // System.out.println( value1.toString );
        Integer value2 = 100;       System.out.println( value2.toString() );

        // 즉 기본타입은 기능이 없으니까 참조타입으로 변환해서 기능사용하자 
        // 1. 언박싱과 오토박싱
        int value3 = value2;            // Integer(참조)  --> int (기본)  변환  <언박싱>
        Integer value4 = value1;        // int(기본)  -->  Integer(참조) 변환  <오토박싱>
        // 이전에 했던 DTO : 포장(래퍼), 정보가 많아서 처리하기 편하려고

        // 2. 타입변환(csv, excel , api , python, json, xml 등등 )
        //  xxxx.parseXXX("문자열")  ,  유사(JDBC) : rs.getXXX ( )
        // 
        int value5 = Integer.parseInt("100");
        System.out.println(value5+5);
        double value6 = Double.parseDouble("3.14");
        boolean value7 = Boolean.parseBoolean("true");

        // 기본타입 -> 문자열
        String s1 = 100+"";    // 공백없이 문자열 더하기  100 -> "100"
        String s2 = String.valueOf(100);

        // [2] 날짜/시간 클래스
        // 1. 현재 날짜 가져오기 
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        // 2. 현재시간 가져오기 
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        // 3. 현재 날짜/시간 가져오기 
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        
        // 4. 정해진 날짜/시간 객체 생성
        LocalDateTime localDateTime2 = LocalDateTime.of( 2026, 8, 19 , 11, 11, 30);
        System.out.println(localDateTime2);

        // 5. 정해진 형식으로 날짜/시간 표현
        // 패턴: y연동 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y년mm월d일 hh시mm분 55초");
        System.out.println(localDateTime2.format(formatter));

        // 6. 날짜 계산, 날짜 /시각 객체 .plusXXX
        LocalDateTime result1 = localDateTime2.plusDays(20);
        System.out.println(result1);        // 2026-09-08T11:11:30
        LocalDateTime result2 = localDateTime2.minusDays(20);
        System.out.println(result2);        // 2026-07-30T11:11:30

        // 7. 특정한 날짜/시간 추출
        System.out.println(localDateTime2.getYear());   // 연도
        System.out.println(localDateTime2.getMonthValue());    // .getMonth() 영문 , .getMonthValue ( ) 정수
        System.out.println(localDateTime2.getDayOfMonth());  // 19(일)
        System.out.println(localDateTime2.getSecond());   // 30초

    }
}
