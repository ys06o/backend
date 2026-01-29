package DAY07;

public class Exam04 {
    void 멤버메소드() { //1.멤버메소드
    }
    static void 정적메소드(){ //2.정적메소드
    }
    public static void main(String[] args) {

        //[1] final:
        //사용법->final 타입 변수명=초기값;
        // ->final 변수는 초기값이 무조건 필수이다.<수정 불가이기때문>

        //[2]static 정적인
        //사용법-> static 타입 변수명;   ,static void 메소드명(){}
        //->static  변수/메소드는 프로그램 실행시 우선(메모리)할당 되고 프로그램 종료시 까지 유지
        //->메모리할당된 변수 /메소드 이므로 객체가 필요없다. <과도한 사용은 권장x)
        Exam04 exam04 = new Exam04(); //객체를 만들어서 멤버메소드를 호출하자.
        exam04.멤버메소드(); //error//static 갖는 변수/메소드는 우선할당 이므로 객체가 아닌 멤버 메소드를 모른다.
        정적메소드(); //가능  //main메소드가 static을 갖고 정적메소드도 static도 갖기 때문에 서로 알고 있는 상태<객체가 필요없다.>
        //->프로그램내 공유 변수,공유 메소드에 대해 사용
        //->static을 갖는 메소드는 실행문에서 일반메소드 호출이 불가능하다. <객체 필요> 왜? static이 먼저 할당되고 main 메소드는 일반메소드를 모르기때문에 객체가 필요하다.
        // 클래스명.정적(static)변수
        System.out.println(D.point); //가능
        System.out.println(D.name); // 가능
        //그냥 final은 객체가 필요하다...
        D d = new D();
        System.out.println(d.최종변수);

        //
//        D.method1(); //static이 아니라서 오류..
        d.method1(); //d라는 객체를 만들었긴때문에 객체변수.메소드명(); 이건가능
        D.method2(); //static이기 때문에 가능

    }
}


class D {  //***final 키워드는 초기값이 필수***
    final int  최종변수=3;
    //* staic 키워드는 (객체들간의) 공유변수이므로 초기값이 필요없다.
    static int point;
    //* 상수, public static final 타입명 변수명=초기값;    어디서든 접근 가능하고 먼저할당되고 값이 변하지않는 거
    public static final char name = 'A';
    //final 메소드:오버라디이/재정의 금지
    //static 메소드:객체 유/무상관없이 호출가능하다. 단.static을 갖는 메소드는 실행문에서 일반메소드 호출이 불가능하다. <객체 필요> 왜? static이 먼저 할당되고 main 메소드는 일반메소드를 모르기때문에 객체가 필요하다.
    public final void method1() {

    }

    public static void method2() {

    }

}
