package DAY07;

public class Practice10 {
    public static void main(String[] args) {
        //문제 1번
        Members members = new Members();
        members.setId("admin");
        System.out.println(members.getId());

        //문제 2번
        Score score = new Score();
        score.setScore(85);
        Score score1 = new Score();
        score1.setScore(120);

        //문제 3번
        BankAccounts number1 = new BankAccounts("123-456");
        System.out.println(number1.getAccountNumber());

        //문제 4번
        CircleCalculator circleCalculator = new CircleCalculator(5);
        System.out.println(circleCalculator.printCircleArea());

        //문제5번
        TicketMachine machine1 = new TicketMachine();
        TicketMachine machine2 = new TicketMachine();
        TicketMachine machine3 = new TicketMachine();
        machine1.issueTicket();
        machine1.issueTicket();
        machine2.issueTicket();
        TicketMachine.printTotalTicket();

        //문제6번

        System.out.println(Gameconfig.GAME_TITLE);
        System.out.println(Gameconfig.MAX_LEVEL);
        System.out.println(Gameconfig.MAX_HP);
    }
}


//문제1번 클래스
class Members {
 private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//문제 2번
class Score {
    private int score;
    private boolean isValid = true; // 점수가 유효한지 체크하는 변수

    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
            this.isValid = true; // 정상 점수일 때
        } else {
            this.isValid = false; // 범위를 벗어났을 때 ❌
        }
    }

    // 출력을 담당하는 새로운 메소드!
    public void printResult() {
        if (isValid) {
            System.out.println(this.score + "점");
        } else {
            System.out.println("유효하지 않은 점수입니다.");
        }
    }
}

class BankAccounts {
    private String accountNumber;

    public BankAccounts(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class CircleCalculator {
    final double PI = 3.1459;
    private int r;

    public CircleCalculator(int r) {
        this.r = r;
    }

    double printCircleArea() {
        double area = r * r * PI;
        return area;
    }

}

class TicketMachine {
    static int totalTickets=0;

    void issueTicket() {
        totalTickets++;
        System.out.println("티켓1장을  발권했습니다.");
    }

   static void printTotalTicket() {
       System.out.println(totalTickets);
    }
}

class Gameconfig {
    public static final int MAX_LEVEL=99;
    public static final int MAX_HP=10000;
    public static final String GAME_TITLE = "MY RPG";
}