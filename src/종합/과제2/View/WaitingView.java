package 종합.과제2.View;

import 종합.과제2.Controller.WaitingController;
import 종합.과제2.Model.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    private Scanner scan = new Scanner(System.in); //입력객체 생성
    private WaitingView(){} //1. 기본생성자 생성
    private static final WaitingView instance =new WaitingView(); //2.객체 생성
    public static WaitingView getInstance(){ //3.getter메소드 생성
        return instance;
    }

    private WaitingController wc = WaitingController.getInstance();  //Controller 싱글톤 호출


    //1.등록 입출력 화면
    public void View() {
        scan.nextLine();
        System.out.print("전화번호를 입력해주세요:");
        String phoneNumber = scan.nextLine();
        System.out.print("인원수를 입력해주세요:");
        int people = scan.nextInt();

        //1.입력한 전화번호와 인원수를 controller에게 전달하여 결과를 받아오기
        boolean result = wc.Post(phoneNumber, people);
        //2.받은 결과에 따라 화면에 출력해주기 등록여부
        if (result) {
            System.out.println("대기명단에 등록성공하였습니다.");
        } else {
            System.out.println("대기명단에 등록실패하였습니다.");
        }
    }


    //2.전체 조회 입출력 화면
    public void printView() {
        //controller에게 모든게시물 요청하고 결과를 받는다.
        ArrayList<WaitingDto> waitingDto=wc.Get();
        //2.받은 결과를 모두 출력
        for(WaitingDto waiting:waitingDto){
            System.out.printf("대기번호:%d, 전화번호:%s, 인원수:%d명\n", waiting.getNo(), waiting.getPhoneNumber(), waiting.getPeople());
        }
    }



    public void indexView(){
        for (; ; ) {
            System.out.println("============ 맛집 대기 시스템 ============ ");
            System.out.println("1.대기등록| 2.대기현황");
            System.out.println("====================================== ");
            System.out.print("선택>");
            int ch = scan.nextInt();
            if( ch == 1 ){View(); }
            else if( ch == 2 ){ printView(); }
        }
    }


}
