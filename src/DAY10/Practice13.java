package DAY10;

public class Practice13 {
    public static void main(String[] args) {
        // [문제 1] 다형성 특징: 상속 (객체) vs 인터페이스 (객체 x)
        Cat cat = new Cat();
        Dog dog = new Dog();
        Soundable soundable=cat;
        soundable.makeSound(); //야옹
        soundable=dog;
        soundable.makeSound(); //멍멍
        ////////////////////////////////////////////////////


        //문제 5번
        Flyable flyable = new Duck(); //Duck클래스가 flyable 구현을 했기 때문에 가능(다형성:타입 변환)
        Swimmable swimmable = new Duck(); //Duck클래스가 swimmable 구현을 했기 때문에 가능(다형성:타입 변환)
        flyable.fly();
        swimmable.swimmable();

    } //main end
} //class end

//문제 1번
interface Soundable {
    public abstract void makeSound();  //추상메소드는 {}가 즉 구현부가 없다.

}
class Cat implements Soundable{ //해당 추상메소드를 가진 인터페이스를 구현하면 구현(체)라고 한다.
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}
class Dog implements Soundable{ //상속과 다르게 무조건 오버라이딩 필수!!
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}


//문제 5번
interface Flyable {
    void fly();
}

interface Swimmable {
    void swimmable();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("하늘을 납니다");
    }

    @Override
    public void swimmable() {
        System.out.println("물에서 헤엄칩니다.");
    }
}
