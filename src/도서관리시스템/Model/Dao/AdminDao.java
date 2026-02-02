package 도서관리시스템.Model.Dao;

import 도서관리시스템.Model.Dto.BookDto;

import java.util.ArrayList;

public class AdminDao {
    private AdminDao(){}
    private static final AdminDao instance = new AdminDao();
    public static AdminDao getInstance(){return instance;}

    private static final ArrayList<BookDto> bookDtos = new ArrayList<>();

    private int bookNo=1;
    public boolean bookRe(String bookName, String bookAuthor, String bookGenre) {
        BookDto bookDto = new BookDto(bookNo, bookName, bookAuthor, bookGenre);
        boolean result = bookDtos.add(bookDto);
        if (result) {
            bookNo++;
        }
        return result;

    }

    //저장된 도서 리스트를 반환
    public ArrayList<BookDto> getBookDtos() {
        return bookDtos;
    }

    //3.대출 메소드
    public boolean bookLoan(int number) {
        for (int index = 0; index <= bookDtos.size() - 1; index++) {
            BookDto bookDto = bookDtos.get(index);
            if (bookDto.getBookNo() == number) {
                bookDtos.remove(number);  //book테이블에 대출한 책 정보 지우기
                return true;
            }
        }
        return false;
    }


}
