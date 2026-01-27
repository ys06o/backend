package DAY06;

public class Product {
    String name;
    int stock=10;  //멤버변수의 초기화

    boolean sell(int quantity) {
        if (stock >=quantity) {
            stock -= quantity;
            return true;
        } else {
            System.out.println("재고부족");
            return false;
        }

    }

}
