package 종합.예제6.model.dto;

public class BoardDto {
    //1.멤버변수=속성=테이블(표) 일치 권장**
    private int no;
    private String content;
    private String writer;
    //2.생성자:관례적으로 기본생성자+풀생성자
    public BoardDto() {

    }

    public BoardDto(int no, String content, String wirter) {
        this.no = no;
        this.content = content;
        this.writer = wirter;
    }
    //3.메소드:private 멤버변수에 대해 setter/getter 제공한다.
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWirter() {
        return writer;
    }

    public void setWirter(String wirter) {
        this.writer = wirter;
    }

    //toString
    @Override
    public String toString() {
        return "BoardDto{" +
                "no=" + no +
                ", content='" + content + '\'' +
                ", wirter='" + writer + '\'' +
                '}';
    }
}
