package DAY07.package1;

public class B {
    public void 메소드() {
        //다른 클래스: 접근제한자 의미가 있는지 확인
        A a = new A();
//        System.out.println("a.공개변수 = " + a.공개변수); //가능
//        System.out.println("a.비공개변수 = " + a.비공개변수); //에러
//        System.out.println("a.일반변수 = " + a.일반변수); //가능
        a.메소드();//가능
//        a.비공개메소드();
    }
}
