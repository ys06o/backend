package DAY09;

import java.sql.Array;

public class Practice12 {
    public static void main(String[] args) {
        //문제1
        Student student1 = new Student();
        student1.name = "김용성";
        student1.StudentId=123;
        System.out.println(student1.name);
        System.out.println(student1.StudentId);

        //문제 2번
        Cat cat = new Cat();
        cat.makeSound();

        //문제 3번
        Computer computer = new Computer();


        //문제 4번
        Triangle t1 = new Triangle();
        Figure f1=t1;
        //가능한 이유:Triangle 클래스는 Figure라는 클래스를 상속받기때문에
        //즉 t1은 f1으로 업캐스팅이 가능

        //문제 5번
        Shape shape = new Circle();
        shape.draw();
        // 결과:원을 그립니다.
        //이유:오버라이딩 하면 최우선으로 메소드가 실행되기 때문에
        // Circle 클래스에 있는 draw()메소드가 먼저 실행된다.


        //문제 6번
        Vehicle vehicle = new Bus();

        if (vehicle instanceof Bus) {
            Bus bus=(Bus)vehicle;
            bus.CheckFace();
        }
    }

    //문제 7번
    Coke coke = new Coke();
    Coffee coffee = new Coffee();
    Beverage[] array1 = {coke, coffee};

    for(Beverage[] ar1:array1)


}



//문제 1번
class Person{
    String name;
}

class Student extends Person {
    int StudentId;
}
//////////////////////////////////////

//문제 2번
class Animal {
    void makeSound() {

    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("고양이가 야옹하고 웁니다.");
    }
}
///////////////////////////////

//문제 3번
class Machine {
    Machine() {
        System.out.println("부모 클래스 생성자 실행");
    }
}

class Computer extends Machine {
    Computer() {
        System.out.println("자식클래스 생성자 실행");
    }
}
///////////////////////////


//문제 4번
class Figure {

}

class Triangle extends Figure {

}


//문제 5번
class Shape {
    void draw() {
        System.out.println("도형을 그립니다.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("원을 그립니다.");
    }
}


//문제 6번
class Vehicle {

}

class Bus extends Vehicle {
    void CheckFace() {
        System.out.println("요금을 확인합니다.");
    }
}


//문제 7번

class Beverage {
    void drink() {
        System.out.println("음료를 마십니다.");
    }
}

class Coke extends Beverage {
    void drink() {
        System.out.println("콜라를 마십니다.");
    }
}

class Coffee extends Beverage {
    void drink() {
        System.out.println("커피를 마십니다.");
    }
}