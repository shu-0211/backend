package 종합예제.model.dao;

import java.util.ArrayList;

import 종합예제.model.dto.BoardDto;

public class BoardDao implements IBaseDao {
    private BoardDao() {}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance() { return instance; }

    private ArrayList<Object> boardList = new ArrayList<>();

    // TODO 1: IBaseDao의 save() 메서드를 오버라이딩하여 boardList 저장하는 로직 작성
    @Override public boolean save( Object object ){



        // 리스트에 저장
        boardList.add(object);
        return true;
    }


    @Override public ArrayList<Object> findAll(){
        return boardList;
    }
    // TODO 2: IBaseDao의 findAll() 메서드를 오버라이딩하여 boardList를 반환하는 로직 작성
    
}