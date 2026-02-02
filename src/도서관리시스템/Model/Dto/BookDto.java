package 도서관리시스템.Model.Dto;

public class BookDto {
    private int bookNo;
    private String bookName;
    private String bookAuthor;
    private String bookGenre;

    public BookDto(){}

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
