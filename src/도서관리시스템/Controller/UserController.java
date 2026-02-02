package 도서관리시스템.Controller;

import 도서관리시스템.Model.Dao.UserDao;
import 도서관리시스템.View.AdminView;

public class UserController {
    private UserController(){}
    private static final UserController instance = new UserController();
    public static UserController getInstance(){return instance;}

    //controller->dao싱글톤 호출
    private UserDao ud = UserDao.getInstance();

    //adminView호출
    AdminView av = AdminView.getInstance();

    //1.회원가입 메소드
    public boolean signup(String id,String pw,String userName) {
        System.out.println("UserController.signup");
        System.out.println("id = " + id + ", pw = " + pw + ", userName = " + userName);
        boolean result=ud.signup(id,pw,userName);
        return result;
    }




    //2.로그인 메소드
    private int loginSession=0;
    public int login(String id,String pw) {
        System.out.println("UserController.login");
        System.out.println("id = " + id + ", pw = " + pw);
        int result=ud.login(id,pw);
        if(result>0){
            loginSession=result;
            return 1;
        } else if (result == -1) {
            System.out.println("관리자 로그인 성공");
            System.out.println("관리자페이지로 이동");
            av.adminIndex();
            return -1;
        }
        return 0;
    }

    //3.로그아웃 메소드
    public boolean logout() {
        loginSession=0;
        return true;
    }







}
