package DAY10;

public class Exam03 {
    public static void main(String[] args) {
        //1.구현체
        Buy buy=new Customer();
        buy.method1(); //추상메소드호출 가능
//      buy.method6(); //다른 인터페이스의 메소드 x

        //2.디폴트 메소드 실행 가능
        buy.method2(2);

        //3. static메소드 호출 가능
        Buy.method3(); //단 인터페이스를 불러야 한다.
//        Buy.method4(); //private 이므로 호출 불가능
//        Buy.method5(); //private 이므로 호출 불가능

        Customer customer=(Customer)buy;
        Sell sell=customer;
        sell.method6();

    } //main end
} //class end

interface Buy {
    //*상수
    //1)추상메소드:선언부만 있고 구현부 없음 **구현체가 구현할 대상**
    public abstract void method1();

    //2)디폴트메소드:인터페이스가 구현한 메소드 일반메소드랑 동일(오버라이딩 선택)
    public default int method2(int x) {
        return x;
    }

    //3)정적메소드:인터페이스 내 정적 구현 메소드,구현체 없이 실행가능
    public static void method3() {
        System.out.println("정적구현메소드");
    }

    //4) private 메소드:현재 인터페이스내에서만 사용하는 메소드(오버라이딩x)
    private void method4() {
    }

    private static void method5() {
    }

} //interface end

interface Sell {
    void method6();
} //interface end

class Customer extends Object implements Buy,Sell{//상속은 extends 1번 구현은 여러번 가능
    //extends는 오버라이딩 선택, implements(추상메소드에 한해)는 오버라이딩 필수!
    //생성 ->메소드 재정의

    @Override
    public void method1() {System.out.println("판매");}

    @Override
    public void method6() {System.out.println("구매");}

}
