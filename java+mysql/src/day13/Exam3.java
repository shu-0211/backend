package day13;

import java.util.Arrays;

public class Exam3 {
    public static void main(String[] args) {
        
        // String 클래스
        // 1. 문자열은 배열이다. 
        char str1 = '유'; // char 타입 ( ' ' )은 1글자만 가능
        char[] str2 = {'유','재','석'}; // char 타입의 배열
        String str3 = "유재석"; // String 클래스는 배열의 맴버변수가짐

        // 2. 문자변환
        char str4 = 65;
        System.out.println(str4);
        char[] str5 = { 74, 65, 86, 65 };
        System.out.println(str5);
        char str6 = '유'; System.out.println((int)str6);


        // 3. 문자열 비교 
        System.out.println("유재석" == "유재석"); // true
        System.out.println( new String("유재석" ).equals("유재석"));
        System.out.println(new String("유재석") ==  "유재석");

        // 4. 문자열A.concat(문자열B) , 문자열 연결 , 연결된 새로운 문자열을 반환 ( 주소값이 새롭게 생김 )
        String str7 ="자바";    String str8 = "프로그래밍";
        System.out.println(str7.concat(str8));
        System.out.println(str7+str8);


        // 5. StringBuilder , append( ) 문자열은 (수정금지)불변이다. 
        // builder는 빌더주소를 1개 지정하여 새로운 문자열들을 연결할 수 있다. 
        StringBuilder builder = new StringBuilder();
        builder.append(str7);
        builder.append(str8);
        System.out.println(builder);

        // 6. .ChatAt( 인덱스 )  , 문자 1개 추출
        String str9 = "자바프로그래밍";     System.out.println(str9.charAt( 2 ));  // 

        // 7. .length() : 문자열내 문자 개수 반환
        System.out.println(str9.length());

        // 8. .replace( )
        System.out.println(str9.replace("자바", "JAVA"));


        // 9. subString( )
        String str10 = "012345-1230123";
        System.out.println(str10.substring(6));
        System.out.println(str10.substring(0, 6)); //  0부터 6전까지

        // 10. .split( 기분문자 ) , 기준문자 기준으로 문자열 분해하여 배열로 반환
        System.out.println( str10.split("-"));
        String[ ] strAry = str10.split("-");   // [0] 012345 , [1] 1230123
        System.out.println(strAry[0]);
        System.out.println(strAry[1]);

        // 11.  .indexOf( 찾을문자 ) , 만일 찾을 문자가 존재하면 인덱스 없으면 -1
        //      .contains( 찾을 문자 ) , 만일 찾을 문자가 존재하면 true , 없으면 false
        System.out.println("자바 프로그래밍 언어".indexOf("프로"));
        System.out.println( "자바 프로그래밍 언어".contains("프로")); // true

        // 12. .getBytes() , 문자열내 문자들을 바이트 배열 반환  * 파일처리 / 네트워크 등 외부 통신*
        byte[] strAry2 = "ABC".getBytes();
        System.out.println(Arrays.toString(strAry2)); // "ABC" --> [65 , 66 , 67]
        System.out.println(new String(strAry2));


    }
}
