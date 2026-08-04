package day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exam3 {
    public static void main(String[] args) {
        /* 
        // java 배열 , 동일한 타입만 가능함. 
        // 선언1 : 타입 [] 변수명 = new 타입명 [ 총 개수 ]
        // 선언2 : 타입 [] 변수명 = { 초기값, 초기값, 초기값 };
        
        특징 : 1. 통일한 타입끼리 , 2. 고정(정적)길이  3) 요소 초기값 (자동 할당됨.) 
        정수는 0 , 실수는 0.0 논리는 false 객체는 null로 자동초기화됨. 

        인덱스 : 요소(자ㅏ료)들이 저장되는 순서 번호 , 0번 시작 

        배열내 요소 확인 : Arrays.toString(배열변수)
*/
        // [1]  배열의 선언 
        int [] arry1 = new int[3];  //  int형 3개를 저장한 배열 선언
        System.out.println( arry1 ); // 주소값이 나옴  , 메모리 주소값 * 1개 *
        System.out.println( Arrays.toString( arry1));

        String [] arry2 = {"유재석", "강호동" , "신동엽" };
        System.out.println(Arrays.toString(arry2));
        System.out.println(arry2[0]);

        // [*] 선언 이후에 길이 (요소) 추가 push / 변경  / 삭제 splice 안된다. 
        arry2[0] = "유재석2"; 
        System.out.println(arry2[0]);
        System.out.println(Arrays.toString(arry2));

        // .push 이런거 싹다 오류남 , 요소 추가가 없음. 
        // arry2.splice(0,1);  JS에서는 0번째 요소 1개 삭제 , 자바는 이런거 없음 , 요소 삭제 불가 

        /* 
            배열의 메모리 : 메모리는 1byte 단위로 저장, 비트단위가 아님. 
            자바 int  1개 선언 -> 4byte는 [] [] [] [] 4개의 메모리가 컴퓨터 할당 
            [ *101 ] [] [] [] [] [] [] [] [] [] [] [] -> 3 * 4byte
            배열은 요소내 모든 인덱스 주소값 참조하지 않고 * 가장 앞에 있는 주소값 1개만 참조 *
        */ 

        

    }
}
