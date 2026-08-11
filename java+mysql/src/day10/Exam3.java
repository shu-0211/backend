package day10;

public class Exam3 {
    public static void main(String[] args) {
        
        // 1. 상위객체
        상위클래스 obj1 = new 상위클래스();
        obj1.show();
        System.out.println(obj1.value1);


        // 2. 하위객체
        하위클래스 obj2 = new 하위클래스();
        obj2.show();
        System.out.println(obj2.value1);
        System.out.println(obj2.value3);

        // 3. 타입변환이 된 경우 
        상위클래스 obj3 = obj2;   // 하위 메소드가 

        obj3.show();            
        System.out.println(obj3.value1);


    }
}
/*
    오버로딩 : 생성자명 / 메소드명 동일하게 
        조건 :매개변수 개수 , 타입 , 순서 다른경우

    오버라이딩 : 물려받은 메소드 재정의
*/


class 상위클래스{
    int value1 = 10;
    int value2 = 20;
    상위클래스(){ System.out.println("상위 탄생");}
    void show (){System.out.println("상위 메소드 실행");}
}

class 하위클래스 extends 상위클래스{
    int value3 = 30;
    int value4 = 40;
    // 인스턴스 1개당 맴버변수 1개씩 생성

    하위클래스(){ System.out.println("하위탄생");}

    // 주의할점 : 오버로딩 vs 오버라이딩
    void show ( int a ){}  // 매소드명은 같지만 매개변수가 다르다. 

    @Override
    void show( ){   // 상위클레스의 메소드 선언부 모두 동일하면 ( 재정의 )
        System.out.println("하위 메소드가 재정의 실행");
    }  
    
    // 여러개 인스턴스가 메소드를 공유한다. 
    // 맴버변수는 각자 쓰는거고 메소드는 같이 사용함. 
    
}