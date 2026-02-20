package DAY15;

import java.util.*;

public class Exam02 {
    public static void main(String[] args) {
        //[1]컬렉션 프레임워크
        //정의: 자료들을 수집/저장 하는 방법들을 미리 만들어둔 인터페이스/클래스
        //목적: 복잡한 자료구조를 제공받아 편리한 데이터 관리
            //자료구조? 컴퓨터가 자료들을 효율적으로 저장하는 방법/구조 ex)리스트/트리/큐 등등
        //종류:인터페이스란? 서로 다른 클래스/타입들의 기능을 통합한것
        /*
            인터페이스       구현체 
            List      ->ArrayList,Vector,LinkedList,Stack 등
            Set       ->HashSet,TreeSet 등
            Map       ->HashMap,TreeMap 등등
         */
        
        
        //[2]List 타입
        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        //List 주요 메소드
        //1. add()
        list2.add("유재석");
        list2.add("유재석"); //중복가능 list는 중복가능
        list2.add(0, "강호동"); //특정 인덱스의 추가
        System.out.println("list2 = " + list2);
        //2. .set()
        list2.set(0, "강호동2");
        System.out.println("list2 = " + list2);
        //3. .get()
        System.out.println("list2.get(1) = " + list2.get(1));
        //4. .size()
        System.out.println("list2.size() = " + list2.size());
        //5.
        boolean reselt2 = list2.contains("강호동2");
        System.out.println("reselt2 = " + reselt2);
        int result = list2.indexOf("강호동2");
        System.out.println("result = " + result);
        //6.
        System.out.println("list2.remove(2) = " + list2.remove(2));
        //7.
        System.out.println("list2.isEmpty() = " + list2.isEmpty());

        //================================================///
        //List 타입과 반복문
        //1.일반 for문
        for (int index = 0; index <= list2.size() - 1; index++) {
            System.out.println(list2.get(index));
        } //for end

        //2.향상된 for문
        for (String s : list2) {
            System.out.println(s);
        }

        //3.forEach문(실무):리스트내 요소 들을 하나씩 반복변수에 대입하여 반복실행한다.
        //변수명.forEach( (반복변수)->{실행문;});
        list2.forEach((str)->{
            System.out.println(str);
        });

        //4.List 구현체들
        List<Integer> list; //인터페이스 타입

        //공통:여러 요소값들을 순서대로 저장하는 구조
        list = new ArrayList<>(); //*싱글스레드, 비동기화 메소드
        list = new Vector<>(); //멀티스레드 ,동기화메소드
        list.add(0, 50);
        list = new LinkedList<>();
        list.add(0, 100); //3번 인덱스의 100 대입
        list = new Stack<>();
        Stack<String> stacks = new Stack<>();
        stacks.push("유재석");
        System.out.println(stacks.pop());
        System.out.println(stacks.pop());
        //입구와 출구가 하나라서 선형리스트구조 먼저 들어온 값이 나중에 나간다. LIFO(Last in First Out)
    } //main end
} //class end 
