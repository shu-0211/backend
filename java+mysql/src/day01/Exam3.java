/* 
package day01;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        //[1] 출력함수
        // System(클래스).out (출력객체) .print(출력함수)
        // 1. System.out.println(); 출력 후 줄바꿈 처리 
        
        System.out.println("자바안녕1");
        System.out.print("자바안녕2"); // 줄바꿈 안함

        // \n : 줄바꿈 , \t  : 들여쓰기 , \' , \" , \\ 
        System.out.println("\n자바안녕\t\'\"");

        // 3. System.out.printf( "형식" , "자료" )
        // %d : 정수가 들어갈 자리 , %s 문자열이 들어갈 자리 , %c  : 문자가 들어갈 자리 , %f : 실수가 들어갈 자리
        // %자릿수 d : 자릿수 만큼 자리 차지 , 만일 비어있으면 공백 , 오른쪽 정렬
        // % -자릿수 d : 자릿수 만큼 자리 차지 , 만일 비어있으면 공백 , 왼쪽 정렬
        // % 0자릿수 d : 자릿수 만큼 자리 차지 , 만일 비어있으면 공백 , 0채움
        // % 전체자릿수.소수자리f :
        System.out.printf("저는 %s 이고 나이는 %d 입니다.","서현욱" , 25);
        System.out.printf("\n저는 %s이고 나이는 %6d\n","유재석" ,40);
        System.out.printf("\n저는 %s이고 나이는 %-6d\n","유재석" ,40);
        System.out.printf("\n저는 %s이고 나이는 %06d\n","유재석" ,40);
        System.out.printf("\n저는 %-6s이고 나이는 %5.2f\n","유재석" ,123.456789);
        

        // [3] 입력 객체 / 함수
        // 1. Scanner : SC + 엔터 , *코드파일 상단에 import.util.Scanner; 자동추가 확인 * (해당 폴더에서 클래서ㅡ)
        // 2. scanner : 관례적으로 ( 클래스명은 대문자로 시작 ) 클래스명의 소문자로 변수명 설정
        // 3. = 대입 
        // 4. new : 인스턴스화 , 해당 클래스로 객체 만든다 뜻
        // 5. Scanner ( System.in ) : 생성자 ( 클래스명 동일) 안에 시스템입력 (System.in) 객체
        Scanner scanner = new Scanner(System.in);

        // 6. 입력함수 : scanner.nextXXX(); : 터미널(콘솔) 창에서 아무거나 입력 후 엔터 기준으로 마침.
        System.out.print("2) 이름 입력:");
        String str = scanner.next();

        // 7. scanner.nextInt() : 터미널(콘솔) 에서 입력받은 자료 (정수)변환        
        System.out.print("2) 나이 입력: ");
        int number = scanner.nextInt();
        
        System.out.printf("이름은 %s이고 나이는 %d 입니다.",str,number);
    }    
}

*/
