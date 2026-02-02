package 종합.과제2.Model;

import 종합.예제6.model.dto.BoardDto;

import java.util.ArrayList;

public class WaitingDao {
    private WaitingDao(){} //1.기본생성자 생성
    private static final WaitingDao instance = new WaitingDao(); //2.객체 생성

    public static WaitingDao getInstance() {
        return instance;
    }

    public static final ArrayList<WaitingDto> waiting = new ArrayList<>(); //데이터베이스

    //1.기능 구현
    private static int No=1; //등록대기번호 초기값 1로 세팅
    //2.등록 처리:controller가 전화번호랑 인원수를 전달하여 등록 요청(db에 대기명단을 등록해주세요라고 요청하는거)
    public boolean Post(String phoneNumber,int people) {
        //1.controller에서 받은 매개변수에 따른 객체를 생성 한다.
        WaitingDto waitingDto = new WaitingDto(No, phoneNumber, people);
        //2.데이터베이스에 추가가 됐으면 true 즉 등록이 완료됐으면 true반환 등록 실패면 false반환
        boolean result=waiting.add(waitingDto); //waitingDto 즉 등록대기명단 하나를 waiting이라는 ArrayList(데이터베이스)에 추가한다.
        No++; //1.등록이 됐으면 대기명단번호를 1씩 증가
        return result; //등록이 됐는지 안됐는지를 controller에게 알려줌
    }




    //controller가 dao(db)에 모든 대기명단 정보를 달라고 요청
    public ArrayList<WaitingDto> Get(){
        return waiting;
    }


}


