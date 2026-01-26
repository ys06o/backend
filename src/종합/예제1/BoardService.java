package 종합.예제1;

import java.util.Scanner;

public class BoardService {  //class start
    //자바는 무조건 클래스 기반으로 실행한다.
    public static void main(String[] args) { //main start
        //자바는 무조건 main함수 부터 코드 실행흐름이 시작된다.

        //[1] 메모리 설계:데이터6개 저장-> 변수 6개 <배열 객체 사용 전>
        String content1=null;  //초기값을 null 로 지정 (자료가 비어있음 뜻함)
        String content2=null;
        String content3=null;
        String writer1=null;
        String writer2=null;
        String writer3=null;

        //[2] 반복문 , 무한루프
        for (; ; ) {
            //[3]출력문:print, 출력문+줄바꿈:println
            System.out.println("=============My Communtity==========");
            System.out.println("1.게시물쓰기 2.게시물 출력");
            System.out.println("====================================");
            System.out.print("선택>");
            //[4]입력객체 Scanner 변수명=new Scanner(System.in)
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();  //int 정수형 타입, .nextInt()는 키보드로부터 입력받은 값 정수로 가져오기
            //[5] 제어문, 코드 흐름을 제어(논리적인 사고,경우의 수 등)
            if (ch == 1) { //입력받은 값이 1이면
                scan.nextLine();
                System.out.print("내용:");
                String 내용 = scan.nextLine();  //입력받기
                System.out.print("작성자:");
                String 작성자 = scan.nextLine();  // .nextLine()앞에 다른 next가 존재하면 하나로 인식

                if (content1 == null && writer1 == null) { //첫번째 게시물이 비어있으면
                    content1=내용;
                    writer1=작성자;
                    System.out.println("[안내] 글쓰기 성공");
                }
                else if (content2 == null && writer2 == null) { //두번째 게시물이 비어있으면
                    content2=내용;
                    writer2=작성자;
                    System.out.println("[안내] 글쓰기 성공");
                }

                else if (content3 == null && writer3 == null) { //세번째 게시물이 비어있으면
                    content3=내용;
                    writer3=작성자;
                    System.out.println("[안내] 글쓰기 성공");
                }
                else{
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");
                }



            } else if (ch == 2) { //입력받은 값이 2이면
                if (content1 != null && writer1 != null) {
                    System.out.printf("작성자: %s 내용: %s \n",content1,writer1);
                }
                if (content2 != null && writer2 != null) {
                    System.out.printf("작성자: %s 내용: %s \n",content2,writer2);
                }
                if (content3 != null && writer3 != null) {
                    System.out.printf("작성자: %s 내용: %s \n",content3,writer3);
                }
            }
        } //for end
    } //main end
} //class end
