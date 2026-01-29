package 종합.예제5;

public class Board {

    //1.멤버변수
    private String content;   //private란? 현재 클래스에서만 허용
    private String writer;


    //2.생성자

    //1.기본생성자
    public Board() {
    }

    //2.전체매개변수 생성자
    public Board(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }


    //getter and setter
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }



    //toString
    @Override
    public String toString() {
        return "Board{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
