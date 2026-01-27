package 종합.과제1;

//로직담당
public class WalkingController {
    Waiting[] waitings = new Waiting[100];

    boolean addWaiting(String phone, int count) {
        Waiting person = new Waiting(); //객체 생성
        person.phone = phone; //매개변수로 받은 값을 멤버변수의 저장
        person.count = count;
        for (int index = 0; index <= waitings.length - 1; index++) {
            if (waitings[index] == null) {
                waitings[index] = person;
                return true;
            }

        }
        return false;
    }

    Waiting[] getWaitingList() {
        return waitings;
    }
}
