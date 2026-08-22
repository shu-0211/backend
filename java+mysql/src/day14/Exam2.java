package day14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        List<String> list2 = new ArrayList<>();
        list2 = new LinkedList<>();

        // [2] List 인터페이스 타입으로 구현체 메소드 사용가능 / day 09 Exam1 / 구현체들이 오버라이딩!
        list2.add("유재석");
        System.out.println( list2.get(0));
        list2.add("강호동");

        // [3] 리스트/배열과 반목문 관계 // 리스트 ( 목록 )내 항목(값) 들을 한번에 못 꺼내고 하나씩 (순회 // 반복)꺼낸다. 
        // 일반 for문
        for(int index = 0 ; index < list2.size() ; index++ ){}

        // 2. 향상된 for문
        for( String str : list2 ){System.out.println(str);}
        // 3. forEach문
        list2.forEach((str) -> {System.out.println(str);});

        // [4] List 구현체 차이 : 사용법 (함수 / 메소드 )동일 , 구조적 차이 
        // ArrayList : 인덱스 기반의 배열 구조  / 동기화 미지원 / 동기화 : 최신화 상태를 만드는 것 
        // LinkedList : 링크 [h헤드] [d본문] [t꼬리]
        // vector : ArrayList 동일한 구조 + 동기화를 지원함. / 동기화(스레드)지원


        // forEach , 본복메소드 , 리스트객체 . forEach( ( 반복숨여) )
    }
}
/*
    켈렉션(수집) 프레이(틀) 워크
        - 정의 : 데이터 수집(목적)ㅏ하는 자료구조(방법) 미리 만들어둔 인터페이스/클래스들
        - 목적 : 복잡한 자료들을 관리하게 제공받아 사용
        = 종류 
            List 인터페이스 : 구현체 ArrayList , Vector ,LinkedList , Stack 등
            Set 인터페이스 : 구현체 : HashSet , Treefee 등
            Map 인터페이스 : rnguscp HashMap , HashTable , TreeMap 등
        * 인터페이스란 ? 서로 다른 클래스들을 하나의 타입으로 조작
        * 구현체란? 인터페이스내 추상 메소드 구현한 클래스들을 
        * 다향성? (캐스팅) 하나의 자료가 서로다른 자료로 변환
*/
