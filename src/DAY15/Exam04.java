package DAY15;

import java.util.*;

public class Exam04 {
    public static <List> void main(String[] args) {

        //[3] Map 인터페이스,저장된 순서(인덱스)없이 key와 value만으로 entry(한쌍)를 저장하는 구조
        //Map<KeyType,ValueType>
        Map<String, Integer> map1 = new HashMap<>();
        //주요 메소드
        //1. .put(key,value):엔트리추가
        map1.put("유재석", 95);
        map1.put("강호동", 100); //value는 중복가능
        map1.put("유재석", 100);

        //2. .get(key) :특정한 key의 value반환
        System.out.println("map1.get(\"강호동\") = " + map1.get("강호동"));

        //3. .size() 전체 엔트리 개수 반환
        System.out.println("map1.size() = " + map1.size());

        //4. .containsKey, containsValue
        boolean result1 = map1.containsKey("유재석");
        boolean result2 = map1.containsValue(100);
        //5. .remove(삭제할키):특정한 키가 존재하면 엔트리 삭제
        map1.remove("유재석");
        //6. .clear():전체 엔트리 삭제
        map1.clear();
        //7. .isEmpty:엔트리가 하나도 없으면 true,있으면 false
        boolean result3 = map1.isEmpty();
        //8. .entrySet():모든 엔트리를 집합으로 반환
        map1.entrySet();
        Set <Map.Entry<String, Integer>> set = map1.entrySet();
        Set<String> keySet = map1.keySet();
        Collection<Integer> values = map1.values(); 
        
        
        //Map 타입과 반복문의 관계
        //1.일반 for문
        //2.향상된 for문
        for (String s : map1.keySet()) {
            System.out.println(map1.get(s));
        }

        //3.forEach문
        map1.keySet().forEach((entry)->{
            System.out.println(map1.get(entry));
        });



        //map 구현체
        Map<String,Object> map; //interface
        map = new HashMap<>(); //일반 map 싱글스레드
        map = new Hashtable<>(); //멀티 스레드+동기화 지원
        map = new TreeMap<>(); //이진트리(정렬)
        Properties properties = new Properties(); //map 구현체는 아니지만 map 구조를 사용한다.+프로젝트 설정값



    } //main end
} //class end
