package Practice;

import java.util.PrimitiveIterator;

import javax.swing.JTable.PrintMode;

import java.text.DecimalFormat;

import day02.practice1;

public class Pr9 {
    public static void main(String[] args) {
        
        // 문제 1
        PrintMessage print = new PrintMessage();
        print.PM();

        // 문제 2
        Greeter g1 = new Greeter();
        g1.greet("서현욱");
        System.out.println();
        
        // 문제 3
        SimpleCalculator s1 = new SimpleCalculator();
        System.out.println(s1.add(10, 34));


        // 문제 4
        Checker c1 = new Checker();
        boolean c ;
        c = c1.isEven(7);
        if(c){
            System.out.println("짝수입니다");
        }else { System.out.println("홀수 입니다"); }

        // 문제 5
        Lamp l1 = new Lamp();
        System.out.println(l1.isOn);
        l1.turnOn();
        System.out.println(l1.isOn);
        l1.turnOff();
        System.out.println(l1.isOn);

        // 문제 6
        Product p1 = new Product("핫식스", 10);
        p1.sell(5);
        p1.sell(4);
        p1.sell(6);

        // 문제 7
        Visualizer v2 = new Visualizer();
        v2.getStar(10);

        // 문제 8
        System.out.println();
        ParkingLot p2 = new ParkingLot();
        p2.calculateFee(65);
        p2.calculateFee(140);
        p2.calculateFee(405);
        p2.calculateFee(10);
        p2.calculateFee(500);



    } // main end 
}

class PrintMessage{
    void PM(){
        System.out.println("안녕하세요 메소드입니다.");
    }
}

class Greeter{
    String name;
    /* 
    Greeter(String name){
        this.name = name;
    }
    */

    void greet(String name){
        System.out.printf("안녕하세요, [%s]님!", name);
    }
}

class SimpleCalculator{
    int a;
    int b;
    int add (int a, int b){
        return a+b;
    }
}

class Checker {
    int a;
    Boolean b;
    Boolean isEven(int a){
        if(a % 2 == 0){
            this.b = true;
            return this.b;
        }
        else{
            this.b = false;
            return this.b;
        }
    }
}

class Lamp {
    boolean isOn;
    void turnOn(){
        isOn = true;
    }
    void turnOff(){
        isOn=false;
    }
}

class Product{
    String name;
    int stock;

    

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }



    boolean sell(int stock){
        if(this.stock >= stock){
            this.stock  -= stock;
            System.out.printf("남은수량 %d\n",this.stock);
            return true;
        }
        else{
            System.out.println("재고가 부족합니다.\n");
            return false;
        }
    }
}

class Visualizer{
    void getStar(int a){
        for(int i = 1; i <= a ; i++){
            System.out.print("★ ");
        }
    }
}

class ParkingLot{
    void calculateFee(int a){
        if(a >= 30){
            // 10분마다 안하고 그냥 1분마다로함
            a -= 30;
            a *= 50;
            a += 1000;
            if(a > 20000){ a = 20000;  System.out.println("20,000원");}
            else { 
                DecimalFormat df = new DecimalFormat("#,###");
                String result = df.format(a);
                System.out.printf("%s원\n",result);
            }
        }
        else{System.out.println("1,000원");}
    }
}
