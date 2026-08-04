package Practice;

import java.util.Arrays;
import java.util.Scanner;

import day02.practice1;

public class Act {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] array = new int[0];   // 크기가 0인배열 선언
        
        // [1] 배열 
        while(true){

            System.out.print("메뉴를 입력하세요. 1: 등록  |  2: 삭제 | 0 : 프로그램 종료 "); int menu = scan.nextInt();
            if(menu==1){
                System.out.print("입력할 값을 입력하세요 : "); int aaa = scan.nextInt();
                int [] newarray = new int[array.length+1];
                for( int i = 0 ; i < array.length; i++){
                    newarray[i] = array[i];
                }
                newarray[array.length] = aaa; // 입력받은 값

                array = newarray;

                System.out.println(Arrays.toString(array));
            }


            else if(menu==2){
                int number = scan.nextInt();
                int [] newarray1 = new int[array.length-1];
                for ( int i = 0 ; i < array.length; i++){
                    if(i == number){ 
                        continue;

                    }
                    else if( i < number){
                        newarray1 [i] = array[i];
                    }
                    else{
                        newarray1 [i-1] = array[i];
                    }
                        
                }
                array = newarray1;
                System.out.println(Arrays.toString(array));
            }
            else if(menu==0){
                break;
            }
           
            else{
                System.out.println("잘못입력했습니다.");
            }
        }
        

        // 삭제 
        int number = scan.nextInt();
        int [] newarray1 = new int[array.length-1];
        for ( int i = 0 ; i < array.length; i++){
            if(i >= number){ 
                newarray1 [i-1] = array[i];

            }else{
                newarray1[i] = array[i];
            }
                
        }
        


    

    }
}
