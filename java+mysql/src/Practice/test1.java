/*
게시글을 작성하고 출력하는 기능 

게시글 클래스 구성
1. 글내용
2. 작성자 



프로그램 흐름 
1. 사용자에게 메뉴를 입력받음 
-> 1. 글 등록 / 2. 글 출력 

1 입력시 
미리 선언한 클래스배열에 사용자가 입력한 값을 등록 
사용자에게 글 내용과 작성자를 입력받아 클래스배열에 집어 넣어햐하므로 클래스 하나 생성 
미리 선언한 클래스 배열은 등록을 안할시 초기화가 안되어있어 모두 null값을 가르키므로 null값이면 사용자가 입력한 값을 등록

2. 입력시 
클래스 배열에서 null값이 아닌 값들을 출력


필요한것 

사용자에게 입력받을 값을 담을 클래스 배열
메뉴를 고를 변수 
등록되었는지 확인할 참 거짓 값


*/

package Practice;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 사용자에게 받아야하니까 스캐너 인스턴스 생성
        Post[] posts = new Post[10] ; // 사용자에게 받을 정보 저장할 클래스 배열 생성
        int bbb = 1;  // 글 번호 출력 해줄 변수 선언

        for ( ; ; ){
            System.out.println("메뉴를 선택하세요 1. 게시글 등록 2. 게시글 출력  0. 프로그램 종료");  
            System.out.print("선택 번호 : "); int num = scan.nextInt();

            if(num == 1){
                scan.nextLine();
                System.out.print(" 글 내용 : "); String content = scan.nextLine();
                System.out.print(" 작성자 : "); String name = scan.nextLine();

                Post p1 = new Post(content, name);  // 클래스 배열에 입력할 post 하나 생성
                p1.content = content; p1.name = name; // 값 추가 
                
                Boolean aaa = false;     // 등록을 확인할 변수

                for ( int i = 0 ; i < posts.length ; i++){
                    // posts 배열 0번지 부터 확인해서 참조하는 값이 null이면 그부분에 배열 추가 
                    if(posts[i] == null){
                        posts[i] = p1;
                        aaa = true;
                        if(aaa){ System.out.println("글이 등록됐습니다."); }
                        break;
                    }
                }
            }  //  메뉴 1번 종료 

            // 게시글 출력 
            else if ( num == 2 ){
                for ( Post post : posts ){
                    
                    if(post != null){
                        System.out.printf("글 번호 : %d 글 내용 : %s 작성자 : %s\n" , bbb, post.content, post.name);
                         bbb++;
                    }
                }
            } //  메뉴 2번 종료 

            else if(num == 0){
                System.out.print("종료");
                break;
            }


        } // 무한 루프 종료
        
        
    }
}

// 클래스 
class Post{
    String content;
    String name;

    public Post(String content, String name) {
        this.content = content;
        this.name = name;
    }

    
}
