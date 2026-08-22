package day15;

import java.time.LocalTime;
import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        // [1] 시계 구현
        시계스레드 시계스레드 = new 시계스레드();   // 구현체 생성
        Thread thread = new Thread(시계스레드);     //  스레드 객체에 구현체 대입
        thread.start();                             // 스레드 객체 시작 , [1.MAIN]가 [2.시계스레드 켠다.]


        // [3] 타이머 구현 [ 3. 타이머스레드 ]
        타이머스레드 thread2 =null; // null 객체 없음.   // 1번과 2번에서 같은 객체를 참조하기 위해 타이머스레드를 밖으로 뺌 

        // [2] 입력 구현  [ 1.MAIN 스레드 ]
        while (true) {
            System.out.print("1.ON  , 2. OFF : ");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            
            if(ch ==1 ){
                thread2 = new 타이머스레드();
                thread2.start();    // [1.MAIN스레드] 가 [3.타이머스레드]  켠다. 
            } // 1번 end

            if(ch==2){
                // 만약에 현재 스레드가 존재하면 상태 false 하여 [3.타이머스레드] 무한루프 종료
                if(thread2 != null){
                    thread2.state = false;
                }
            } // 2번 end

        } //  무한루프 end


    } // main end
} // class end
class 타이머스레드 extends Thread{
    public boolean state = true;
    @Override
    public void run() {
        int time = 0;
        while(state) {      // 타이머 작동 여부가 true인경우만 무한루프 / false 종료
            time++;     // 1초 증가 
            System.out.println(" >> 타이머 : " + time + "초");
            try{ Thread.sleep(1000);} catch( Exception e ){ }
        }
    }
}

class 시계스레드 implements Runnable {   // Runnable 인터페이스 구현하면 멀티스레드 정의 ~
    @Override public void run() {
        while(true){
            System.out.println(LocalTime.now());  // 현재시간 
            try{ Thread.sleep(998);}catch( Exception e){ }
        }
        
    }

}
