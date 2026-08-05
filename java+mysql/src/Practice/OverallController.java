package Practice;

import java.util.Scanner;


public class OverallController {

    public static void main(String[] args) {
        Post[] posts = new Post[100];
        Scanner scan = new Scanner(System.in);

        for (;;) {
            System.out.println("============ My Community ============ ");
            System.out.println("1.게시물쓰기 2.게시물출력 3. 게시글 삭제  / 1,2,3을 제외한 아무 숫자");
            System.out.println("====================================== ");
            System.out.print("선택>");
            int ch = scan.nextInt();

            if (ch == 1) {
                scan.nextLine();
                System.out.print("내용 : ");
                String content = scan.nextLine();
                System.out.print("작성자 : ");
                String writer = scan.nextLine();

                Post post = new Post(content, writer);
                boolean result = false;

                for (int index = 0; index <= posts.length - 1; index++) {
                    if (posts[index] == null) {
                        posts[index] = post;
                        result = true;
                        break;
                    }
                }

                if (result) {
                    System.out.println("[안내] 글쓰기 성공");
                } else {
                    System.out.println("[안내] 글쓰기 실패");
                }

            } else if (ch == 2) {
                int i = 1;
                for (Post post : posts) {
                    if (post != null) {
                       
                        System.out.printf("글 번호 : %d  작성자 : %s , 내용 : %s \n",i ,post.writer, post.content);
                        i ++ ;
                    }
                    
                }
            }
            else if (ch == 3){
                boolean result1 = false;
                int i = 1;
                for (Post post : posts) {
                    
                    if (post != null) {
                        System.out.printf("글 번호 : %d  작성자 : %s , 내용 : %s \n",i ,post.writer, post.content);
                        i ++ ;
                    }
                    
                }
                System.out.print("삭제할 글 번호를 입력하세요"); int num = scan.nextInt();
                posts[num+1] = null;
                result1 = true;
                if(result1){
                    System.out.printf("%d번 글이 삭제 되었습니다. " , num);
                }
                
            }
            else {
                break;
            }



        }
    }
}
/* 
class Post {

    String content;
    String writer;

    public Post() {}

    public Post(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
}
    */