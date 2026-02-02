package 도서관리시스템.View;

import 도서관리시스템.Controller.AdminController;

import java.util.Scanner;

public class AdminView {
    private AdminView(){}
    private static final AdminView instance = new AdminView();
    public static AdminView getInstance(){return instance;}

    //view->controller 싱글톤 호출
    private AdminController ac = AdminController.getInstance();


    private Scanner scan = new Scanner(System.in);
    public void adminIndex() {
        System.out.print("1.도서등록 2.전체도서조회 3.유저정보 조회 4.돌아가기 선택>");
        int ch = scan.nextInt();
        if(ch==1){bookRe();}
//        else if(ch=2){}
//        else if(ch==3){}
        if(ch==4){UserView.getInstance().index();}
    }

    //도서 등록함수
    public void bookRe() {
        System.out.print("책 이름:");
        String bookName = scan.next();
        System.out.print("책 저자:");
        String bookAuthor = scan.next();
        System.out.print("책 장르:");
        String bookGenre = scan.next();
        boolean result= ac.bookRe(bookName,bookAuthor,bookGenre);
        if (result) {
            System.out.println("도서등록성공!");
            adminIndex();
        }
        else{
            System.out.println("도서등록실패!");
        }

    }
}
