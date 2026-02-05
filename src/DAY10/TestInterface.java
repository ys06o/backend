package DAY10;

public interface TestInterface {
    //*멤버변수 불가능
    int a=0; //멤버변수 불가능
    public static final int b=10; //상수는 가능
    // *생성자 불가능
    //*추상메소드:메소드 선언만하는것  중괄호가 없음
    public abstract void method();
    void method2(int x);// public abstract 생략가능
}
