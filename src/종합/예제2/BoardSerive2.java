package 종합.예제2;

import java.util.Scanner;

public class BoardSerive2 {
    public static void main(String[] args) {
        String[] contents = new String[100];
        String[] writers = new String[100];

        for (; ; ) {
            System.out.println("=============My Communtity==========");
            System.out.println("1.게시물쓰기 2.게시물 출력");
            System.out.println("====================================");
            System.out.print("선택>");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            if (ch == 1) {
                scan.nextLine();
                System.out.print("내용:");
                String 내용 = scan.nextLine();  //입력받기
                boolean save = false; //저장했다 true 저장못했다. false;
                System.out.print("작성자:");
                String 작성자 = scan.nextLine();
                for (int i = 0; i <= writers.length - 1; i++) {
                    if (writers[i] == null) {
                        writers[i] = 작성자;
                        contents[i] = 내용;
                        save = true;
                        break;   //저장 성공시 save에 true 대입후 반복문 종료
                    }
                } //for end

                if (save == true) {
                    System.out.println("글쓰기 성공");
                } else {
                    System.out.println("글쓰기 실패");
                }
            } else if (ch == 2) {
                for (int i = 0; i <= writers.length - 1; i++) {
                    if (writers[i] != null) {
                        System.out.printf("작성자: %s, 내용: %s \n", writers[i], contents[i]);
                    }
                }
            }
        } //무한루프문 end
    } //main end
} //class end
