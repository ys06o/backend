package DAY11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {

        // [1] 예외처리:개발자가 구현한 로직이나 사용자의 영향으로 문제
        // ->시스템 오류:시스템이 종료되는 심각한 문제
        // [2]예외종류
        //1)일반예외:컴파일(실행) 될때 예외 처리 코드 검사
        //입출력,네트워크,파일, JDBC(DB연동) 등 주로 외부와 통신할때
        //2)실행예외:실행 도중에 발생하는 예외 처리 코드 검사(개발자 예측/경험 의존도가 크다)
        //연산문제,null,index 등 주로 코드적인 문제 ,아니면 데이터타입문제 등등
        // [3]목적: 1)예외 고치는게 아니라 예외가 발생하면 피해서 다른 코드로 이동
        //즉 24시간 코드실행
        // [4]사용법:
        //try{예외가 발생하거나 발생할것같은 코드}
        //catch(발생한예외클래스명 변수명} {만약에 예외발생이 했으면 처리할 코드}
        //1)일반예외 예시, Class.forName("패키지명.클래스명"):현재 프로젝트내 클래스가 존재하는지 검사/동적할당
        // [5]주요 예외 클래스
        //1.ClassNotFoundException:클래스를 못 찾았을때 발생하는 예외 클래스
        //2.InterruptedException:흐름(스레드)가 중단 되었을때 발생하는 예외 클래스
        //3. NullPointerException:객체가 null값 일때 접근연산자 사용시 발생하는 예외 클래스
        try {
            Class.forName("java.lang.String2"); // String 클래스가 존재하는지 확인
        } catch (ClassNotFoundException e) {
            System.out.println("예외발생:String 클래스가 없습니다.");
        }
        //2)일반예외 예시2: Thread.sleep(밀리초),현재 흐름(스레드) 일시정지 메소드
        try {
            Thread.sleep(1000); //현재 흐름(스레드) 1초간 일시정지
        } catch (InterruptedException e) {
            System.out.println("예외발생2:스레드 중단 발생했습니다.");
        }

        //일반예외 클래스들은 실행 전에 코드 밑줄에 빨강색으로 예외 발생 가이드라인을 해준다.

        //3)실행예외 예시1
        try {
            String name = null;
            System.out.println(name.length()); // .연산자는 객체가 존재 해야만 가능하다.

        } catch (NullPointerException e) {
            System.out.println("실행예외발생1:null은 메소드를 호출 할 수 없다.");
        }
        //4)실행예외 예시2
        try {
            String str1 = "100";
            String str2 = "1abc";
            int int1 = Integer.parseInt(str1); //Integer.parseInt(문자열):문자열을 정수타입으로 변환하는 메소드
            int int2 = Integer.parseInt(str2); //NumberFormatException
        }catch (NumberFormatException e){
            System.out.println("실행예외발생2:정수타입으로 변환 불가능");
        }

        //5)실행예외 예시3:ArrayIndexOutOfBoundsException
        int[] arry1 = {1, 2, 3, 4};

        try {
            System.out.println(arry1[3]);
            System.out.println(arry1[5]); //오류발생 ****예외발생****
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행예외발생3:존재하지 않는 인덱스입니다.");
        }

        //6)실행예외 예시4:InputMismatchException
        try {
            Scanner scan = new Scanner(System.in);
            int value = scan.nextInt(); //만약에 비정상적인 입력값이면 예외가 발생
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("입력 할 수 없는 정보 또는 잘못된 형식입니다.");
        }

        //7) 다중 catch문/     예외는 다양한 이유로 발생한다. 예외 중에 상위(부모)클래스가 존재한다. Exception 클래스
        try {

        }catch(NumberFormatException e2){
            System.out.println(e2);
        }
        catch (NullPointerException e1) {
            System.out.println(e1);
        } catch (Exception e) { //모든 예외에 대해 처리 해주는 상위 클래스, 다중 catch를 할 경우 가장 마지막에 하단에 사용한다.
            System.out.println(e);
        }finally {
            System.out.println("예외가 발생하던 안하던 무조건 실행되는 코드");
        }


    } //main end
} //class end
