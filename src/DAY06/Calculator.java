package DAY06;

public class Calculator {
    //1.속성=멤버변수
    //2.기능=메소드=멤버함수
    //1.매개변수 X 반환값O
    double getPi() {
        //double 반환타입:return 값에 타입
        //getPi는 메소드명 :아무거나 가능하지만 카멜 표기법권장
        //():매개변수 없는 상태
        // { }:함수 실행시 처리할 명령어/코드 작성
        return 3.141592;
        //return:함수 반환값
    }

    //2.매개변수 X,반환값 X
    void powerOn() {
        System.out.println("전원을킵니다.");
        return; //return은 생략가능
    }


    //3.매개변수 O,반환값 X
    void printSum(int x,int y) {
        //soutp는 자동으로 매개변수 출력
        System.out.println(x+y);
    }


    //4.매개변수 O,반환값 O
    int add(int x, int y) {
        System.out.println("더하기 합니다.");
        return x + y; //int+int->int
    }

    //*)동일한 클래스내 메소드 호출
    void print() {
        printSum(10,20);
    }
} //class end
