package DAY06;

public class ParkingLot {
    int calculateFee(int hour) {
        int fee = 1000;
        if (hour > 30) {
            hour -= 30;
            fee = (hour / 10) * 500;
            fee = hour % 10 != 0 ? fee += 500 : fee;
        }
        if (fee > 20000) {
            fee = 20000;
        }
        return fee;
    }
}

