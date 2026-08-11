package day10;

public class Exam1 {
    public static void main(String[] args) {
        
        // 1. 동물객체 생성
        동물 animal1 = new 동물();       // 생성자 실행
        animal1.name = "강아지";        // 맴버변수 실행
        animal1.show();                 // 메소드 실행

        // 2. 조류 객체 생성
        조류 bird1 = new 조류();
        bird1.name = "비둘기";
        bird1.show();

        // 즉 하위/자식 클래스의 객체는 상위/부모 클래스의 맴버(변수/메소드) 사용
        // 3. 참새 객체 생성
        참새 sparrow1 = new 참새();
        sparrow1.name = "참새";
        sparrow1.show();

        // 4. 닭 객체 생성
        닭  chicken1 = new 닭 ();
        chicken1.show();
        //  상위 클레스의 객체가 먼저 생성되고 하위 클래스 객체가 생성된다. 

        // *********** 다형성 ******************
        // 하나의 자료가 다양한 형( 형식/ 모양 / 형태 / 구분 ) 성질
        // 1. 참새 타입에서 조류타입으로 될까?
        // 가능한 이유 : 1) 상속관계 (논리 ) 2. 참새 인스턴스가 생성될때 + 조류 + 동물 인스턴스 생성(물리)
        조류 bird2 = sparrow1; // 자동타입 변환 / 업캐스팅 ( 올라가기 )


        // 2. 참새 타입에서 동물 타입으로 될까?
        동물 animal2 = sparrow1; // 업캐스팅 


        // 3. 동물 타입에서 참새 타입으로 될까? 주의 !!!!!!
        참새 sparrow2 = (참새)animal2; // -> 주의할점  : 1) 변환 타입명시 / 다운캐스팅(내려가기) 2) 변환할 자료가  변환할 타입을 포함하는지?


        // 4. 동물타입에서 참새 타입으로 될까? 주의 !!
        참새 sparrow3 = (참새)animal1 ;   // 오류발생 / 동물 1이 태어날때 참새가 생성되지 않았다.


        // 1~3 : 자료 : 참새 , 타입 참새 
        // --> 자료 : 참새 , 타입 : 조류
        // --> 자료 : 참새 , 타입 : 동물
        // --> 자료 : 참새 , 타입 : 참새



    } //  main end
} // class end

class 동물 { // 부모클래스 

    String name; // 1. 맴버변수

    동물(){System.out.println("동물 탄생");} // 2. 생성자 
    
    void show(){  // 3. 메소드
        System.out.println("동물 입니다.");
    }

} //  c end 


class 조류 extends 동물{  }// 하위클래스명 extends 상위클래스명{ } 

class 참새  extends 조류 { } // 

class 닭 extends 조류 { }

/*
    <가계부>
      동물
       |
      조류 
    |       |
   참새     닭
*/
