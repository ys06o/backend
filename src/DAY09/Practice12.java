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

        //문제 7번
        Coke coke = new Coke();
        Coffee coffee = new Coffee();
        Beverage[] array1 = {coke, coffee};
        for (Beverage beverage : array1) {
            beverage.drink();
        }

        //문제 8번
        Character character = new Character();
        Sword sword = new Sword();
        Gun gun = new Gun();
        character.use(sword);
        character.use(gun);


        //문제 9번
        Superclass obj = new Subclass();
        System.out.println(obj.name); //obj의 타입이 SuperClass이기 때문에 즉 멤버변수는 오버라이딩이 안된다.
        obj.method(); ///메소드는 오버라이딩이 된다.

        //문제 10번
        Laptop laptop = new Laptop();
        if (laptop instanceof Electronic) {
            Electronic e1=laptop;
            System.out.println("e1 형변환 가능");
        }

        if (laptop instanceof Device) {
            Device d1=laptop;
            System.out.println("d1출력가능");
        }
    } //main end
} //class end



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
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("고양이가 야옹하고 웁니다.ㅌ");
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


/*[문제 8] 다형성을 활용한 매개변수

1. Weapon 클래스와 이를 상속받는 Sword, Gun 클래스를 만드세요. 각 클래스는 "무기로 공격합니다.", "검으로 공격합니다.", "총으로 공격합니다."를 출력하는 attack() 메소드를 가집니다. (오버라이딩 활용)

2. Weapon 타입의 매개변수를 받아 그 객체의 attack() 메소드를 호출하는 Character 클래스와 use(Weapon weapon) 메소드를 만드세요.

3. main 함수에서 Sword 객체와 Gun 객체를 생성한 뒤, 이 객체들을 Character의 use() 메소드에 인자로 전달하여 각기 다른 결과가 출력되는 것을 확인하세요.*/


class Weapon {
    void attack() {
        System.out.println("무기로 공격합니다.");
    }
}

class Sword extends Weapon {
    @Override
    void attack() {
        System.out.println("검으로 공격합니다.");
    }
}

class Gun extends Weapon {
    @Override
    void attack() {
        System.out.println("총으로 공격합니다.");
    }
}

class Character {
    void use(Weapon weapon) {
        weapon.attack();
    }
}

/*[문제 9] 필드와 메소드의 오버라이딩 차이

1. String name = "상위"; 필드와 method() 메소드("상위 메소드" 출력)를 가진 SuperClass를 만드세요.

        2. SuperClass를 상속받고, String name = "하위"; 필드와 method() 메소드("하위 메소드" 출력)를 가진 SubClass를 만드세요.

        3. SuperClass obj = new SubClass(); 로 객체를 생성한 뒤, obj.name과 obj.method()를 각각 호출했을 때의 결과를 확인하고, 왜 다른 결과가 나오는지 주석으로 설명하세요.*/


class Superclass {
    String name = "상위";

    void method() {
        System.out.println("상위메소드 출력");
    }
}

class Subclass extends Superclass {
    String name = "하위";

    void method() {
        System.out.println("하위메소드");
    }
}


/*[문제 10] 다중 상속 관계

1. Device 클래스를 만드세요.

2. Device를 상속받는 Electronic 클래스를 만드세요.

3. Electronic을 상속받는 Laptop 클래스를 만드세요.

4. main 함수에서 Laptop 객체를 생성한 뒤, 이 객체가 Electronic 타입과 Device 타입으로도 형 변환이 가능한지 instanceof 연산자로 확인하고 결과를 출력하세요.*/

class Device {

}

class Electronic extends Device {

}

class Laptop extends Electronic {

}