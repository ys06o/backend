package DAY04;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        //문제 1번:
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println("");
        System.out.println("");
        //문제 2번:
        for(int i=10; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("");


        //문제3번
        int sum=0;
        for(int i=1; i<=50; i++){
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("");
        System.out.println("");
        System.out.println("");


        //문제 4번
        for(int i=1; i<=20; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("");
        System.out.println("");


        //문제 5번
        for(int i=1; i<=30; i++){
            if(i%3==0){continue;}
            System.out.println(i);
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");



        //문제6번
        int total=0;
        int e=0;
        while(true){
            e++;
            total+=e;
            if(total>100){
                break;
            }
        }
        System.out.printf("%d까지 더했을때 합계가 %d로 100이 넘습니다.",e,total);

        System.out.println("");
        System.out.println("");
        System.out.println("");


        //문제 7번
        for(int i=1; i<=5; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


        //문제 8번
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");


        //문제 9번

        Scanner scan = new Scanner(System.in);
        int i=1;
        while (true){
            System.out.printf("%d회 입력:",i);
            String count=scan.next();
            if(count.equals("end")){break;}
            i++;
        }
        i--;
        System.out.println("프로그램을 종료합니다."+i);

        System.out.println("");
        System.out.println("");
        System.out.println("");

            /*[문제 10] 아래 선언된 4개의 변수는 7월 각 주차별 매출액입니다. 각 매출액을 '만원' 단위로 변환하고, 백만원 단위마다 '■' 문자로 시각화하여 아래 출력 예시와 같이 보고서를 출력하시오.
    선언 코드:
    int july1 = 3532100;
    int july2 = 9123700;
    int july3 = 5183400;
    int july4 = 11738700;
    요구 조건:
    매출액을 10000으로 나눈 몫을 사용하여 '만원' 단위를 계산합니다.
    '만원' 단위 값을 다시 100으로 나눈 몫만큼 for문을 사용하여 '■' 문자를 반복 출력합니다.
    출력 예시:
    ------- 7월 매출액 -------
    1주차 : ■■■353만원
    2주차 : ■■■■■■■■■912만원
    3주차 : ■■■■■518만원
    4주차 : ■■■■■■■■■■■1173만원 */

            int july1 = 3532100;
            int july2 = 9123700;
            int july3 = 5183400;
            int july4 = 11738700;
            //(1) 만원 단위로 변경
            int 만원1=july1/10000;
            int 만원2=july2/10000;
            int 만원3=july3/10000;
            int 만원4=july4/10000;

        int 문자1=만원1/100;
        int 문자2=만원2/100;
        int 문자3=만원3/100;
        int 문자4=만원4/100;
            //(2) 백만원당 ■ 1개 출력하는 반복문
        for(int a=1; a<=문자1; a++){
            System.out.print("■");
        }
        System.out.println(만원1+"만원");
        for(int a=1; a<=문자2; a++){
            System.out.print("■");
        }
        System.out.println(만원2+"만원");
        for(int a=1; a<=문자3; a++){
            System.out.print("■");
        }
        System.out.println(만원3+"만원");
        for(int a=1; a<=문자4; a++){
            System.out.print("■");
        }
        System.out.println(만원4+"만원");




            int 잔고=0;
            for(;;) {
                System.out.print("1:입금|2:출금|3:잔고|4:종료");
                int 메뉴 = scan.nextInt();
                if (메뉴 == 1) {
                    System.out.print("입금액:");
                    int 입금액 = scan.nextInt();
                    System.out.println("입금액:" + 입금액);
                    잔고 += 입금액;
                } else if (메뉴 == 2) {
                    System.out.print("출금액:");
                    int 출금액 = scan.nextInt();
                    if (출금액 > 잔고) {
                        System.out.println("잔고보다 큰 금액은 출금할 수 없습니다.");
                    } else {
                        System.out.println("출금액:" + 출금액);
                        잔고 -= 출금액;
                    }
                } else if (메뉴 == 3) {
                    System.out.println("잔고 = " + 잔고);
                } else {
                    System.out.println("프로그램 종료");
                    break;
                }
            }
    } //main end
} //class end
