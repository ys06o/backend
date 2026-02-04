package DAY09;

public class Exam04 {
    public static void main(String[] args) {
        //1.Car 객체 생성
        Car myCar = new Car();  //object->Car
//        MyCar.run(); //오류 멤버변수 tire 가 null
        myCar.tire = new Tire(); //
        myCar.run();

        //[2] 타이어 교체
        myCar.tire = new HanKookTire();
        myCar.run();

        //[2]타이어 교체
        myCar.tire = new KumhoTire();
        myCar.run();

        //Tire 타입의 멤버변수는 Tire객체,Htire객체,Ktire객체 모두 대입 받을 수있다.
        //이유:상속관계라서,(자동타입변환)자식타입은 부모타입으로 자동
        System.out.println(myCar.tire instanceof Tire);
        System.out.println(myCar.tire instanceof KumhoTire);
        System.out.println(myCar.tire instanceof HanKookTire);

        //이유:KumhoTire 객체가 생성될때 상위타입의 객체도 같이 생성된다.
        //즉 KumhoTire 객체가 생성될때 HanKookTire 객체는 생성x(형제관계라서)

    }
}


class Car {
    Tire tire;  //타이어를 삽입
    void run() {
        this.tire.roll();
    }
}

class Tire {
    void roll() {
        System.out.println("[일반] 타이어가 회전");
    }
}


class HanKookTire extends Tire {
    void roll() {
        System.out.println("[한국]타이어가 회전(업그레이드)");
    }
}

class KumhoTire extends Tire {
    void roll() {
        System.out.println("[금호]타이어가 회전(업그레이드)");
    }
}
