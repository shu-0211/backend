package Practice;

import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) {

        /* 
        //문제 1
        for( int i = 1 ; i <= 10 ; i++){
            System.out.println(i);
        }
            */

        /*
        // 문제 2
        for( int i = 10 ; i >= 1 ; i--){
            System.out.println(i);
        }
        */

        /*
        //문제 3 
        int sum = 0 ;
        for ( int i = 1 ; i<=50 ; i++){
            sum += i;
        }
        System.out.printf("1부터 50까지 합계: %d",sum);
        */

        /*
        // 문제 4 
        for ( int i = 1 ; i <= 20 ; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        */

        /* 
        //문제 5
        for(int i = 1 ; i<=30; i++){
            if(i%3==0)continue;
            System.out.println(i);
        }
            */


        /*
        // 문제 6
        int sum = 0 ;
        for(int i = 0 ; ; i++){
            sum += i;
            if ( sum > 100){
                System.out.println(sum);
                break;
            }
        }
        */

        /*
        // 문제 7
        String sum = "";
        for(int i = 1 ; i <= 10; i++){
            if(i%2 ==1){
                sum += "*";
                System.err.print(sum);
            }
            System.out.println();
        }
        */

        /* 
        // 문제 8
        for(int i = 5; i >= 1; i--){
            System.out.println();
            String sum = "";
            for(int j = 1; j <= i ; j ++){
                sum += "*";
            }
            System.out.println(sum);
        }
        */

        /* 
        // 문제 9
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        for( ; ; ){
            
            System.out.printf("%d회 입력 : ",counter); 
            String str = scan.next();
            counter ++ ; 
            if(str.equals("end")){
                break;
            }
        }
        System.out.printf("[안내] 프로그램을 종료합니다.[총 %d]회 입력", counter-2);
        */

        /* 
        // 문제 10
        int july1 = 3532100;
        int july2 = 9123700;
        int july3 = 5183400;
        int july4 = 11738700;
        int [] ary = { july1 , july2, july3 , july4};
        int week = 1;
-
        for ( int i : ary){
            String str = "";
            for(int j = 1 ; j <= i/1000000 ; j++){
                str += "■ ";

            }
            System.out.printf("%d주차 %s %d만원", week , str , i/10000 );
            System.err.println();
            week++ ;
        }
        */

        /* 
        // 문제 11
        Scanner scan = new Scanner(System.in);
        int account = 0 ;
        int num = 0;
        int money = 0 ;
        
        for( ; ; ){
            if(num == 4){break;}
            System.out.print("1:입금 | 2:출금 | 3:잔고 | 4:종료  "); num = scan.nextInt();
            switch (num) {
                case 1:
                 System.out.print("입금액:"); money  = scan.nextInt();
                 account += money;
                 break;
                
                case 2:
                    System.out.print("출금액:"); money  = scan.nextInt();
                    if(money > account){
                        System.out.println("출금액이 잔액보다 많습니다.");
                    }else{
                        account -= money;
                        System.out.printf("%d원이 출금되었습니다. 잔액 : %d",money,account);
                    }
                case 3:
                    System.out.printf("잔고 > %d", account);
                    break;
                case 4: 
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default : 
                    System.out.println("잘못된 입력입니다. 메뉴를 다시 선택해주세요.");
                    break;
            }
            
        }
        */

    }
}
