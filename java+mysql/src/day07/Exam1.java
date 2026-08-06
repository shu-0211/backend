/*
 메소드 
    1) 클래스 내부선언
    2) 목적 : 재사용 , 인수에 따른 서로 다른 결과물 반환
    3) 선언 
        반환타입 메소드명 ( 타입 매개변수){
            return 반환값
        }
        - 반환타입 : 반환값의 타입/  자료형 일치
        - 메소드명 : 소문자 시작하는 카멜표기법
        - 타입 매개변수 : 함수호출 하는 곳으로 전달받느 값 타입 일치!!
        - { } : 함수호출시 실행할 코드 
        - return : 함수종료시 반환되는 값
    4) 호출 : 다양한 기준 
        1. 서로 다른 클래스에서 메소드 호출시 인스턴스(객체)필요
            주체 : this ( 특정 메소드/ 생성자 호출한 객체 )
            객체 변수명.메소드명();
        2. 동일한 클래스내 메소드 호출시 인스턴스 필요없음. *
*/





package day07;

public class Exam1 {
    public static void main(String[] args) {
        계산기 나만의계산기 = new 계산기();
        double pi = 나만의계산기.getPI();

        나만의계산기.powerOn();
        나만의계산기.printSum(10, 5);
        int result = 나만의계산기.add(100, 240);

        사람타입 p1  = new 사람타입("강호동");
        사람타입 p2  = new 사람타입("유재석");

        p1.취업성공("개발자");
        System.out.println(p1.job);
        System.out.println(p2.job);


        // ** 객체지향 --> 인공지능 ( 뉴런 / 세포 )
        
    }
}


class 계산기 {
    // 1. 맴버변수
    // 2. 생성자 
    // 3. 메소드/함수
    // 1) 매개변수 x 반환값 0
    double getPI(){
        return 3.14;
    }
    void powerOn(){
        System.out.println("ON");
        return;
    }
    void printSum( int x , int y){
        System.out.println(x+y);
    }
    int add(int x , int y){
        // 동일한 클래스내 다른메소드호출
        printSum(x, y);
        return x+y;
    }
}


class 사람타입 {

    String name;
    int age;
    String job;

    사람타입 (String name){
        this.name = name;
        age = 1;
    }
    void 취업성공(String 취업한직업){
        this.job = 취업한직업;
    }
}
