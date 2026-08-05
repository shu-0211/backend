package Practice;

import java.util.Scanner;

import org.w3c.dom.css.Rect;

public class Pr7 {
    public static void main(String[] args) {

        /* 
        //문제 1
        Book b1 = new Book();
        Book b2 = new Book();
        b1.title="이것이 자바다"; b1.author="신용권"; b1.price=30000;
        b2.title="자바의 정석"; b2.author="남궁성"; b2.price=28000;
        System.out.printf("%s, %s, %d \n",b1.title,b1.author,b1.price);
        System.out.printf("%s, %s, %d \n",b2.title,b2.author,b2.price);
        */

        /*
        // 문제 2
        Pet p1 = new Pet();
        Pet p2 = new Pet();
        p1.name = "초코"; p1.species="푸들"; p1.age = 3;
        p2.name = "나비"; p2.species="코리안숏헤어"; p2.age = 5;
        System.out.printf("이름 : [%s], 종류 : [%s], 나이 : [%d]살 \n",p1.name,p1.species,p1.age);
        System.out.printf("이름 : [%s], 종류 : [%s], 나이 : [%d]살 \n",p2.name,p2.species,p2.age);
        */

        /*
        // 문제 3
        Rectangle r1 = new Rectangle();
        r1.height = 5;
        r1.width = 10;
        System.out.printf("사각형의 넓이: [%d]",(r1.height * r1.width)/2);
        */

        /*
        // 문제 4
        Scanner scan = new Scanner(System.in);
        BankAccount ba1 = new BankAccount();
        ba1.accountNumber = "111-222-3333";
        ba1.accountNumber = "유재석";
        ba1.balance = 10000;
        while(true){
            int money;
            System.out.print("입금 : 1 |  출금 : 2 | 종료 : 1,2빼고 아무숫자"); int num = scan.nextInt();
            if(num == 1){
                System.out.print("입금할 금액을 입력하세요 : "); money = scan.nextInt();
                ba1.balance += money;
                System.out.printf("입금 후 잔액 : [%d] ", ba1.balance);
                
            }
            else if(num == 2){
                // 출금액이 더 클경우는 구현 안함. 할수는 있는데 클래스 연습이므로
                System.out.print("출금할 금액을 입력하세요 : "); money = scan.nextInt();
                ba1.balance -= money;
                System.out.printf("출금 후 잔액 : [%d] ", ba1.balance);
                
            }
            else{
                return ;
            }
        }
        */

        /*
        // 문제 5
        Product p1 = new Product();
        Product p2 = new Product();
        p1.name = "새우깡"; p1.price = 1500;
        p2.name = "콜라"; p2.price = 2000;
        if(p1.price>p2.price){
            System.out.printf("%s",p1.name);
        }else{
            System.out.printf("%s",p2.name);
        }
        */

        /* 
        // 문제 6
        Member m1 = new Member();
        m1.id = "admin"; m1.isLogin = false;
        System.out.printf("로그인 전 상태 : [%b]\n",m1.isLogin);
        m1.isLogin = true;
        System.out.printf("로그인 후 상태 : [%b]",m1.isLogin);
        */

        /* 
        // 문제 7
        Televistion t1 = new Televistion();
        t1.channel = 7; t1.volume = 20;
        System.out.printf("채널 %d 볼륨 %d \n",t1.channel,t1.volume);
        t1.channel = 11; t1.volume = 2;
        System.out.printf("채널 %d 볼륨 %d",t1.channel,t1.volume);
        */


        /* 
        // 문제 8
        Player p1 = new Player();
        Player p2 = new Player();
        p1.name = "손흥민"; p1.power = 90; p1.speed = 95;
        p1.name = "이강인"; p1.power = 85; p1.speed = 92;
        if(p1.power + p1.speed > p2.power + p2.speed){
            System.out.println("손흥민 승");
        }else{
            System.out.println("이강인 승");
        }
        */

        /* 
        // 문제 9
        MenuItem m1 = new MenuItem();
        MenuItem m2 = new MenuItem();
        MenuItem m3 = new MenuItem();
        m1.name = "김치찌개"; m1.price = 8000; m1.isSignature = true;
        m2.name = "된장찌개"; m2.price = 8000; m2.isSignature = false;
        m3.name = "계란찜"; m3.price = 3000; m3.isSignature = false;
        if (m1.isSignature) {
            System.out.printf("[대표메뉴] %s : %d원\n", m1.name, m1.price);
        }

        if (m2.isSignature) {
            System.out.printf("[대표메뉴] %s : %d원\n", m2.name, m2.price);
        }

        if (m3.isSignature) {
            System.out.printf("[대표메뉴] %s : %d원\n", m3.name, m3.price);
        }
        */

        /* 
        // 문제 10 
        UserProfile u1 = new UserProfile();
        Scanner scan = new Scanner(System.in);
        System.out.print("이름를 입력하세요 "); u1.name = scan.next();
        System.out.print("나이를 입력하세요 "); u1.age = scan.nextInt();
        System.out.print("mbti를 입력하세요 "); u1.mbti = scan.next();
        System.out.println("--- 프로필 ---");
        System.out.printf("이름 : %s 나이 : %d mbti : %s ",u1.name,u1.age,u1.mbti);
        */


    }
}
/*
class Book{
    String title;
    String author;
    int price;
}

class Pet{
    String name;
    String species;
    int age;
}

class Rectangle{
    int width ; 
    int height ;
}

class BankAccount {
    String accountNumber;
    String ownerName;
    int balance;
}

class Product{
    String name ;
    int price;

}

class Member{
    String id;
    Boolean isLogin;

}

class Televistion{
    int channel;
    int volume;

}

class Player {
    String name;
    int power;
    int speed;
}

class MenuItem{
    String name;
    int price;
    Boolean isSignature;
}

class UserProfile {
    String name;
    int age;
    String mbti;
}
 */