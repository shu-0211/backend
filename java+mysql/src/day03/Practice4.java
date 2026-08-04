package day03;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* 
        // 문제 1
        System.out.print("첫 번째 점수 :  ");
        int number1 = scan.nextInt();
        System.out.print("두 번째 점수 :  ");
        int number2 = scan.nextInt();
        if(number1+number2 >= 90){
            System.out.println("성공");
        }else{ System.out.println("실패");}
        */



        /* 
        // 문제 2
        System.out.print("첫 번째 정수 :  ");
        int number1 = scan.nextInt();
        System.out.print("두 번째 정수 :  ");
        int number2 = scan.nextInt();
        if(number1>number2){
            System.out.println("더 큰 수 : " + number1);
        }
        else if(number1 == number2){
            System.out.println("두수의 크기가 "+number1+"로 같습니다.");
        }
        else{
            System.out.println("더 큰 수 :" + number2);
        }
        */

        /* 
        // 문제 3
        System.out.print("아이디를 입력하세요 :"); String a = scan.next();
        System.out.print("비밀번호를 입력하세요 :"); String b = scan.next();
        if(a.equals("admin")&&b.equals("1234")){
            System.out.println("로그인 성공");
        }else{
            System.out.println("로그인 실패");
        }

        */

        /* 
        // 문제 4
        System.out.print("비밀번호를 입력하세요 :"); String pw = scan.next();
        if(pw.length() < 12 && pw.length()>=8){
            System.out.println("보안등급: 보통");
        }
        else if(pw.length()<8){
            System.out.println("'보안등급: 약함");
        }
        else{
            System.out.println("보안등급: 강함");
        }
        */

        /* 
        // 5번 
        System.out.print("주민번호를 입력하세요 :"); String a = scan.next();
        if(a.charAt(7)=='1' || a.charAt(7)=='3'){
            System.out.println("남자");
        }
        else if(a.charAt(7)=='2' || a.charAt(7)=='4'){
            System.out.println("여자");
        }
        */


        /* 
        // 문제 6
        System.out.print("점수를 입력하세요 :"); int pw = scan.nextInt();
        if(pw >= 900){
            System.out.println("A급 경품");
        }
        else if(pw > 900 && pw >= 700){
            System.out.println("B급 경품");
        }
        else if(pw > 700 && pw >= 500){
            System.out.println("C급 경품");
        }
        else{
            System.out.println("참가상");
        }
        */

        /* 
        // 문제 7
        System.out.print("역할을 입력하세요 :"); 
        String a = scan.next();
        if(a.equals("admin")){
            System.out.println("모든 기능에 접근할 수 있습니다.");
        }
        else if(a.equals("editor")){
            System.out.println("컨텐츠 수정 및 생성 기능에 접근할 수 있습니다.");
        }
        else if(a.equals("viewer")){
            System.out.println("컨텐츠 조회만 가능합니다.");
        }
        else{
            System.out.println("정의 되지 않은 역할입니다.");
        }
        */
    
        /* 
        // 문제 8
        System.out.print("나이를 입력하세요 :  ");
        int age = scan.nextInt();
        if(age>=65){
            System.out.println("3,000원");
        }
        else if(age < 65 && age >=20){
            System.out.println("10,000원");
        }
        else if(age >= 8 && age <= 19){
            System.out.println("5,000원");
        }
        else{
            System.out.println("무료");
        }
        */

        /* 
        // 문제 9
        System.out.print("점수를 입력하세요 :  ");
        int a = scan.nextInt();
        if(a >= 90){
            System.out.println("A등급");
        }
        else if(a < 90 && a >=80){
            System.out.println("B등급");
        }
        else if(a < 80 && a >= 70){
            System.out.println("C등급");
        }
        else{
            System.out.println("재시험");
        }
        */


        /* 
        // 문제 10
        System.out.println("구매금액: ");
        int num10 = scan.nextInt();
        if(num10 >= 50000){
            System.out.printf("%d 원", (int)(num10 * 0.9));
        }else if(num10 >= 30000 && num10 <50000){
            System.out.printf("%d 원", (int)(num10 * 0.95));
        }else if(num10 >= 10000 && num10 < 30000){
            System.out.printf("%d 원", (int)(num10 * 0.99));
        }else{
            System.out.println("할인 없음");
        }
        */

        /* 
        // 문제 11
        System.out.println("월입력: ");
        int month11 = scan.nextInt();

        if(month11>=3 &&month11<=5){
            System.out.println("봄 ");
        }else if(month11>=6 &&month11<=8){
            System.out.println("여름");

        }else if(month11>=9 &&month11<=11){
            System.out.println("가을");
        }else if(month11==12 || month11 ==1 || month11 ==2){
            System.out.println("겨울");

        }else{
            System.out.println("잘못된 월입니다");

        }
        */


        /* 
        // 문제 12
        System.out.println("1 입력");
        int num121 = scan.nextInt();
        System.out.println("2 입력");
        int num122 = scan.nextInt();
        System.out.println("3 입력");
        int num123 = scan.nextInt();

        int result12 = num121;
        if(num122 > result12){
            result12 = num122;
        }
        if(num123 > result12){
            result12 = num123;
        }

        System.out.println(result12);
        */

        /* 
        // 문제 13
        System.out.print("년도를 입력하세요 :  ");
        int number1 = scan.nextInt();
        if(((number1 % 4 == 0)&&(number1%100!=0)) || (number1 % 400 == 0) ){
            System.out.printf("%d년은 윤년입니다.", number1);
        }else{
            System.out.printf("%d년은 윤년이 아닙니다. ",number1);
        }
        */

        /* 
        // 문제 14
        System.out.print("첫 번째 정수 :  ");
        int a = scan.nextInt();
        System.out.print("두 번째 정수 :  ");
        int b = scan.nextInt();
        System.out.print("세 번째 정수 :  ");
        int c = scan.nextInt();
        if(a>b){
            if(a>c){   // (a : b)
                if(b>c){
                    System.out.printf("%d %d %d", a,b,c);
                }else{
                    System.out.printf("%d %d %d", a,c,b);
                }
            
            }else{
                System.out.printf("%d %d %d", c,a,b);
            }

        }else{
            if(b>c){
                if(c>a){
                    System.out.printf("%d %d %d", b,c,a);
                }else{
                    System.out.printf("%d %d %d", b,a,c);
                }
            }else{
                System.out.printf("%d %d %d", c,b,a);
            }
            
        }
        */


        /* 
        // 문제 15
        System.out.print("플레이어1 (0:가위 1:바위 2:보) :  ");
        int a = scan.nextInt();
        System.out.print("플레이어2 (0:가위 1:바위 2:보) :  ");
        int b = scan.nextInt();
        if((a+2)%3== b){
            System.out.println("플레이어 1 승리");
        }
        else if(a==b){
            System.out.println("비겼습니다");
        }
        else{
            System.out.println("플레이어 2 승리");
        }
        */



    }
}
