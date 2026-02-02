package 종합.과제2.Controller;

import 종합.과제2.Model.WaitingDao;
import 종합.과제2.Model.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    private WaitingController(){} //1.기본생성자 생성

    private static final WaitingController instance= new WaitingController();

    public static WaitingController getInstance() {
        return instance;
    }

    private WaitingDao wd=WaitingDao.getInstance(); //Controller에서 Dao 싱글톤 호출


    //1.등록 제어:view에서 손님이 입력한 대기명단(전화번호,인원수)를 받아서 dao(데이터베이스)에 요청후 전달
    public boolean Post(String phoneNumber,int people) {
        //1.dao(db)에게 손님이 입력한 대기명단을 전달하고 결과 받기
        boolean result = wd.Post(phoneNumber, people);
        //2.dao에게 받은 결과를 view(손님)에게 다시 전달
        return result; //등록여부를 손님에게 다시 알려줌
    }


    //2.view에서 모든 대기명단을 받아 dao에게 재요청하여 결과를 view에게 전달한다.
    public ArrayList<WaitingDto> Get() {
        ArrayList<WaitingDto> result=wd.Get();
        return result;
    }

}
