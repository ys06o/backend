package 종합.예제6.view;

import 종합.예제6.controller.BoardController;
import 종합.예제6.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    private  BoardView(){}//[1]

    private static final BoardView instance = new BoardView();  //[2]

    public static BoardView getInstance() { //[3]
        return instance;
    }

    //MVC패턴 흐름의 controller 싱글톤 호출
    private BoardController bc = BoardController.getInstance();

    private Scanner scan = new Scanner(System.in);
    //1)전체 조회 입출력 화면
    public void writeView() {
        System.out.print("작성자:");
        String writer = scan.nextLine();
        System.out.print("내용:");
        String content = scan.nextLine();
        //컨트롤러에게 입력받은 content,writer를 전달하여 결과 받아오기
        boolean result=bc.doPost(content,writer);
        //2.받은 결과에 따른 화면에 출력하기
        if (result) {
            System.out.println("글쓰기 성공");
        } else {
            System.out.println("글쓰기 실패");
        }
    }


    public void printView() {
        //1.컨트롤러에게 모든 게시물 요청하고 결과를 받는다
       ArrayList<BoardDto> boards=bc.doGet();
       //2.받은 결과를 모두 출력한다. // ArrayList는 가변길이때문에 null 체크 여부를 안해도된다. 꿀이네
        for (BoardDto board : boards) {
            System.out.printf("번호 :%d,작성자:%s ,내용:%s\n",board.getNo(),board.getWirter(),board.getContent());
        }
    }

    //메인 입출력 화면
    public void indexView() {
        for (; ; ) {
            System.out.println("========My Community====");
            System.out.println("1.게시물쓰기|2.게시물출력");
            System.out.println("========================");
            Scanner scan = new Scanner(System.in);
            System.out.print("선택>");
            int ch = scan.nextInt();
            if (ch == 1) {
                writeView();
            } else if (ch == 2) {
                printView();
            }
        }
    }
}
