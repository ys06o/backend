package DAY14;

import javax.swing.plaf.TableHeaderUI;
import java.time.LocalTime;
import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        //[시계 스레드 만들기]
        시계스레드 time1 = new 시계스레드();
        Thread thread1 = new Thread(time1);
        thread1.start();

        //타이머 스레드 만들기
        Timer timer = new Timer();
        timer.start();

        //main thread 입력
        for (; ; ) {
            System.out.println("타이머: 1)on 2)off");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            if(ch==1){
                Timer timer1 = new Timer();
                timer.state=true;
                timer1.start();
            } else if (timer!=null) {
               timer.state=false;
            }
        }


    } //main end
} //class end



class 시계스레드 implements Runnable {
    @Override
    public void run() {
        for (;; ) {
            System.out.println(LocalTime.now()); //현재시간
            try {
                Thread.sleep(990); //메인스레드가 아닌 현재 작업스레드 1초 일시정지
            }catch (Exception e){}
        }
    }
} //class end


class Timer extends Thread {
    boolean state=false; //타이머 실행 상태
    @Override
    public void run() {
        int second=0; //타이머가 계산하는 초
        for (; ; ) {
            if (state == false) { //타이머 종료
                break;
            }
            second++;
            System.out.printf("현재 타이머:%d초\n",second);
            try {
                Thread.sleep(990); //메인스레드가 아닌 현재 작업스레드 1초 일시정지
            }catch (Exception e){}
        } //for end
    } //run end
} //class end