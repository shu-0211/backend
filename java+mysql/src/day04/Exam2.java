package day04;

public class Exam2 {
    public static void main(String[] args) {
        int [] ary = { 92, 80, 75}; // 자바스크립트랑 배열이 다름

        /* 
        for( int j = 0 ; j <= ary.length ; j ++){
            System.out.println(ary[j]);
        }
            */
           
        //  * 향상된 for 문
        for ( int i : ary){
            System.out.println(i);
        }
    }
}
