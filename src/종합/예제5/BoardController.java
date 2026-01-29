package 종합.예제5;

//1.데이터 표본들을 제어하는 기능 클래스
public class BoardController {

    //[1]
    private static final Board[] boards = new Board[100];

    //[2]기능1: 저장 기능
    public static boolean doPost(String content,String writer) {
        //1.생성자를 이용한 객체 생성
        Board board = new Board(content, writer);
        for (int i = 0; i < boards.length; i++) {
            if (boards[i] == null) {
                boards[i] = board;
                return true;
            }
        }
        return false;
    }

    //[3]기능2:조회 기능,boards를 리턴하므로 반환타입은 boards의 타입인 Board[]
    public static Board[] doGet() {
        return boards;
    }//class end
}



