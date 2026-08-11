package MVCtest.view;

import java.util.Scanner;

import java.util.ArrayList;
import MVCtest.controller.BoardController;
import MVCtest.model.dto.BoardDto;

public class BoardView {
    private BoardView(){} 
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance (){ return instance ;}

    private BoardController bc = BoardController.getInstance(); // view는 컨트롤러와 소통하므로 

    private Scanner scan = new Scanner( System.in);


    // [*] 메인 입출력 
    public void run(){
        while(true){ // 무한루프
            System.out.println(" 1. 대기명단 등록 | 2.대기명단 전체 조회 |  3. 대기명단 개별 수정 | 4. 대기명단 개별 삭제 | 5. 종료" );
            System.out.print(" 선택 >> ");
            int ch = scan.nextInt();
            if( ch == 1 ) { save(); }
            else if( ch == 2 ) { findAll(); }
            else if( ch == 3 ) { update(); }
            else if( ch == 4 ) { delete(); }
            else if( ch == 5 ) { break; }
        } //  무한 루프 종료
    }// run () 함수 종료
    

     // [1] 게시물 작성 입출력
    public void save( ){
        // 1. 입력받기 
        System.out.print("연락처 : ");     
        String phone = scan.next();
        System.out.print("인원수 : ");   
        int people = scan.nextInt();

        // 2. 객체화
        BoardDto boardDto = new BoardDto( phone , people );

        // 3. 컨트롤러에게 요청하고 응답받기
        boolean result = bc.save( boardDto );
        
        // 4. 처리한다
        if( result ){ System.out.println("등록성공"); }
        else{ System.out.println("등록실패"); }
    } // f end 

    // [2] 전체 조회 
    public void findAll(){
        int aaa = 1; // 글번호 출력을 위한 변수 선언
        ArrayList<BoardDto> result = bc.findAll();
        for(BoardDto board : result){
            System.out.printf("대기번호 : %d 연락처 : %s 인원수 : %d명\n",aaa,board.getPhone(),board.getPeople());
            aaa++;
        }
    } // f end

    // [3]  대기명단 수정 함수 

    public void update(){
        findAll();
        System.out.println("수정할 대기번호를 알려주세요 "); int updatenum = scan.nextInt();

        // 수정할 정보 입력 받기  
        System.out.print("연락처 : ");     
        String phone = scan.next();
        System.out.print("인원수 : ");   
        int people = scan.nextInt();

        // 2. 객체화
        BoardDto boardDto = new BoardDto( phone , people );

        boolean result = bc.update(updatenum, boardDto);


        if( result ){ System.out.println("대기명단 수정 성공"); }
        else{ System.out.println("대기명단 수정 실패"); }
        
    } // f end

    // [4] 대기명단 삭제 함수 
    public void delete(){
        findAll();
        System.out.println("삭제할 대기번호를 알려주세요 "); int deletenum = scan.nextInt();

        boolean result = bc.delete(deletenum);

        if( result ){ System.out.println("대기명단 삭제 성공"); }
        else{ System.out.println("대기명단 삭제 실패"); }

    }


}// class end 
