package day02;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /* 
        //문제 1
        System.out.print("국어 점수 :");
        int a = scan.nextInt();
        System.out.print("영어 점수 :");
        int b = scan.nextInt();
        System.out.print("수학 점수 :");
        int c = scan.nextInt();
        System.out.println("총점 : "+(a+b+c));
        System.out.println("평균 : "+(float)(a+b+c)/3.0f);
        */

        /* 
        // 문제 2
        
        System.out.print("반지름을 입력하세요 :");
        double r = scan.nextDouble();
        System.out.printf("원의 넓이 : %f",(r*r*3.14));
        */

        /* 
        // 문제 3
        System.out.print("첫번째 수를 입력하세요 :");
        double a = scan.nextDouble();
        System.out.print("두번째 수를 입력하세요 :");
        double b = scan.nextDouble();
        System.out.printf("비율 : %f%%",(a/b *100));
        */

        /* 
        //문제 4
        System.out.print("숫자를 입력하세요 : ");
        int number = scan.nextInt();
        if(number%2 == 0 ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        // System.out.println(number % 2 == 1)
        */

        /* 
        // 문제 5
        System.out.print("정수를 입력하세요 :");
        int a = scan.nextInt();
        System.out.println("결과 : "+ (a % 7 == 0));
        */

        /* 
        // 문제 6
        System.out.print("아이디를 입력하세요 :"); String a = scan.next();
        System.out.print("비밀번호를 입력하세요 :"); String b = scan.next();
        boolean aa = a.equals("admin");
        boolean bb = b.equals("1234");
        System.out.println(aa && bb);
        */

        /* 
        //문제 7
        System.out.print("정수를 입력하세요 : ");
        int number = scan.nextInt();
        System.out.println((number%2==1) && (number % 7 == 0));
        */

        /* 
        // 문제 8 
        System.out.print("1차점수 : ");
        int number1 = scan.nextInt();
        System.out.print("2차점수 : ");
        int number2 = scan.nextInt();
        System.out.println((number1+number2 >= 150)?"결과 : 합격":"결과 : 불합격");
        /* */


        /* 
        // 문제 9
        System.out.print("이름을 입력하세요 :"); String a = scan.next();
        System.out.println(  a.equals("유재석") ? "유재석(방장)" : a  );
        */
        

        /* 
        // 문제 10 
        System.out.print("삼각형의 밑변을 입력하세요 : ");
        double number1 = scan.nextDouble();
        System.out.print("삼각형의 높이를 입력하세요 : ");
        double number2 = scan.nextDouble();
        System.out.printf("삼각형의 넓이 : %.1f",number1*number2/2);
        */

        /* 
        // 문제 11
        System.out.print("섭씨온도를 입력하세요 : ");
        double number1 = scan.nextDouble();
        double result = (number1*9.0 / 5.0 )+32 ;
        System.out.printf("화씨 온도 : %f",result);
        */


        /* 
        // 문제 12
        System.out.print("태어난 년도:  ");
        int number1 = scan.nextInt();
        System.out.printf("2026년 기준 나이 : %d",2026-number1+1);
        */


        /* 
        // 문제 13
        System.out.print("키(CM) : ");
        double number1 = scan.nextDouble();
        System.out.print("몸무게(Kg) : ");
        double number2 = scan.nextDouble();
        System.out.printf("BMI 지수 : %f",number2/((number1/100)*(number1/100)));
        */

        /* 
        // 문제 14
        System.out.print("아이디를 입력하세요 :"); String a = scan.next();
        System.out.print("이메일를 입력하세요 :"); String b = scan.next();
        System.out.printf("결과 : %s", (a.equals("admin") || b.equals("admin@test.com")) ? "관리자" : "일반 사용자");
        */


        /* 
        // 문제 15
        System.out.print("점수를 입력하세요 :  ");
        int number1 = scan.nextInt();
        System.out.printf("등급 %c" , number1 >= 90 ? 'A' : number1>=80 ? 'B' : 'C');
        */

        /* 
        // 문제 16
        System.out.print("나이를 입력하세요 :  ");
        int number1 = scan.nextInt();
        System.out.printf("%s", 29 >= number1 && number1 >= 20 ? "이벤트 대상입니다." : "이벤트 대상이 아닙니다.");
        */


    }
}
