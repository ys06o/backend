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

    }
}

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