package day14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class Exam3 {
    public static void main(String[] args) {
        
        // Set 인터페이스 : 여러개 자료들을 저장하는 컬렉션 , 리스트랑 차이점은 중복을 제거함. / 인덱스 없음. 
        // -> 중복허용 안함. ( 자료값으로 식별 )
        // 1. Set 구현 
        Set<String> set1 = new HashSet<>();

        // 2. Set .add ( 추가할 값 );
        set1.add("유재석");         set1.add("강호동");
        set1.add("유재석"); // List 중복허용 , Set 중복 허용안함. 
        set1.add( new String("유재석"));    // 중복방지한다. 
        System.out.println(set1); // 유재석, 강호동

        // 3. .get (인덱스); 지원 불가 , 인덱스가 없기 떄문에
        // set1.get(0);

        // 4. .size(); : 항목의 개수를 반환
        System.out.println(set1.size());

        // 5. remove (자료); 인덱스가 아닌 자료로 삭제 
        set1.remove("강호동");

        // 6. indexOf(인덱스); 지원불가   /  contains ( 찾을값 ) 지원
        set1.contains("강호동");  // false

        // 7. clear() : 항목 전체 삭제
        set1.clear();; 

        // 8. .isEmpty() : 항목이 하나도 없으면 true / false 
        set1.isEmpty();

        // 1. 일반for문 , 불가능  ( 인덱스가 없기 때문에)
        // 2. 향상된 for문은 지원 
        for(String str : set1 ){ System.out.println(str);}
        
        // 3. forEach 지원  , 컬렉션객체.forEach( (반복변수명) -> { } )
        set1.forEach((str) -> {System.out.println(str);});
        
        // - 활용처 : Set( JDBC ResultSet )
        Iterator <String> 순회자 = set1.iterator(); // 인덱스가 아닌 자료들을 순회하는 인터페이스 반환
        while(순회자.hasNext()){            // 인터페이스 이용한 다음 자료 확인 
            System.out.println(순회자.next());    // 다음 자료 꺼내기 지원 < 순서는 보장 없음 > 
        }  // hasNext( ) : 목록(컬렉션)에서 자료 하나씩 이동 꺼내기
        // 즉 위 코드 이용한 향상된 for문 / forEach / ResultSet 만들어짐 . 


        // 11. TreeSet(이진트리) : 이용한 자동정렬
        TreeSet < Integer > set2 = new TreeSet<>();
        set2.add(50); set2.add(70);   set2.add(60);
        System.out.println(set2);   // [50, 60, 70] 기본값이 오름차순
        // descendingSet() 메소드는 Set인터페이스내 추상메소드가 없다.
        System.out.println( set2.descendingSet());


    }  // main end
}
