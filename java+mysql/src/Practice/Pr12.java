package Practice;

import java.util.concurrent.TransferQueue;

import javax.crypto.Mac;

public class Pr12 {
    public static void main(String[] args) {


        /* 
        // 문제 1
        Student s1 = new Student();
        s1.name = "유재석"; s1.studentId = 1;
        System.out.println(s1.name);
        System.out.println(s1.studentId);


        // 문제 2
        Cat c1 = new Cat();
        c1.makeSound();


        // 문제 3
        // 생성자 내부에는 super() 생략시 자동 , 즉 super( )키워드는 부모생성호출자를  호출
        Computer c2 = new Computer();


        // 문제 4
        Triangle t1 = new Triangle();
        Figure f1 = t1;
       



        // 문제 5
        Shape shape = new Circle();
        shape.draw();


        // 문제 6
        Vehicle vehicle = new Bus();
    

        if(vehicle instanceof Bus){
            Bus vehicle2 = (Bus)vehicle; 
            vehicle2.checkFare();
            
        }
        else {
            System.out.println("");
        }


        // 문제 7 
        Beverage[] beverages = { new Coke(), new Coffee()};
        for(int i = 0 ; i < beverages.length; i++){
            beverages[i].drink();
        }




        // 문제 8
        Character character = new Character();
        character.weapon = new Sword();
        character.use();
        character.weapon = new Gun();
        character.use();


        // 문제 9
        SuperClass obj = new SubClass();
        System.out.println(obj.name);
        obj.method();
        
        
        
        // Super가 상위 클래스 이고 subsms 하위클래스이다. 이때 super클래스 obj에 실제 
        // 인스턴스값 sub를 대입하여 업케스트가 일어났고 이때 변수는 참조변수타입을 
        // 따라가게 되어 같은 name변수지만 부모인 super클래스의 "상위"값을 가리키고 
        // 메소드는 부모가 자식의 이름이 동일 할때 재정의된 메소드를 우선하여 가르키므로
        // 자식 메소드의 출력값인 "하위 메소드 출력"이 출력되게 된다. 
        


        // 문제 10
        Laptop laptop = new Laptop();

        

        System.out.println(laptop instanceof Device);

        */
        
 



    } // main end
} // c end


/* 
// 문제 1
class Person{
    String name;
}
class Student extends Person{
    int studentId;
}



// 문제 2
class Animal {
    void makeSound(){
        System.out.println("동물이 소리를 냅니다. ");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("고양이가 야옹하고 웁니다.");
    }
}


// 문제 3 클래스 
class Machine {
    Machine(){
        System.out.println("부모 클래스 생성자 실행");
    }
}
class Computer extends Machine{
    Computer(){
        System.out.println("자식 클래스 생성자 실행");
    }
}


// 문제 4 클래스 
class Figure{
  
}
class Triangle extends Figure{
    Figure figure;
}

// Figure 클래스


// 문제 5 클래스   
// 주의할점 : 메소드 오버라이딩 할 경우 메소드 위에 @Override생략해도 생략시 자동 할당
class Shape {
    void draw(){}
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("원을 그립니다.");
    }
}

// 문제 6 클래스 
class Vehicle {
    
}
class Bus extends Vehicle{
    void checkFare(){
        System.out.println("요금을 확인합니다.");
    }
}

// 문제 7 클래스 
class Beverage{
    void drink(){
        System.out.println("음료를 마십니다.");
    }
}
class Coke extends Beverage{
    @Override
    void drink(){
        System.out.println("콜라를 마십니다.");
    }
}
class Coffee extends Beverage{
    @Override
    void drink(){
        System.out.println("커피를 마십니다.");
    }
}

// 문제 8 클래스 
class Weapon{
    void attack(){
        System.out.println("무기로 공격합니다.");
    }
}
class Sword extends Weapon{
    void attack(){
        System.out.println("검으로 공격합니다.");
    }
}
class Gun extends Weapon{
    void attack(){
        System.out.println("총으로 공격합니다.");
    }
}
class Character{
    Weapon weapon;
    void use(){
        this.weapon.attack();
    }
}

// 문제 9 클래스 
class SuperClass{
    String name = "상위";
    void method(){
        System.out.println("상위 메소드 출력");
    }
}
class SubClass extends SuperClass{
    String name = "하위";
    @Override
    void method(){
        System.out.println("하위 메소드 출력");
        
    }
}

// 문제 10 클래스 
class Device{

}
class Electronic extends Device{

}
class Laptop extends Electronic{

}
*/
