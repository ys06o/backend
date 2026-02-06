package 종합.예제7.view;

import 종합.예제7.controller.BoardController;
import 종합.예제7.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    //싱글톤 생성
    private BoardView() {
    }

    private static final BoardView instance = new BoardView();

    public static BoardView getInstance() {
        return instance;
    }


    //BoardController 호출
    private BoardController bc = BoardController.getInstance();

    private Scanner scan = new Scanner(System.in);

    public void index() {
        for (; ; ) {
            try { // 1. 예외 감시 시작
                System.out.println("========My Community====");
                System.out.println("1.게시물쓰기|2.게시물출력|3.게시물 수정|4.게시물 삭제");
                System.out.println("========================");
                System.out.print("선택> ");

                int ch = scan.nextInt(); // 여기서 숫자가 아니면 에러 발생!

                if (ch == 1) {
                    write();
                } else if (ch == 2) {
                   findAll();
                } else if (ch == 3) {
                    update();
                } else if (ch == 4) {
                    delete();
                } else {
                    System.out.println("없는 번호입니다.");
                }

            } catch (java.util.InputMismatchException e) {
                // 2. 숫자가 아닌 값을 입력했을 때 처리
                System.out.println("[경고] 숫자만 입력 가능합니다.");
                scan = new Scanner(System.in);
            } catch (Exception e) {
                // 3. 그 외 예상치 못한 모든 오류 처리
                System.out.println("[시스템오류] 관리자에게 문의: " + e.getMessage());
                break; // 시스템 오류 시 루프 종료
            }
        } //for end
    } //index end

    //[1] 게시물 등록 view
    public void write() {
        scan.nextLine();
        System.out.print("내용:");
        String bcontent = scan.nextLine();
        System.out.print("작성자:");
        String bwriter = scan.nextLine();
        boolean result = bc.write(bcontent, bwriter);
        if (result == true) {
            System.out.println("게시물 등록 성공");
        } else {
            System.out.println("게시물 등록 실패");
        }
    }

    //[4]게시물 삭제 view
    public void delete() {
        System.out.print("삭제할 게시물번호:");
        int bno = scan.nextInt();
        boolean result = bc.delete(bno);
        if (result) {
            System.out.println("삭제성공");
        } else {
            System.out.println("게시물 삭제 실패 또는 없는 게시물 번호입니다.");
        }
    }

    //[5]게시물 수정 view
    public void update() {
        System.out.print("수정할 게시물 번호:");
        int bno = scan.nextInt();
        System.out.print("수정할 내용:");
        scan.nextLine();
        String bcontent = scan.nextLine();
        boolean result = bc.update(bno, bcontent);
        if (result) {
            System.out.println("게시물 수정완료");
        } else {
            System.out.println("게시물 수정 실패");
        }
    } //update end

    //[2]게시물 전체 조회
    public void findAll() {
        ArrayList<BoardDto> boards = bc.findAll();
        for (BoardDto board : boards) {
            System.out.printf("번호:%d,작성일:%s,작성자:%s,내용:%s\n",
                    board.getBno(), board.getBdate(), board.getBwriter(), board.getBcontent());

        }
    }
} //class end

