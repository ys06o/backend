package DAY09;

public class Exam02 {
    public static void main(String[] args) {
        System.out.println("=====[1]=====");
        A a = new A(); //총 객체:A+object 그래서 총객체 2개
        //[1]자바의 모든 클래스는object(슈퍼클래스)로 부터 상속을 받는다. 눈에 보이지 않지만

        //[2] 자바의 모든 상속관계에서는 부모객체 먼저 생성한다.!!
        System.out.println("=====[2]=====");
        B b = new B(); ///총객체 :총3개 ,object->A->B 순서로 만든다.

        //[3]타입변환시 업/다운 캐스팅만 가능하다.
        System.out.println("=====[3]=====");
        C c = new C(); //총객체: 총 3개 object->A->C
        //[4] 자식 객체가 생성되면 부모 객체도 생성된다.
        System.out.println("=====[4]=====");
        D d = new D(); //총 객체 :4개 object->A->B->D

        System.out.println("=====[5]=====");
        E e = new E(); //총 객체:4개 object->A->C->E

        //즉 자바는 상속관계를 메모리(저장소)로 표현을한다.
        // 다형성 중요!
        //[5]자동 타입변환
        A a2=b; //업캐스팅
        Object o2=a2;  //b->a->Object
//        B b2=c; //c객체가 생성될때 b는 생성되지 않는다.

        //[6] 강제타입변환
        B b2 = (B) a2;   //a2의 태생은 b객체이므로 가능하다.
//        C c2 = (C) a2; //오류발생 a2의태생은 b객체 이므로 b가 태어날때 c는 생성되지 않았다.

        //[7] 타입확인, 객체 instanceof클래스명/타입명
        System.out.println(a instanceof Object); //결과 true
        // a객체가 생성될떄 Object가 생성되었는지 확인
//        System.out.println(b instanceof C);
        //b객체가 생성될떄 C가 생성되었는지 확인
        System.out.println(e instanceof A); //true
        System.out.println(b instanceof D); //false
         //b객체가 생성될때 D가 생성되었는지 확인

        //즉 해당 객체가 생성될때 부모객체는 생성되지만, 자식 객체는 생성이 안된다. //why? 부모는 자식의 존재를 모름
        // **다운캐스팅이 안되는 전제조건***
    } //main end
} //class end

class A extends Object{
    A() {System.out.println("A 객체 생성");}
}

class B extends A {
    B() {System.out.println("B 객체 생성");}
}

class C extends A{
    C() {System.out.println("C 객체 생성");}
}

class D extends B {
    D() {System.out.println("D 객체 생성");}
}

class E extends C {
    E() {System.out.println("E 객체 생성");}
}


