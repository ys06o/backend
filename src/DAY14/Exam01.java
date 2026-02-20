package DAY14;


import java.awt.*;

public class Exam01 {
    public static void main(String[] args) {
        //[Thread 스레드]
        /*
            프로세스:프로그램(명령어의 집합)이 실행중인 흐름
            멀티 태스킹:2가지 이상의 작업을 동시의 처리하는것

            멀티 프로세스:운영체제가 2가지 이상의 프로세스 (프로그램)을 동시(병렬)의 처리 *멀티 태스킹*
            멀티 스레드:하나의 프로그램이 2가지 이상의 명령어 동시(병렬) 처리 *멀티 태스킹*

            스레드:하나의 프로세스(프로그램) 내에서 실행되는 작업단위,실행 흐름
            *js는 자체적인 스레드가 없음(브라우저/크롬:스레드)*
            *JAVA/PYTHON/C 는 자체적인 스레드가 있다.(main 함수)

            1.목적: 코드(명령어)들을 읽어들이고 cpu(컴퓨터연산장치)에게 처리한다.
            2.자바의 기본 스레드
                public static void main(String[] args) 함수가 내장됨.

            멀티 스레드:main 스레드외 새로운 작업 스레드를 생성하여 동시작업
            1.목적:*병렬처리*,동시에 여러 작업을 처리한다.
            2.사용처:웹/앱에서 필수,채팅,첨부파일,JDBC etc
            3.구현방법:
                방법1:익명구현체 Runnable runnable= new Runnable()@{Override public void run() {작업스레드 코드}}
                방법2:구현채
                방법:상속

            4.주요 메소드
            Runable 인터페이스:run 추상메소드:생성한 작업스레드가 처리할 코드집합
            Thread 클래스:start 메소드:구현된 run메소드를 실행 메소드
         */

        //[1] 단일(싱글) 스레드 에서는 띵 소리와 띵 출력을 동시에 할 수 없다.
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //자바의 ui제공하는 클래스
        for (int i = 0; i <= 5; i++) {
            toolkit.beep(); //비프음을 제공하는 함수
            try {
                Thread.sleep(1000); //Thread.sleep(밀리초): 밀리초 만큼 현재 스레드를 일시정지
            } catch (Exception e) {}
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("띵");
        }

        //[2]멀티 스레드 에서는 띵 소리와 띵 출력을 동시에 할 수 있다.
        Runnable runnable=new Runnable() { //Runable 인터페이스 익명구현체(클래스가 추상메소드 구현)
            @Override
            public void run() { //추가된 작업스레드가 처리할 코드,추가된 main함수라고 생각
                for (int i = 0; i <= 5; i++) {
                    toolkit.beep(); //비프음을 제공하는 함수
                    try {
                        Thread.sleep(1000); //Thread.sleep(밀리초): 밀리초 만큼 현재 스레드를 일시정지
                    } catch (Exception e) {}
                }
                for (int i = 1; i <= 5; i++) {
                    System.out.println("띵");
                }
            }
        }; //익명구현체 }닫기 뒤에는 ;필수
        Thread thread1=new Thread(runnable); //3. 익명구현체 인터페이스를 Thread 라는 객체에 대입
        thread1.start(); //4.스레드 객체가 start()메소드를 호출하면 run메소드를 호출한다.

        for (int i = 1; i <= 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(1000); //Thread.sleep(밀리초): 밀리초 만큼 현재 스레드를 일시정지
            } catch (Exception e) {}
        }


        //[3]멀티 스레드 방법2
        SoundBeep soundBeep = new SoundBeep();
        Thread thread2=new Thread(soundBeep);
        thread2.start();

        for (int i = 1; i <= 5; i++) {  //main thread
            System.out.println("띵");
            try {
                Thread.sleep(1000); //Thread.sleep(밀리초): 밀리초 만큼 현재 스레드를 일시정지
            } catch (Exception e) {}
        }

        //[4]멀티 스레드 방법3
        SoundBeep2 thread3 = new SoundBeep2();
        thread3.start();

        for (int i = 1; i <= 5; i++) {  //main thread
            System.out.println("띵");
            try {
                Thread.sleep(1000); //Thread.sleep(밀리초): 밀리초 만큼 현재 스레드를 일시정지
            } catch (Exception e) {}
        }


    } //main end
} //class end


class SoundBeep implements Runnable {
    //*Runnable* 인터페이스를 구현
    //*run 이라는 추상메소드를 구현 ->작업스레드가 처리할 코드
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 1; i <= 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
} //class end


class SoundBeep2 extends Thread{
    //*Thread 클래스 상속*//
    //*run 메소드를 재정의 ->추가 작업스레드가 처리할 코드

    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 1; i <= 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
