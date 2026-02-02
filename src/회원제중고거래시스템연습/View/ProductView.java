package 회원제중고거래시스템연습.View;


import 회원제중고거래시스템연습.Controller.MemberController;
import 회원제중고거래시스템연습.Controller.ProductController;

import java.util.Scanner;

public class ProductView {
    private ProductView() {
    }

    private static final ProductView instance = new ProductView();

    public static ProductView getInstance() {
        return instance;
    }

    private ProductController pc = ProductController.getInstance();
    private MemberController mc = MemberController.getInstance();
    private Scanner scan = new Scanner(System.in);

    public void index() {
        System.out.println("1.제품등록 2.제품전체조회 3.로그아웃 선택>");
        int ch = scan.nextInt();
        if (ch == 1) {
            add();
        } else if (ch == 2) {
        } else if (ch == 3) {
        }
    }

    // [1] 제품 등록 페이지
    public void add() {
        System.out.print("제품명 :");
        String pname = scan.next();
        System.out.print("제품가격 : ");
        int pprice = scan.nextInt();
        System.out.print("제품설명 : ");
        String pcomment = scan.next();
        boolean result = pc.add(pname,pprice,pcomment);
        if (result) {
            System.out.println("제품 등록 성공 ");
        } else {
            System.out.println("제품 등록 실패");
        }
    }



}