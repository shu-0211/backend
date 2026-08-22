package day15;

import java.util.HashMap;
import java.util.Map;

public class Exam1 {
    public static void main(String[] args) {
        /*
    제네릭타입 : 클래스 만들때 타입 정하지 않고 클래스 사용할때 타입 정한다. 
    List<BoardDto> list = new ArrayList<> ();
    - List 인터페이스를 만들때 정의하지 않고 List 인터페이스 사용할 때  BoardDto 타입 정했다. 


    컬렉션 프레임 워크 
        List 인터페이스 : 중복허용, 인덱스(순서) 있다, ArrayList, LinkedList , Vector 등
        Set 인터페이스 : 중복불가 , 인덱스(순서) 없다, HashSet, TreeSet 등
        Map인터페이스 : KEY 중복불가 / VALUE중복허용 , 인덱스 없음.
*/
    // [1] Map : key 와 value 한쌍(엔트리)으로 어러개 쌍 (엔트리) 저장하는 구조 = JSON( { } ) / DTO가변
        Map<String, Integer> map = new HashMap<>();

    //[2] 사용법 (메소드)
    // 1) .put( key , value ) : key / value 한쌍 엔트리 추가 -> 자료구조에서 따온이름이야 속성명이 아니라 키값이라고 함.
        map.put("유재석",95);
        map.put("강호동",100);
        map.put("신동엽",78);
        map.put("유재석",80);   // 주의할점 : 기존에 존재하면 Key있으면 value 수정
        System.out.println(map);

    // 2) .get( key ) : key 해당하는 value 반환
    System.out.println(map.get("강호동"));      // 100

    // 3) .size ( ) : 총 엔트리 수 반환 
    System.out.println( map.size() );

    // 4) .containsKey( 찾을키 ) -> 있으면 true 없으면 false /  .containsValue -> 있으면 T 없으면 F 
    System.out.println(map.containsKey("강호동"));
    System.out.println(map.containsValue(100));

    // 5) .keySet( ) : 모든 key 반환 , .values( ) : 모든 value 반환
    System.out.println( map.keySet());
    System.out.println(map.values());

    // 6) .remove ( key ) : 해당하는 key의 엔트리 ( key:value ) 삭제
    map.remove("강호동");   System.out.println(map);

    // 7) .clear( ) : 모든엔트리 삭제
    //map.clear();;

    // 8) .isEmpty( ): 모든 엔트리가 1개도 없으면 T , 있으면 F 
    System.out.println( map.isEmpty() );
    // 활용처 : 1] JSON(JS)  <-- 통신 --> DTO/MAP(JAVA)  2] 자료구조 ( 암호화 ) 등등

    // 9) 반복문관계
    // (1) 일반 FOR문 불가능 , 인덱스가 없다.
    // (2) 향상된 FOR문 , KEY를 주로 사용해서 출력
    for(String key : map.keySet() ){
        System.out.println(key + " : " + map.get(key));
    }
    // (3) 컬렉션.forEach ( 반복변수 ( 아무거나 ) -> { 반복시킬거 } );
    map.keySet().forEach((key) -> { System.out.println(key + " : " + map.get( key ) ) ; } );

    } // main end
}

