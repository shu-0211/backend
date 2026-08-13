package day11;

import java.security.Key;

public class Exam2 {
    public static void main(String[] args) {
        // 1. 인터페이스(interface) : 키보드 규격 ( 규칙 ) 만든다. 
        // 2. 규격에 따른 구현(implements) <구현체> 만든다. 
        // 3. 키보드 타입 생성
        KeyBoard myBoard;

        // 4.스포츠게임 실행하면 
        myBoard = new SportGame();   // 업캐스팅

        // 5. a키 
        myBoard.akey();  // 슈팅 

        // 6. 스포츠게임 종료 하고 액션게임 실행 
        myBoard = new ActionGame();
        myBoard.akey();  // 공격

        // 즉 ] 다형성 표현 : 1) extends 2) implements 
        // 클래스는 상태까지 물려주고 인터페이스는 메소드만 물려준다. 


    }// main end 
} // class end

class ActionGame implements KeyBoard{

    @Override
    public void akey() {
        System.out.println("공격");
    }

    @Override
    public int bkey(int x) {
        System.out.println("방어");
        return x;
    }
    
}
class SportGame implements KeyBoard {
    @Override
    public void akey() {
        System.out.println("슈팅");
    }
    @Override
    public int bkey(int x) {
        System.out.println("수비");
        return x;
    }
    
}



interface Buy { 
    // 1) 추상메소드: 구현부가 없는 메소드
    public abstract void method1();

    // 2) 디폴트메소드: 구현부가 있는 메소드 
    public default void method2(){};

    // 3) 정적메소드 : static ( ) 이면 인스턴스(구현체) 없이 사용 가능 
    public static void method3(){}; 

    // 4) 비공개 메소드 : 하위타입 오버라이딩 불가능한 메소드 
    private void method4(){};
 }
interface Sell { 
    void method5 (); // 생략시 기본값 public abstract 기본적용됨. 
}

class Customer extends Object implements Buy, Sell{ // 여러개 인터페이스들을 구현가능
    // 추상 메소드는 필수 오버라이딩 
    @Override public void method1(){System.out.println("기본");}
    @Override public void method5(){System.out.println("기본");}

}

interface CustomerControl extends Buy , Sell {
    // 인터페이스는 다른 인터페이스로 부터 상속이 가능한다. 
    void order();  // 추상
}

class Customer2 implements CustomerControl{
    // buy + sell 상속받은 customerControl 구현한다. 
    @Override public void method1() {}
    @Override public void method5() {}
    @Override public void order(){}
}
