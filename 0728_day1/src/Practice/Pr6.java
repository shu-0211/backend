package Practice;

import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class Pr6 {
    public static void main(String[] args) {
        /* 
        // 문제 1
        int [] numbers1 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(numbers1));
        */

        /* 
        // 문제 2
        String [] season = new String[] {"봄", "여름", "가을" };
        System.out.println(Arrays.toString(season));
        */

        /* 
        // 문제 3
        String [] fruits = new String[]{"사과", "바나나", "포도", "딸기"};
        for(String fruit : fruits ){
            System.out.println(fruit);
        }
        */

        /* 
        // 문제 4
        int[] scores1 = {85, 92, 78, 65, 95};
        int sum = 0;
        for ( int i : scores1){
            sum += i;
        }
        System.out.println((float)(sum / scores1.length));
        */

        /* 
        // 문제 5
        int[] scores2 = {77, 82, 100, 54, 96};
        for ( int i : scores2){
            if(i == 100){
                System.out.println("만점자를 찾았습니다.");
                return ;
            }
        }
        System.out.println("실행되면 잘못된거임");
        */

        /* 
        // 문제 6
        String[] bloodTypes = {"A", "B", "O", "AB", "A", "B", "A"};
        int counter =0 ; 
        for ( String i : bloodTypes){
            if(i=="A"){ counter ++ ;}
        }
        System.out.printf("A형은 %d명입니다. ",counter);
        */

        /* 
        // 문제 7
        int[] numbers2 = {23, 5, 67, 12, 88, 34};
        int max = 0 ;
        for( int i : numbers2){
            if( i > max){
                max = i;
            }
        }
        System.out.printf(" 가장 큰수는 %d입니다. ",max);
        */

        /*
        // 문제 8
        Scanner scan = new Scanner(System.in);
        String[] products = {"볼펜", "노트", "지우개"};
        int[] stock = {10, 5, 20};
        System.out.print("상품명을 입력해주세요 :"); String product =  scan.next();
        System.out.println();
        for(String i : products){
            if( product.equals(i)){ 
                System.out.println("구매 수량를 입력해주세요"); int price = scan.nextInt();
                for( int j : stock){
                    if(price < j){
                        System.out.println("구매 완료!"); return ;
                    }else {
                        System.out.println("재고가 부족합니다. ");
                        return;
                    }
                }  
            }
        }
        */
        

        // 8번 다른 방법 
        /*
        boolean find = false ; // 초기값 
        if( 상품명.equals(products[index] ) ){
            find = ture; 
        }
        */


        /* 
        // 문제 9
        String[] movieNames = {"히든페이스", "위키드", "글래디에이터2", "청설"};
        int[] movieRatings = {8, 4, 7, 6};
        int counter = 0 ; 


        for(int star : movieRatings){
            String str = "";
            for ( int i = 1;  i <= 10; i++){
                if( i <= star){
                    str += "★ ";
                    continue;
                }
                str += "☆ ";
            }
            System.out.printf("%s %s",movieNames[counter],str);
            System.out.println();
            counter ++;
        }
        */

        /* 
        // 문제 10
        String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234" , "931나8284"};
        int[] usageMinutes = {65, 30, 140, 420 , 10};

        for ( int i = 0 ; i < carNumbers.length;  i ++){
            if(usageMinutes[i] >= 30){
                if((((usageMinutes[i] - 30) /10) * 500 ) + 1000 > 20000){
                    System.out.printf("%s : %d분 주차, 최종요금 : %d원",carNumbers[i],usageMinutes[i],20000);
                System.out.println();
                continue;
                }
                System.out.printf("%s : %d분 주차, 최종요금 : %d원",carNumbers[i],usageMinutes[i],(((usageMinutes[i] - 30) /10) * 500 ) + 1000);
                System.out.println();
                continue;
            }else{
                System.out.printf("%s : %d분 주차, 최종요금 : %d원",carNumbers[i],usageMinutes[i],1000);
                System.out.println();
                continue;
            }
        }
        */
       // 문제 10 코드 줄이기 
       String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234" , "931나8284"};
        int[] usageMinutes = {65, 30, 140, 420 , 10};
       for ( int i = 0 ; i < carNumbers.length ; i++){
            System.out.print(carNumbers[i] + ": ");
            System.out.print(usageMinutes[i] + "분 ");

            int fee = 1000; // 기본요금 
            if ( usageMinutes[i] > 30){
                fee += (usageMinutes[i]-30) /10 *500;
                fee = fee>20000 ? 20000 : fee;
            }
            System.out.println(fee + " 원 ");
       }


    }
}
