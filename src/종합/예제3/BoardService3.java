package 종합.예제3;

import java.util.Scanner;

public class BoardService3 {
    public static void main(String[] args) {
        //[1]Board 클래스 선언
        //[2]Board 객체 여러개 저장=배열
        Board[] boards = new Board[100];  //총 100개 객체 저장 가능

        for (; ;) {
            System.out.println("=========My community===========");
            System.out.println("1.게시물 쓰기 2.게시물출력");
            System.out.println("================================");
            System.out.print("선택>");
            Scanner scan = new Scanner(System.in); //입력 객체
            int ch = scan.nextInt();  //입력받기
            if (ch == 1) {  //조건문
                System.out.print("내용:");
                scan.nextLine();
                String content= scan.nextLine();
                System.out.print("작성자:");
                String name = scan.nextLine();
                //[6]객체 만들기
                Board board = new Board();
                //[7]생성한 객체에 입력받은 값 대입
                board.내용 = content;
                board.작성자 = name;
                //[8]생성한 객체를 배열에 저장
                boolean check = false; //true:저장성공, false:저장실패
                for (int index = 0; index <= boards.length - 1; index++) {

                    if (boards[index] == null) {
                        boards[index] = board;  //생성한 객체를 빈 index번째 요소에 대입
                        check=true; break;
                    }
                }
                if (check == true) {
                    System.out.println("저장성공");
                } else {
                    System.out.println("저장실패");
                }

            }
            else if (ch==2) {
                for (int index = 0; index <= boards.length - 1; index++) {
                    if(boards[index]!=null){
                        System.out.printf("%d번째 글\n",index+1);
                        System.out.printf("작성자:%s\n",boards[index].작성자);
                        System.out.printf("내용:%s\n",boards[index].내용);
                    }
                }
            }
        }

    }
} //class end
