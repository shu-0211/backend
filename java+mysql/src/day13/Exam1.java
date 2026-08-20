package day13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exam1 {
    public static void main(String[] args) {
        /* 
        // 모든 자료들은  Object타입 변수에 대입 가능 
        // 1. toString( ) : 객체의 주소값을 반환해줌  ,  생략가능 , 활용처 : 오버라이딩 이용한 맴버변수 확인
        System.out.println();
        Object o6 = new Object();

        String str1 = "유재석"; String str2 = new String("유재석");
        System.out.println(str1 == str2);
        System.out.println(str1=="유재석");   // 리터럴 문자열 == 리터럴 문자열
        System.out.println(str2=="유재석");   // 객체 ( 리터럴 문자열 ) == 리터럴 문자열
        System.out.println(str2.equals("유재석"));

        // 3. hashCode( ) : 객체를 식별하는 값을 정수로 반환 함수 , * 주소값은 16진수 * 사람은 10진수
        // 활용처 : 객체 탐지하는 경우에 주소값이 아닌 정수로된 값(키) 비교하여 속도 향상
        System.out.println(o6.hashCode());
        System.out.println("유재석".hashCode());
        System.out.println(str1.hashCode());

        // [2] Class : 클래스의 정보( 맴버변수/메소드/생성자 ) 담는 클래스
        // 1. getClass( )
        String obj1 = new String();     Class c1 = obj1.getClass();
        System.out.println(c1);         // class java.lang.String // 패키지명과 클래스명 확인

        // 2. class.forName( "패키지명.클래스명" ), * 일반예외 필수 *
        // *** 리플렉션 *** : 최초실행(컴파일)할 때 객체 생성하지 않고 실행 도중에 객체 동적 생성
        // 활용처 : JDBC(프로그램시작이 아닌 DB 연동시 MYSQL관련 클래스로드), 스프링프레임워크( IOC )
        try {Class.forName("java.lang.String");}
        catch(ClassNotFoundException e){System.out.println( e );}


        // 3. .getField( ) : 클래스내 맴버변수 정보 반환
        Field[ ] fields = c1.getFields();
        for(Field field : fields){System.out.println(field);}

        // 4. getConstructors ( ) : 클래스내 생성자 정보 반환
        Constructor[] constructors = c1.getConstructors();
        for( Constructor constructor : constructors){System.out.println(constructor);}

        // 5. 클래스내 메소드 정보 반환
        Method[] methods = c1.getMethods();
        for(Method method : methods){System.out.println(method);}
        */
        LocalDateTime localDateTime1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ymmdhhmm");
        System.out.println(localDateTime1.format(formatter));

        String str1 = "유재석";
        
 
    }
}
