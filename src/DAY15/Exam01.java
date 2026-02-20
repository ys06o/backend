package DAY15;

import DAY07.package1.B;

import java.util.ArrayList;

public class Exam01 {
    public static void main(String[] args) {

        //[제네릭 타입]
        //1.정의: 여러 가지 타입(int,String etc)에서 동작할 수 있도록 만든 타입, < >,ArrayList< >
        //2.목적: 클래스를 *정의* 할 때 변수 타입을 정하지 않고 인스턴스(객체)를 생성할 때 타입을 정한다.
        //3 사용법:
        /*
        1.제네릭타입명은 영문 대문자로 한다.
        2.여러개 가능
        3.제네릭 타입에 대입되는 타입은 기본타입 안된다. <rapper클래스 사용>
            //1.int->Integer


        class 클래스명<제네릭타입>{
            제네릭타입1.멤버변수명;
            void 함수명(제네릭타입2 매개변수명){} //함수도 가능

            클래스명<타입1,타입2> 변수명;
        }
         */

        //(1)제네릭 타입이 없는 상황
        Box1 box1 = new Box1();
        box1.content = "안녕하세요";
        String content1 = box1.content;

        Box2 box2 = new Box2();
        box2.content= 100;
        int content2 = box2.content;


        //(2)재네릭 사용되는 상황
        Box3<String> box3 = new Box3<>();
        box3.content = "안녕하세요";
        String content3 = box3.content;
        Box3 <Integer> box33 = new Box3<>();
        box33.content=100;
        int content33=box33.content;


        //ArrayList
        ArrayList<String> list = new ArrayList<>(); //ArrayList안에서 제네릭타입을 String 사용하겠다는 뜻
//        ArrayList<Dto> list2 = new ArrayList<Dto>();  Dto타입으로 사용하겠다는 뜻


        //(3)제네릭타입 여러개
        Box4<String, Integer> box4 = new Box4<>();
        box4.value1 = "안녕";
        box4.value2=100;


        //(4)중첩 가능
        Box4<String, ArrayList<String>> box44 = new Box4<>();
        box44.value1 = "ㅁㄴㅇㄹ;";
        box44.value2 = new ArrayList<>();



    } //main end
} //class end


class Box1 {
    String content;
}

class Box2 {
    int content;
}

class Box3<제네릭타입> {
    제네릭타입 content;
}

class Box4<T, E>{
    T value1;
    E value2;
}