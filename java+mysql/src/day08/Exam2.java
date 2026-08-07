public class Exam2 {
    public static void main(String[] args) {
        // [1] 
        User u1 = new User();

        // u1.name = "유재석" ; // 직접접근 불가 
        u1.setName("유재석");

        // System.out.println(u1.name);
        System.out.println(u1.getName());


        // [2] 객체 출력하면 객체주소값 반환
        System.out.println(u1);  // day08.User@372f7a8d


        // toString 메소드가 존재하는 객체는 주소값 대신에 문자열을 반환함. 



    }
}


class User {
    // 1. 맴버변수 = 상태 = private 사용
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        // 추후에 유효성검사 이용하여 원하는 데이터만 저장
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 2. 생성자 = 초기화 
    // 3. 메소드 = 행위 
    // - private 메소드에 대한 간접접근 메소드 
    // setter , getter , set멤버변수 , get멤버변수
    // getter 만 존재하면 V(value) O(object) 읽기모드
    // setter/getter 존재하면 D(data) T(transger) O(object) 읽기 / 쓰기모드



    // 3. toString : 객체 호출시 주소값 대신 문자열 변환
    @Override
    public String toString(){
        return "User [name = " + name + ", age = " + age + "]";
    }
    // DTO란 : 데이터베이스에 있는 자료 -- 이동 --> 프론트엔드 
    //  DTO : 1. 관례적으로 맴버변수 모두 private
    //        2. setter/getter 제공한다.
    //        3. toString 제공한다. 
    //        4. 생성자는 기본생성자1개, 전체매개변수1개 => 2개
    // MVC 패턴 : 소규모가 아닌 체계적인 규모가 필요할 때 클래스 역할 나누기 
    // V : VIEW 입출력 담당                 HTTML / CSS / JS / REACT / FLUTTER
    //  C: Controller 제어(백/프) 중계      JAVA / PYTHON / NODE.JS
    //  M: Model 데이터 담당                DTO,VO (CONTROLLER - 외부 DB / 클라우드 )


}