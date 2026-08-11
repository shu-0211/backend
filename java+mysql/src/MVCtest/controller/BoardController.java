package MVCtest.controller;

import java.util.ArrayList;
import MVCtest.model.dao.BoardDao;
import MVCtest.model.dto.BoardDto;

public class BoardController {
    private BoardController(){} 
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance (){ return instance ;}

    private BoardDao bd = BoardDao.getInstance(); // 컨트롤러는 다오와 소통
    

    // [1] 대기명단 작성 컨트롤러 
    public boolean save( BoardDto boardDto){

        boolean result = bd.save( boardDto );
        

        return result;

    }


    // [2] 대기명단 전체 조회 컨트롤러
    public ArrayList<BoardDto> findAll(){
        // view에게 매개변수를 받음
        // dao에게 요청하고 응답을 받음 
        ArrayList<BoardDto> result = bd.findAll();
        
        return result;
    }

    // [3] 대기명단 수정 컨트롤러
    public boolean update(int updatenum , BoardDto boardDto){
        // view 에게 수정 번호와 dto를 받음
        // dao에게 요청하고 응답을 받음. 
        boolean result = bd.update(updatenum , boardDto);

        return result;

    }


    // [4] 대기명단 삭제 컨트롤러 
    public boolean delete(int deletenum){
        // view 한태 번호를 받아서 dao에게 넘김 

        boolean result = bd.delete(deletenum);

        return result;
    }

}
