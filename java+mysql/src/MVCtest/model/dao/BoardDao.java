package MVCtest.model.dao;

import java.util.ArrayList;
import MVCtest.model.dto.BoardDto;
import Practice.test1;

public class BoardDao {
    private BoardDao(){} 
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance (){ return instance ;}

    private ArrayList<BoardDto> boardList = new ArrayList<>();

    // 1. 대기명단 작성
    public boolean save(BoardDto boardDto){
        boardList.add(boardDto);

        return true;
    }

    // 2. 전체 조회 
    public ArrayList<BoardDto> findAll(){
        return boardList;
    }

    // 3. 수정 
    public boolean update(int updatenum ,  BoardDto boardDto){
        boardList.set(updatenum-1, boardDto );
        return true;
    }

    // 4. 삭제 
    public boolean delete(int deletenum){
        // 사용자가 입력한 인덱스는 인덱스값 +1 이므로 삭제할때는 
        // -1을하여 해당인덱스를 삭제
        boardList.remove(deletenum-1);
        return true;
    }
}
