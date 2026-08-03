package Practice;

import java.util.Scanner;

public class Active {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = 0 ;   // 고정길이 배열에서 사용자에게 몇번째 배열까지 썻는지 보여주기 위한 변수
        int counter = 0;  // 고정길이 배열에서 요소 추가를 하기 위한 변수 
        // 배열의 값이 0 이면 비어있다고 판단
        int num = 1;  // 처음 무한 루프를 시작하기 위한 변수 선언
        int [] arrays = new int[100];  // 배열 선언 
        while(num != 0){
            // 배열을 고정길이 이므로 배열하나 선언하고 그 배열에 어디어디 저장되어있는지 카운트 함수를 이용하여 처리?
            System.out.printf("현재 배열 [크기: %d]: [",size);
            if(size!=0){
                for(int i : arrays){
                    if(i==0)
                        continue;
                    else
                        System.out.print(i+" ");
                }
            }else{
                System.out.print("비어있음 ]");
            }
            System.out.print("]");
            System.out.println();
            System.out.println("1. 요소 추가 | 2. 인덱스로 삭제 |0. 종료");
            System.out.print("메뉴를 선택하세요 : "); num = scan.nextInt();

            switch (num) {
                case 1: 
                    System.out.print("추가할 정수 값을 입력하세요 : "); int number = scan.nextInt();
                    arrays[counter] = number;
                    counter ++;
                    size ++ ;
                    System.out.printf("%d 값이 성공적으로 추가되었습니다." , number);
                    break;
                case 2: 
                    System.out.printf("삭제할 인덱스번호( 0 ~ %d) 값을 입력하세요 : " , size-1); number = scan.nextInt();
                    counter ++;
                    size --;
                    arrays[number] = 0;
                    System.out.printf("인덱스 [%d] 값 (%d)이 성공적으로 삭제되었습니다." , number , arrays[number-1]);
                    break;
                case 0 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default : 
                    System.out.println("잘못입력하셧습니다 ");
                    break;
            }


        }

    }
}
