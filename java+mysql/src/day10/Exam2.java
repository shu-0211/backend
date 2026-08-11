package day10;

public class Exam2 {
    public static void main(String[] args) {
        
        // 자바는 100% 객체지향언어 이다. 
        // 슈퍼클래스인 Object 로 부터 모든 클래스는 상속 관계를 갖는다. 
        
        // 1. A인스턴스 생성시 A1개 -->  Object 1개( 눈에 안보이지만 최상위 클래스로 한개가 생성됨. )
        A a = new A();

        // 2. B 한개 b는 a의 자식이므로 a 1개 object 1개 총 3개 
        B b = new B();

        // 3. C는 c 1개 , a 1개 , Object 1개 총 3개 
        C c = new C();

        // 4. D는 d 1개 b 1개 a 1개 object 1개   총 4개 
        D d = new D();

        // 5. E는 e 1개 c 1개  a 1개 object 1개 총 4개 
        E e = new E();


        // [2]  자동 타입 변환
        A a2 = b ;   // B   -->   A  [가능]]
        Object o1 = a2;   // A  --> object [가능]

        Object[] objects = new Object[100];    // object


        // [3]  강제타입변환 / 다운캐스팅
        B b2 = (B)a2;    //   A --> B [가능] 
        // C c2 = (C)b;    // B는 C를 포함하지 않기 때문에 불가능 


        // [4] 타입을 확인 할 수 있음. 인스턴스 instanceOf ( 타입명 )
        System.out.println(e);

        System.out.println(e instanceof Object); // e -- object  true 
        System.out.println(e instanceof C); // e -- object  true 
        // System.out.println(e instanceof D); // e -- object  true 
        // System.out.println(e instanceof B); // e -- object  true 
        // 타입 변환을 하기 전에 instanceof 를 사용하여 타입확인후 에 타입변환을 하면 안전하게 할 수있음. 



    } //  main end
} //  c end


class A {
    A( ) { System.out.println("[1] A객체 생성");} 
}

class B extends A{
    B( ) { System.out.println("[2] B객체 생성");} 
}

class C extends A{
    C( ) { System.out.println("[3] C객체 생성");} 
}

class D extends B{
    D( ) { System.out.println("[4] D객체 생성");} 
}

class E extends C{
    E( ) { System.out.println("[5] E객체 생성");} 
}