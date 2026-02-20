package DAY15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exam03 {
    public static void main(String[] args) {
        //[2]set 인터페이스,순서없는 저장->중복 불가
        Set<String> set1 = new HashSet<>();
        //Set 주요 메소드
        //1. .add():요소 추가
        set1.add("유재석"); set1.add("유재석"); //중복 불가능
        set1.add("강호동");
        System.out.println("set1 = " + set1);
        //인덱스가 없으므로 set,get,indexOf 메소드 없음
        //2. .size():전체 요소 개수
        System.out.println("set1.size = " + set1.size());
        //3. .contains(찾을값):찾을값이 존재하면 true,아니면 false
        boolean result = set1.contains("유재석");
        //4. .remove()
        set1.remove("유재석");
        //5. .isEmpty():요소가 하나도 없으면 true 있으면 false
        System.out.println("set1.isEmpty() = " + set1.isEmpty());
        
        //6. .iterator():집합(set)요소들을 반복 할 수 있도록 인터페이스 반환
        Iterator<String> iterator= set1.iterator();
        while (iterator.hasNext()) {  /// .hasNext() 다음 요소가 존재하면 이동 존재하면 true,없으면 false
            System.out.println(iterator.next());
        }
        ///=============================================////////////
        
        //집합(set)과 for관계
        //1.일반 for문 불가능
        //2.향상된 for문
        for (String s : set1) {
            System.out.println("s = " + s);
        }

        //3.forEach
        set1.forEach((str)->{
            System.out.println(str);
        });

        ///==============================================////
        //Set 구현체
        Set<Integer> set;
        set = new HashSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        set.add(50);
        set.add(20);
        set.add(10);

        System.out.println("set = " + set);


        //이진트리 란? 각각의 노드가 최대 2개의 노드를 연결하는구조
        //작은 값이 추가되면 왼쪽노드에 생성,큰값이 추가되면 오른쪽노드에 추가하는 구조
        //기본값은 오름차순  ///.descendingSet() 내림차순
        System.out.println(set2.descendingSet());

        //활용처:정렬(검색 최적화)



    } //main end
} //class end
