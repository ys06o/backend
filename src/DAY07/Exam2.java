package DAY07;

import DAY07.package1.A;

public class Exam2 {
    public static void main(String[] args) {

        //[1] 접근 제한자: 클래스,멤버변수,메소드 등등 호출 제한
        //[2]종류
          //public:공개,프로젝트 내 어디서든 접근(호출) 가능
          //private:비공개,현재클래스 에서만 호출 가능
          //(default):같은/하위 패키지에서만 호출 가능,접근제한자가 없을때 자동
          //protected:같은/하위 패키지 에서만 호출 가능,상속 관계 예외

        //[3]사용법
          //1. public/default class명{}:클래스 키워드 앞에서 작성
          //2. 접근제한자 타입 멤버변수;  :멤버변수 타입 앞에서 작성
          //3.접근제한자 반환타입 메소드명(){}  :반환 타입 앞에서 작성
          //4.접근제한자 생성자명(){}         :생성자명 앞에서 작성


        //[4]DAY07 폴더내 package1

        A a = new A();
//        System.out.println("a.공개변수 = " + a.공개변수); //가능
//        System.out.println("a.비공개변수 = " + a.비공개변수); //에러
//        System.out.println("a.일반변수 = " + a.일반변수);

        a.메소드(); //가능
//        a.비공개메소드(); //에러


        //[5]import:다른 패키지의 클래스 호출
        //자동완성시 자동으로 최상단에 import DAY07.package1.A;
        // -->DAY07폴더내 package1폴더내 'A'클래스를 가져온다.
        //ex) import java.util.Scanner;
        //->java폴더내 util폴더 내 Scanner 클래스를 가져온다.
        //*java.lang패키지는 import를 생략한다.
    }
}
