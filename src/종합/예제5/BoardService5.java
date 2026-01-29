package 종합.예제5;

import java.util.Scanner;

public class BoardService5 {
    public static void main(String[] args) {

        //1.Controller 객체는 생략

        for (; ; ) {
            System.out.println("========My Community====");
            System.out.println("1.게시물쓰기|2.게시물출력");
            System.out.println("========================");
            Scanner scan = new Scanner(System.in);
            System.out.print("선택>");
            int ch = scan.nextInt();

            if (ch == 1) {
                System.out.print("내용:");
                String content = scan.nextLine();
                System.out.print("작성자:");
                String writer = scan.nextLine();
                boolean result=BoardController.doPost(content,writer);
                if (result) {
                    System.out.println("글쓰기 성공");
                } else {
                    System.out.println("글쓰기 실패");
                }
            }
            else if (ch == 2) {
                Board[] boards = BoardController.doGet();
                for (Board board : boards) {
                    if(board!=null)
                    System.out.printf("작성자:%s ,내용:%s\n",board.getWriter(),board.getContent());
                }
            }
        }
    }
}
