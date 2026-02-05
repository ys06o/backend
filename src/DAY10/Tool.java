package DAY10;

public class Tool implements TestInterface {
    @Override
    public void method() {
        System.out.println("해당 메소드를 구현합니다.");
    }

    @Override
    public void method2(int x) {
        System.out.println("해당메소드 구현"+x);
    }
}
