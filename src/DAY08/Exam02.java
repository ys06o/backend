package DAY08;

public class Exam02 {
    public static void main(String[] args) {
        //1. 싱글톤:프로그램내 단 하나의 인스턴스(객체)를 갖는 설계 구조
        //2.싱글톤 생성
        //3.다른 클래스에서 싱글톤 호출, 클래스명.getInstance();
       Controller controller1= Controller.getInstance();
       Controller controller2= Controller.getInstance();
    } //main end
} //class end


class Controller { //해당 클래스의 싱글톤 패턴 적용하기
   private Controller(){} //1. 생성자를 private 한다. ->다른 클래스에서 new를 못한다.->객체 생성 불가능
   private static final Controller instance=new Controller(); //2.상수(static final)에 객체 생성하여 저장
   //3. 해당 싱글톤(객체)를 다른 클래스에서 간접 사용(공유)하도록 getter를 만든다.
   public static Controller getInstance(){
       return instance; //2번에서 생성한 싱글톤(객체)를 반환한다.
   }


}