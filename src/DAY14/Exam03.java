package DAY14;

public class Exam03 {
    public static void main(String[] args) {

        //[동기화vs 비동기화],메소드들은 비동기화 상태이다.
        /*
        //[동기화]
            1.정의:메소드/기능 에 Lock(락)을 사용하여 메소드를 점령 하는 상태
            2.목적:서로다른 여러 스레드가 동시에 하나의 메소드에 사용한다면 충돌 가능성이있다.
            3.비교
                동기화                                                         비동기화
                처리순서를 보장                                            처리순서를 보장 x
                예시:주문 순서대로 음료를 제조후 손님에게 준다.        제조가 먼저 완성된 음료를 손님에게 준다.

            4.사용법
            synchronized 타입명 메소드명(){}
            전제조건 2개이상의 스레드가 동일한 객체를 썼을때만 사용한다.
         */

        //1. 계산기 객체 생성
        계산기 계산기 = new 계산기();
        //2.스레드A
        작업스레드A threadA = new 작업스레드A();
        threadA.계산기=계산기;
        //3.스레드B
        작업스레드B threadB=new 작업스레드B();
        threadB.계산기=계산기;
        //2개의 스레드가 동일한 계산기 객체를 멤버변수로 갖는예제
        threadA.start();
        threadB.start();

    } //main end
} //class end


class 계산기 {
    int memory; //멤버변수 //계산기가 갖는 값

    public synchronized void setMemory(int memory) { //동기화 메소드
        //this란 현재 메소드를 실행한 객체
        //멤버변수와 매개변수명이 같을때 식별용
        this.memory=memory;
        try {
            Thread.sleep(2000); //2초간 스레드 일시정지
        }catch (Exception e){}
        System.out.println(Thread.currentThread().getName());
        System.out.println("결과:"+this.memory);
    }
} //class end



//2개의 스레드가 동일한 계산기 객체를 갖는다.
class 작업스레드A extends Thread {
    계산기 계산기;

    @Override
    public void run() {
        계산기.setMemory(100);
    }
}

class 작업스레드B extends Thread {
    계산기 계산기;
    @Override
    public void run() {
        계산기.setMemory(200);
    }
}

