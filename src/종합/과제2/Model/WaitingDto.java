package 종합.과제2.Model;

public class WaitingDto {

    //1.멤버변수
    private int no;
    private String phoneNumber;
    private int people;

    //2.생성자

    //기본생성자
    public WaitingDto() {
    }

    //2.모든 매개변수를 가진 생성자
    public WaitingDto(int no, String phoneNumber, int people) {
        this.no = no;
        this.phoneNumber = phoneNumber;
        this.people = people;
    }

    //3.메소드 getter/setter/toString
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "WaitingDto{" +
                "no=" + no +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", people=" + people +
                '}';
    }
}
