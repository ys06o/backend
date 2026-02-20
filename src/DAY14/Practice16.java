package DAY14;

public class Practice16 {
    public static void main(String[] args) {
        //문제 1번
        DeliveryTask deliveryTask = new DeliveryTask();
        Thread thread = new Thread(deliveryTask);
        thread.start();

        try {
            Thread.sleep(1000);
            for (int i = 1; i <= 3; i++) {
                System.out.println("[메인] 주문 화면 갱신" + i);
            }
        } catch (Exception e) {}

        try {
            thread.join();
            System.out.println("배달 처리 종료");
        } catch (Exception e) {}
        }



} //main end

class DeliveryTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i=1; i<=3; i++) {
            System.out.println("[배달기사] 이동중"+i);
        }
    }
}


class Cart {
    int total;

    public synchronized void  addPrice(int price) {
        total += price;
        try {
            Thread.sleep(5000);
            System.out.printf("[장바구니] 추가금액=%d,현재총액=%d", price, total);
        } catch (Exception e) {

        }
    }
}


class UserAThread extends Thread {

    Cart cart = new Cart();
    public void run() {
        for (int i = 0; i <= 5; i++) {
            cart.addPrice(500);
        }
    }
}

class UserBThread extends Thread {
    Cart cart1 = new Cart();
    public void run() {
        for (int i = 0; i <= 5; i++) {
            cart1.addPrice(500);
        }
    }
}