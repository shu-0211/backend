package day05;




public class Book {
    String title;
    // 생성자: 객체 생성 시 전달받은 도서 제목(title)으로 멤버변수(필드)를 초기화합니다.
    Book(String title) { this.title = title; } 
    public static void main(String[] args) {
    Book b1 = new Book("Java Basics"); 
    Book b2 = b1;
    b2.title =  "룰루랄라";
    System.out.println(b1.title);

    //      객체의 크기가 얼만지 잘모르잖아 컴퓨가가 그래서 new Book(
    //      int나 double 이런거는 이미 크기가 딱 정해져있으니까 굳이 생성자로 값을 전달할 필요없이 변수라는 상자에 직접 값을 집어넣는거잖아 
    // int a = 1 , int b = a라고하면 -> a상자에 있는 값을 b에게 넘겨주는 거고 
    // 만약에 인스턴스를 넘겨주는거는 컴퓨터 입장에서 a의 값을 b에 넣을때 a가 압도적으로 커버리면 b상자가 찢어지니까 
    // a가 바라보는 값의 주소를 b에게 넘겨주는 거다 
    // 이게 내가 이해한 바임 
    // a = "서"  2바이트고 
    // b = "안현준" 6바이트잖아 
    // 근데 이걸 만약에 a = b; 크기가 2인 상자에 6만큼에 크기를 집어넣으면 뭔가 오류가 생기잖아 
    // 그래서 이걸 다른 
    // int a = 1;
    // int b = a; 
    // so(b)
    // a = 10; 
    // so(b);
    

    // ===== 프로그램 실행 종료 직전 (Final State) =====
    // 제시된 코드에서 총 인스턴스는 몇개 만들어졌고 main함수가 종료 되기 전 유효 한 인스턴스는 몇 개 이고 몇개가 사라졌을까?
  }
}

