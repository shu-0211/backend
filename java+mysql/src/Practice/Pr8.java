package Practice;

public class Pr8 {
    public static void main(String[] args) {
        
        // 문제 1
        Book b1 = new Book("이것이 자바다", "신용권", 30000);
        Book b2 = new Book("자바의 정석", "남궁성", 28000);

        System.out.printf("%s %s %d \n",b1.title,b1.author,b1.price);
        System.out.printf("%s %s %d\n",b2.title,b2.author,b2.price);

        // 문제 2
        Rectangle r1 = new Rectangle(10, 5);
        System.out.printf("밑변의 길이 : %d  |  높이 : %d \n",r1.width,r1.height);

        // 문제 3
        BankAccount ba1 = new BankAccount("111-222-3333", "유재석", 10000);
        System.out.printf("계좌번호 : %s  예금주명 : %s  잔액 : %d\n",ba1.accountNumber,ba1.ownerName,ba1.balance);

        // 문제 4
        Goods g1 = new Goods();
        Goods g2 = new Goods("콜라", 2000);
        System.out.printf("기본 생성자 : %s  %d원  \n",g1.name,g1.price);
        System.out.printf("매개변수 생성자 : %s  %d원  \n",g2.name,g2.price);

        // 문제 5
        Member m1 = new Member();
        System.out.printf("%s %b",m1.id,m1.isLogin);
    }
}


class Book{
    String title;
    String author;
    int price;
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    

}

class Rectangle{
    int width ; 
    int height ;

    Rectangle(int width , int height){
        this.width = width;
        this.height = height;
    }

}

class BankAccount {
    String accountNumber;
    String ownerName;
    int balance;

    BankAccount(String accountNumber, String ownerName, int balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

}

class Goods{
    String name ;
    int price;

    Goods(){
        this.name = "미정";
        this.price = 0;
    }

    Goods(String name, int price){
        this.name = name;
        this.price = price;
    }

}


class Member{
    String id;
    Boolean isLogin;

    Member(){
        this.id = "guest";
        this.isLogin = false;
    }

}