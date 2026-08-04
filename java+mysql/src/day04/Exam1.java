package day04;

public class Exam1 {
    public static void main(String[] args) {
        // 다수 조건의 다수 실행문 : if ifififi  다수조건의 하나의 실행문 : if else if else if
        // switch 값에 따른 흐름 제어 사용 ( 논리 true/false )
        char grade = 'B';
        // switch( 자료 ){ case 값1 : 실행문 ; case 값2 : 실행문2 ; }
        switch(grade){
            case 'A' : System.out.println("A등급 입니다.");break;
                

            case 'B' :
            case 'C' : System.out.println("합격입니다. ");
            default : System.out.println("재시험 입니다. ");
        }
        int adult = 0 ;
        switch (grade){
            case'A' :
                switch(adult){
                    case 1 : System.out.println("A등급 성인입니다."); break;
                    case 0 : System.out.println("A등급 미성년자입니다."); break;

                }
            case 'B' :
                switch (adult){
                    case 1 : System.out.println("B등급 성인 입니다.");
                }

        }
    }
}
