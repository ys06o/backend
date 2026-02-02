package 도서관리시스템.Model.Dto;

public class BookDto {
    private int bookNo; //도서번호
    private String bookName; //도서이름
    private String bookAuthor; //도서저자
    private String bookGenre; //도서장르
    private int state; //도서 상태
    private int userNo;  //빌려간 회원번호


    public BookDto(){}

    public int getState() {
        return state;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "bookNo=" + bookNo +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookGenre='" + bookGenre + '\'' +
                '}';
    }

    public BookDto(int bookNo, String bookName, String bookAuthor, String bookGenre) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookGenre = bookGenre;




    }
}
