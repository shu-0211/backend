package day11;

public interface KeyBoard {
    //폴더 -> new java file -> interface 생성
    // 1. 상수  , 초기값 필수 
    public static final String info = "인텔";
    String date = "2026-08-12"; // static final 를 생략해서 상수다. 

    // 2. 추상메소드 , { } 생략한 선언부만 작성
    public abstract void akey(); 
    int bkey ( int x ); 
}
