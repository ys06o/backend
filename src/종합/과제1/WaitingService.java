package 종합.과제1;

import java.util.Scanner;

public class WaitingService {
    public static void main(String[] args) {
        WalkingController controller = new WalkingController();
        for (; ; ) {
            System.out.println("=========맛집 대기 시스템======");
            System.out.println("1.대기 등록|2.대기 현황");
            System.out.println("=============================");
            Scanner scan = new Scanner(System.in);
            System.out.print("선택>");
            int ch = scan.nextInt();
            if (ch == 1) {
                scan.nextLine();
                System.out.print("전화번호:");
                String phone = scan.nextLine();
                System.out.print("인원수:");
                int count = scan.nextInt();
                boolean registration = controller.addWaiting(phone, count);
                if (registration == true) {
                    System.out.println("[안내]대기 등록이 완료되었습니다.");
                } else {
                    System.out.println("[안내]더 이상 대기 등록을 할 수 없습니다.");
                }
            } else if (ch == 2) {
                Waiting[] result = controller.getWaitingList();
                for (int index = 0; index <= result.length - 1; index++) {
                    if (result[index] != null) {
                        System.out.println((index + 1) + "." + "연락처:" + result[index].phone + "--" + "인원:" + result[index].count + "명");
                        System.out.println("----------------------------------------------");
                    }
                }
            }

        }
    }
}
