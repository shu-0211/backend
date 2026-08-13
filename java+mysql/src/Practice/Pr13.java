package Practice;

public class Pr13 {
    public static void main(String[] args) {
        
        // 문제 1
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        dog.makeSound();


        // 문제 2
        System.out.printf("최고 볼륨 : %d\n",RemoteControl.MAX_VOLUME);
        System.out.printf("최소 볼륨 : %d\n",RemoteControl.MIN_VOLUME);


        // 문제 3
        Sword sword = new Sword();
        Gun gun = new Gun();
        Character character = new Character();
        character.useWeapon(sword);
        character.useWeapon(gun);


        // 문제 4
        Duck duck = new Duck();
        duck.fly();
        duck.swim();


        // 문제 5
        Object obj;
        obj = duck;
        if( obj instanceof Flyable ){
            ((Flyable)obj).fly();
        }
        if(obj instanceof Swimmable){
            ((Swimmable)obj).swim();
        }


        // 문제 6
        DataAccessObject dao;
        dao = new OracleDao();
        dao.save();
        dao = new MySqlDao();
        dao.save();


        // 문제 7
        Greeting g = new Greeting() {
            @Override           // 생성자가 없지만 선언하자마자 오버라이딩하면 1회성으로 생성가능 
            public void welcome(){
                System.out.println("환영합니다.");
            }
        };
        g.welcome();
        g.welcome();


        // 문제 8
        Television television = new Television();
        television.turnOn();
        television.turnOff();
        television.setMute(true);


        // 문제 9
        System.out.println(Calculator.plus(10, 20));


    } // main end
} //c end


// 문제 1 인터페이스, 클래스  
interface Soundable{
    void makeSound();
}

class Cat implements Soundable{
    @Override public void makeSound(){
        System.out.println("야옹");
    }
}

class Dog implements Soundable{
    @Override public void makeSound(){
        System.out.println("멍멍");
    }
}

// 문제 2 인터페이스, 클래스  
interface RemoteControl{
    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;
}


// 문제 3 인터페이스, 클래스  
interface Attackable{
    
    void attack();
}

class Sword implements Attackable{
    Attackable weapon;
    @Override public void attack(){System.out.println("검");}
}

class Gun implements Attackable{
    Attackable attackable;
    @Override public void attack(){System.out.println("총");}
}

class Character{

    void useWeapon(Attackable weapon ){
        weapon.attack();
    }
}


// 문제 4 인터페이스, 클래스  
interface Flyable{
    public void fly();
}
interface Swimmable{
    public void swim();
}
class Duck implements Flyable,Swimmable{
    @Override public void fly(){ 
        System.out.println("하늘을 납니다.");
    }
    @Override public void swim(){ 
        System.out.println("물에서 헤엄칩니다.");
    }
}

// 문제 5 인터페이스, 클래스  

// 문제 6 인터페이스, 클래스  
interface DataAccessObject{
    public void save();
}
class OracleDao implements DataAccessObject{
    @Override public void save(){
        System.out.println("Oracle DB에 저장");
    }
}
class MySqlDao implements DataAccessObject{
    @Override public void save(){
        System.out.println("MySQL DB에 저장");
    }
}


// 문제 7 인터페이스, 클래스  
interface Greeting {
    public void welcome();
}


// 문제 8 인터페이스, 클래스  
interface Device{
    public boolean bbb = true;
    public void turnOn();
    public void turnOff();
    default public void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리합니다.");
        }
        else{
            System.out.println("무음 처리취소");
        }
    }
}
class Television implements Device{
    @Override public void turnOn(){
        System.out.println("전원켜기");
    }
    @Override public void turnOff(){
        System.out.println("전원끄기");
    }
}


// 문제 9 인터페이스, 클래스  
interface Calculator {
    public static int plus(int x, int y){
        return x+y;
    }
}
