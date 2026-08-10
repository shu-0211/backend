package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr11 {
    public static void main(String[] args) {
         
        // 문제 1
        ArrayList< String > nameList = new ArrayList<>();
        nameList.add("유재석" );
        nameList.add("강호동" );
        nameList.add("신동엽" );
        System.out.println(nameList);


        // 문제 2
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과"); fruits.add("바나나"); fruits.add("딸기");
        for(int i = 0 ; i < fruits.size(); i++){
            System.out.printf("인덱스 %d : %s\n",i,fruits.get(i));
        }


        // 문제 3
        for(String str : fruits){
            System.out.println(str);
        }



        // 문제 4
        ArrayList<String> qwer = new ArrayList<>();
        qwer.addAll(List.of("A" , "B" , "C" ,"D" ,"E"));
        System.out.println(qwer);
        qwer.remove(2);
        System.out.println(qwer);


        // 문제 5
        ArrayList<String> asdf = new ArrayList<>();
        asdf.addAll(List.of("자바" , "파이썬" , "C++"));
        System.out.println(asdf);
        asdf.add(1,"자바스크립트");
        System.out.println(asdf);


        // 문제 6
        ArrayList<Book> library = new ArrayList<>();
        Book b1 = new Book("1번","1번책");
        Book b2 = new Book("2번","2번책");
        Book b3 = new Book("3번","3번책");
        library.addAll(List.of(b1,b2,b3));
        for(Book bo : library){
            System.out.println(bo.toString());
            // System.out.printf("제목 : %s  저자 : %s\n",bo.getTitle(),bo.getAuthor());
        }


        // 문제 7
        Scanner scan = new Scanner(System.in);
        ArrayList<String> zxcv = new ArrayList<>();
        for( ; ; ){
            System.out.print("배열에 추가할 문자열을 입력하세요 : "); String aaa = scan.next();
            if(aaa.equals("종료")){System.out.println(zxcv); break;}
            else{
                zxcv.add(aaa);
                System.out.println("추가되었습니다.");
            }
        }



        // 문제 8
        ArrayList<String> qqwer = new ArrayList<>();
        qqwer.addAll(List.of( "국어", "수학", "사회", "과학"));
        System.out.println(qqwer);
        qqwer.set(1, "영어");
        System.out.println(qqwer);


    }
}


class Book{
    private String author;
    private String title;

    Book(){};
    
    Book(String title , String author){
        this.author = author;
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "제목 : " + this.title + "    저자 : " + this.author;
    }

    
}