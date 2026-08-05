package day06;

public class Exam1 {
    
    public static void main(String[] args) {
        
    /*
        생성자 : 인스턴스(객체) 생성할때 사용되는 키워드, new 
        선언하는 방법 
            1) 클래스 내부 
            2) 클래스 명과 동일해야함. 만일 다르면 메소드 취급
            3) 오버로딩 지원 : 동일한 이름으로 여러개 선언 / 오버라이딩이랑은 다름
        목적 : 1) 빠른 초기화 2) 객체 생성에 규칙만들고 / 유효성검사를 할 수 있음.
        종류 : 1) 기본 생성자(매개변수가 없는) 2) 정의생성자(매개변수가 있는 생성자)
    */


        // [1] 기본생성자로 객체 생성
        Phone p1 = new Phone();
        p1.model = "갤럭시";  // 객 내 맴버 변수 초기화 

        // 2. 생성자 
        // * 생성자가 1개 없으면자동으로 기본 생성자 생성
        Phone p2  = new Phone( "아이폰" , "파랑");

        // 3)
        Phone p3 = new Phone("아이폰","블랙",30000)
        
        

    }

}

class Phone{
    // *** 클래스 가족 (맴버들) ***
    // 1. 맴버변수
    String model;
    String color;
    int price;
    // 2. 생성자
    // * 생성자가 1개 없으면 *자동으로 기본생성자* 생성
    // * 생성자명은 중복이 안된다 . 
    //    ->오버로딩( 매개변수 개수와 타입 순서 다르면) 중복가능
    // * this? -> 맴버변수명 식별
        // 1) 기본생성자  : 매개 변수가 없는
    Phone(){ }

    Phone(String model , String color){
            this.model = model;
            this.color = color;
        }
    Phone ( String model, String color , int 가격){
        this.model = model;
        this.color = color;
        price = 가격;
    }

   
    // 3. 메소드/함수
}


/*
선언되는 변수 위치에 따라 이름이 다르다 . 
지역변수 : if/for/func(함수) {}안에서 선언된 변수
맴버변수 : 클래스/설계도{} 안에서 선언되고 객체 (인스턴스 ) 내 변수 
    this : 해당 생성자 / 메소드 호출한 객체(인스턴스)가르킴
매개변수 : 생성자 / 메소드 호출하면서 인수값들을 저장하는 변수

    ** 생성자는 메소드와 다르게 new로 생성한 객체의 주소값을 반환하기 때문에 다른 
    것들을 반환하지 않는다. 
*/
