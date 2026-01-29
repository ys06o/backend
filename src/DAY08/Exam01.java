package DAY08;

import java.util.ArrayList;

public class Exam01 {
    public static void main(String[] args) {

        //[1] ArrayList 클래스:컬렉션(수집)프레임(틀)워크(일), 수집관련 클래스/기능 제공
        //[2] 정의:컬렉션 프레임워크 중 리스트(배열) 자료형 클래스/타입
        //[3] 목적:가변(변하는 요소들의수)길이의 배열 제공과 기능/메소드 제공 결론은 편하다.
        //[4]사용법
          //1.선언/정의 하기:ArrayList<항목타입> 변수명=new ArrayList()<>;
          //< >괄호는 제네릭 타입으로 리스트안에 저장할 *항목*들의 타입
        // ->제네릭타입은 기본타입 불가능하므로int->Integer 클래스로 변경해서 작성
        ArrayList<String> 리스트변수명 = new ArrayList<>(); //여러개 String객체를 저장하는 리스트
        //vs String[] 변수명=new String[100];
        //2.요소 추가: .add(새로운값); for문안써도 가능 마지막 요소에 자료 추가
        리스트변수명.add("유재석");
        //3. 요소들 전체 출력:리스트변수명
        System.out.println(리스트변수명);// result:유재석
        리스트변수명.add("강호동");
        리스트변수명.add("신동염");
        리스트변수명.add("김철수");
        System.out.println(리스트변수명);
        리스트변수명.add(1, "서장훈");  //.add(인덱스,새로운값) 특정한 인덱스애 자료 추가 즉 요소 중간 삽입이 가능하다.
        System.out.println("리스트변수명 = " + 리스트변수명);
        //5.요소 수정:.set(인덱스,수정할 값):특정한 인덱스에 자료 수정
        리스트변수명.set(1, "변수명");
        System.out.println("리스트변수명 = " + 리스트변수명);
        //6.요소 총개수:.size():리스트내 항목/요소/값 들의 총개수 반환
        System.out.println(리스트변수명.size());
        //7.요소 값 호출:.get(인덱스):특정한 인덱스의요소값 반환
        System.out.println(리스트변수명.get(0));
        System.out.println(리스트변수명.get(2));

        //8.요소 삭제:remove(인덱스):특정한 인덱스의 요소 삭제
        리스트변수명.remove(1);
        System.out.println(리스트변수명);
        
        //9.요소 찾기:.indexof(찾을값):찾을값이 존재하면 인덱스 반환,없으면 -1
        int 찾은결과 = 리스트변수명.indexOf("유재석");
        System.out.println("찾은결과 = " + 찾은결과);
        
        //10.요소 찾기2: .contains(찾을값):찾을값이 존재하면 true,아니면 false;
        boolean 찾은결과2 = 리스트변수명.contains("강호동");
        System.out.println("찾은결과2 = " + 찾은결과2);
        
        //5.반목문과 리스트 활용
          //1.일반 for문
        for (int index = 0; index <= 리스트변수명.size() - 1; index++) {
            System.out.println("리스트변수명.get(index) = " + 리스트변수명.get(index));
        }

        //2.향상된 for문
        for (String str : 리스트변수명) {
            System.out.println("str = " + str);
        }
        
        //11. 요소 전체 삭제:.clear()
        리스트변수명.clear();
        //12.요소 존재 여부: .isEmpty():리스트내 요소가 하나도 없으면 true 있으면 false
        boolean 여부 = 리스트변수명.isEmpty(); //마지막에 clear를 했으므로 여부는 true
        System.out.println("여부 = " + 여부);
        System.out.println(리스트변수명);
    } //main end
} //class end
