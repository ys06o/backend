package 도서관리시스템.View;

import 도서관리시스템.Controller.UserController;
import 도서관리시스템.Model.Dao.AdminDao;
import 도서관리시스템.Model.Dto.BookDto;

import java.util.ArrayList;
import java.util.Scanner;

public class UserView {
    //싱글톤 생성
    private UserView(){}
    private static final UserView instance = new UserView();
    public static UserView getInstance(){return instance;}

    //view->controller 싱글톤 호출
    private UserController uc = UserController.getInstance();
    private AdminDao ad = AdminDao.getInstance();

    //1.회원가입 페이지
    private Scanner scan = new Scanner(System.in);

    //1-1.첫화면
    public void index() {
        for (; ; ) {
            System.out.print("1.회원가입 2.로그인 선택>" );
            int ch = scan.nextInt();
            if(ch==1){signup();}
            else if(ch==2){login();}
        }
    }

    //1-2 회원가입(1번을눌렀을때)
    public void signup() {
        System.out.print("아이디:"); String id=scan.next();
        System.out.print("비밀번호:"); String pw=scan.next();
        System.out.print("유저이름:"); String userName=scan.next();
        boolean result = uc.signup(id,pw,userName);
        if (result == true) {
            System.out.println("회원가입 성공!");
        } else {
            System.out.println("회원가입 실패");
        }
    }

    //1-3로그인(2번을 눌렀을때)
    public void login() {
        System.out.print("아이디:"); String id=scan.next();
        System.out.print("비밀번호:"); String pw=scan.next();
        int result=uc.login(id,pw);
        if(result==1){
            System.out.println("로그인 성공");
            userMain();
        } else if (result == -1) {
            System.out.println("");
        } else {
            System.out.println("로그인실패");
        }
        }


    //2.로그인되고 유저화면
    public void userMain() {
        System.out.print("1.도서 대출 2.도서 반납 3.도서 조회 4.로그아웃 선택>");
        int ch = scan.nextInt();
        if (ch == 1) {
            bookLoan();
        }
    }


    //2-1.도서 대출 버튼을 눌렀을떄
    public void bookLoan() {

        for (BookDto book : ad.getBookDtos()) {
            System.out.println("book = " + book);
        }
        System.out.print("대출할 도서번호를 입력하세요:");
        int number = scan.nextInt();

        boolean result=true; //임시로
        if (result==true) {
            System.out.println("도서 대출성공!");
        } else {
            System.out.println("도서대출 실패");
        }
        userMain();
    }

    }


