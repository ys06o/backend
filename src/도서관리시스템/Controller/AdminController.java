package 도서관리시스템.Controller;

import 도서관리시스템.Model.Dao.AdminDao;
import 도서관리시스템.View.AdminView;

public class AdminController {
    private AdminController(){}
    private static final AdminController instance = new AdminController();
    public static AdminController getInstance(){return instance;}

    //contorller->dao 싱글톤 호출
    private AdminDao ad = AdminDao.getInstance();

    public boolean bookRe(String bookName,String bookAuthor,String bookGenre) {
        boolean result=ad.bookRe(bookName,bookAuthor,bookGenre);
        return result;
    }

    //4.도서대출 메소드

    public boolean bookLean(int number) {
        boolean result=true;
        return result;
    }
}
