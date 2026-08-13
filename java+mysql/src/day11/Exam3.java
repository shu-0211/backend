package day11;

public class Exam3 {
    public static void main(String[] args) {
        Car myCar = new Car();
        // myCar.run();   [오류] because "this.tire" is null
        
        // 2.  
        // myCar.tire = new Tire(); // [오류] 인터페이스로 객체 생성 불가능

        // 3. 
        myCar.tire = new HankokTire();
        myCar.run();

        // 4. 
        myCar.tire = new KumhoTire();
        myCar.run();

        // 5. 
        System.out.println(myCar.tire instanceof Tire);
        System.out.println(myCar.tire instanceof KumhoTire);
        System.out.println(myCar.tire instanceof HankokTire);

        // [*] 익명(클래스없이)구현체 = 일화성 사용하는 인터페이스 구현체 
        // * 자체적으로 추상메소드 오버라이딩 *
        // new 인터페이스명 
        myCar.tire = new Tire(){
            @Override
            public void roll() {
                System.out.println("일반타이어 회전");
            }
        };
        myCar.run();

        
    }
}

class Car{
    Tire tire;
    void run () { this.tire.roll();}
}

interface Tire{
    void roll();
}

// 구현체 
class HankokTire implements Tire{
    @Override public void roll(){
        System.out.println("한국타이어 회전");
    }
}

class KumhoTire implements Tire{
    @Override public void roll(){
        System.out.println("금호타이어 회전");
    }
}