package 종합.예제4;

import java.util.Scanner;

public class BoardService4 {
    public static void main(String[] args) {
        BoardController bc = new BoardController();

        for (; ; ) {
            System.out.println("========My Community====");
            System.out.println("1.게시물쓰기|2.게시물출력");
            System.out.println("========================");
            Scanner scan = new Scanner(System.in);
            System.out.print("선택>");
            int ch = scan.nextInt();
            if (ch == 1) {

                scan.nextLine();
                System.out.print("내용:");
                String content = scan.nextLine();
                System.out.print("작성자:");
                String writer = scan.nextLine();
                boolean Write = bc.doPost(content, writer);
                if (Write == true) {
                    System.out.println("[안내]등록성공");
                } else {
                    System.out.println("[안내]등록실패");
                }
            }
            else if (ch == 2) {
                Board[] result = bc.doGet();
                System.out.println("====게시물 목록=====");
                for (int index = 0; index <= result.length - 1; index++) {
                    if (result[index] != null) {
                        System.out.println("작성자:" + result[index].writer);
                        System.out.println("내용:" + result[index].content);
                        System.out.println("---------------------------");
                    }
                }
            }
        }
    }
}
