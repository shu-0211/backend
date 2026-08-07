// 클래스랑 메인메서드에 코드들 주석처리 했습니다. 

package Practice;

import java.util.Scanner;

public class Pr10 {
    public static void main(String[] args) {
        
        /*
        // 문제 1
        Member m1 = new Member();
        m1.setId("admin");
        System.out.println(m1.getId());


        // 문제 2
        Score s1 = new Score();
        s1.setScore(85);
        System.out.println(s1.getScore());
        s1.setScore(120);
        System.out.println(s1.getScore());


        // 문제 3
        BankAccount b1 = new BankAccount("123-456");
        System.out.println(b1.getAccountNumber());


        // 문제 4
        Scanner scan = new Scanner(System.in);
        CircleCalculator c1 = new CircleCalculator();
        System.out.print("반지름를 입력하세요 : ");
        c1.setRadius(scan.nextInt());
        c1.printCircleArea(c1.getRadius());


        // 문제 5
        TicketMachine machine1 = new TicketMachine();
        TicketMachine machine2 = new TicketMachine();
        TicketMachine machine3 = new TicketMachine();
        machine1.issutTicket();
        machine1.issutTicket();
        machine2.issutTicket();
        machine3.printTotalTickets();
        TicketMachine.printTotalTickets();



        // 문제 6
        GameConfig.printConfig();
        */
    }
}


/*
class Member{
    private String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

class Score{
    private int score;

    public void setScore(int score){
        if( score <=100 && score >= 0){
            this.score = score;
        }
        else{
            System.out.println("유효하지 않은 점수입니다.");
        }
    }

    public int getScore(){
        return this.score;
    }
}

class BankAccount{
    private final String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

}

class CircleCalculator{
    private final double PI = 3.141592;
    private int radius;

    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return this.radius;
    } 
    public void printCircleArea(int radius){
        System.out.println(radius*radius*this.PI); 
    }
}

class TicketMachine {
    static int totalTickets = 0;

    public void issutTicket(){
        System.out.println("티켓 1장을 발권했습니다.");
        this.totalTickets += 1;
    }

    public static void printTotalTickets(){
        System.out.printf("현재까지 발권된 티켓 : %d\n",totalTickets);
    }
}

class GameConfig{
    public static final int MAX_LEVEL = 99;
    public static final int MAX_HP = 10000;
    public static final String GAME_TITLE = "My RPG";

    public static void printConfig() {
        System.out.println("게임 이름 : " + GAME_TITLE);
        System.out.println("최대 레벨 : " + MAX_LEVEL);
        System.out.println("최대 HP : " + MAX_HP);
    }
     
    /*   폐기 
    @Override
    public  String toString(){
        return "GAME_TITLE : " + GAME_TITLE + "MAX_LEVEL : " + MAX_LEVEL + "MAX_HP : " + MAX_HP;
    }
    */
}
*/