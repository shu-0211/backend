package day02;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        
        /* 
        // . 문제 1번
        int a = 25;
        System.out.println(a);
        System.out.println("홍길동");

        //문제 2번 
        int age = 25;
        System.out.println(age);

        //문제 3
        String name = "서현욱";
        age = 25;
        double height = 175.5;
        String motto = "강한 신체에 강한 정신이 깃든다.";

        // 문제 4
        System.out.println("제 이름은"+name+", 나이는 "+age+", 키는 "+height+"입니다.");

        // 문제 5
        System.out.printf(" 제 이름은 %s, 나이는 %d, 키는 %.1fcm입니다.\n",name , age , height);

        // 문제 6
        System.out.println(" |\\_/|\n |q p|   /}\n( 0 )\"\"\"\\\n|\"^\"`\t|\n||_/=\\\\__|");
        
        // 문제 7
        String writer = "유재석";
        int num = 1;
        String content = "안녕하세요!";
        System.out.println("=================방문록===============");
        System.out.println("번호 \t 작성자 \t 방문록");
        System.out.printf("%d\t %s \t %s \n", num,writer,content );
        System.out.println("=======================================");
        /* 
        // 문제 8
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name1 = scanner.next();
        System.out.print("나이를 입력하세요 : ");
        int age1 = scanner.nextInt();
        System.out.printf("%s님의 나이는 %d입니다.",name1,age1);
        */
        // 문제 9
        // nextLine() 띄어쓰기 포함
        // nextLine() 주의할점 : 만약에 nextLine() 앞에 다른 
        // next xX() 존재한 경우 사이에 의미없는 nextLine()추가
        Scanner scan = new Scanner(System.in);
        System.out.print("게시물번호:");
        int num1 = scan.nextInt();
        scan.nextLine();
        System.out.print("제목:");
        String title = scan.nextLine();
        System.out.print("내용:");
        String content1 = scan.nextLine();

        System.out.printf("[ %d번 게시물]\n",num1);
        System.out.printf("제목: %s\n",title);
        System.out.printf("내용: %s\n",content1);
        
        //문제 10
        // nextChar() 제공하지 않음. next().charAt(인덱스) :
        // 해당 인덱스의문자 1개 추출함수 , *문자열은 배열이다 *
        System.out.print("성별을 입력하세요(남/여):");
        char gender = scan.next().charAt( 0);
        System.out.printf("입력하신 성별은 '%s'입니다.",gender);

        //문제 11
        System.out.print("이름: ");String name2 = scan.next();
        System.out.print("나이: ");int age2 = scan.nextInt();
        System.out.print("키: ");double height2 = scan.nextDouble();
        System.out.print("프로그래머입니까?: ");boolean aaa = scan.nextBoolean();

        System.out.printf("이름: %s \n나이:%d \n키: %f\n프로그래머 여부: %b",name2,age2,height2,aaa);


    }
}
