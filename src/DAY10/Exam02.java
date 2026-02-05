package DAY10;

public class Exam02 {
    public static void main(String[] args) {

        // [1] 인터페이스 객체 생성 불가능 하다.
//        new 키보드(); //오류 생성자가 없기때문에
        // [2]인터페이스 타입의 변수 선언
        키보드 myKeyBoard;
//        myKeyBoard.aKey(); //오류:추상메소드는 실행 안된다.
        // [3]구현=클래스에서 오버라이딩

        //[4] 구현(객)체 :해당 인터페이스를 구현한 클래스로 객체 생성
        myKeyBoard = new 격투게임(); //키보드에 격투게임을 연결
        myKeyBoard.aKey(); //공격
        myKeyBoard.aKey(); //공격
        myKeyBoard.bKey(3, 2); //방어
        System.out.println("=============게임 교체========");
        //[5] 다형성: 게임 교체
        myKeyBoard = new 축구게임(); //키보드에 축구게임 연걸
        myKeyBoard.aKey();
        myKeyBoard.bKey(3, 2);

        //[6]구현체 없이 자체적으로 구현==익명(이름없는)구현체
//        new 인터페이스명(){오버라이딩}
        myKeyBoard=new 키보드() {
            @Override
            public void aKey() {
                System.out.println("[밥먹기]");
            }

            @Override
            public int bKey(int x, int y) {
                System.out.println("안녕");
                return 0;
            }
        };
        myKeyBoard.aKey(); //밥먹기
        myKeyBoard.bKey(3, 4); //안녕



    } //main end
} //class end

class 격투게임 implements 키보드 {
    //implements란? 해당 인터페이스내 추상메소드를 구현한다.
    //즉 오버라이딩 필수!

    @Override
    public void aKey() {
        System.out.println("[공격]");
    }
    @Override
    public int bKey(int x, int y) {
        System.out.println("방어");
        return x+y;
    }
}

class 축구게임 implements 키보드 {
    // 구현체는 오버라이딩 필수이다.

    @Override
    public void aKey() {
        System.out.println("[슈팅]");
    }

    @Override
    public int bKey(int x, int y) {
        System.out.println("[태클]");
        return x+y;
    }
}
