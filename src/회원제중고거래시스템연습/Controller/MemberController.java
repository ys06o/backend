package 회원제중고거래시스템연습.Controller;

import 회원제중고거래시스템연습.Model.Dao.MemberDao;

public class MemberController {
    private MemberController(){}
    private static final MemberController instance = new MemberController();
    public static MemberController getInstance(){ return instance; }
    private MemberDao md= MemberDao.getInstance();


    // [1] 회원가입 메소드
    public boolean signup( String mid, String mpw , String mname , String mphone ){
        System.out.println("MemberController.signup"); // soutm 중간검사( 최종 완성 후 제거 )
        System.out.println("mid = " + mid + ", mpw = " + mpw + ", mname = " + mname + ", mphone = " + mphone); // soump
        boolean result = md.signup(mid, mpw, mname, mphone);
        return result;
    }

    // [2] 로그인 메소드
    public boolean login( String mid , String mpw ){
        System.out.println("MemberController.login");
        System.out.println("mid = " + mid + ", mpw = " + mpw);
        boolean result = md.login(mid,mpw);
        return result;
    }
    private int loginSession = 0;
    public int getLoginSession(){ return loginSession; } // 다른 클래스에서 로그인상태 접근 메소드
}