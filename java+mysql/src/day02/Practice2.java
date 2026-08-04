package day02;

import java.util.Scanner;

public class Practice2 {
   // public static void main(String[] args)
   public static void main(String[] args){
    
        // 문제 1
        byte a = 10;
        int b = 200;
        long result = a + b;
        System.out.printf("결과: %d",result);
     
        // 문제 2
        double z = 3.141592;
        int x = (int)z;
        System.out.printf("변환된 int 값: %d",x);

        // 문제 3
        Scanner scan = new Scanner(System.in);
        double height = scan.nextDouble();
        System.out.printf("당신의 키는 약 %dcm 이군요",(int)height);
        

        // 문제 4
        System.out.print("첫번째 정수 입력:"); int c = scan.nextInt();
        System.out.print("두번째 정수 입력:"); int d = scan.nextInt();
        System.out.print("세번째 정수 입력:"); int e = scan.nextInt();
        float result10 = (e+d+c)/3.0f;
        System.out.printf("평균결과: %f",result10);


   }
}
