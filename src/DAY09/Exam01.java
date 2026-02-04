package DAY09;

import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Exam01 {
    public static void main(String[] args) {
        // [1] 상속:A클래스로 부터 B클래스(멤버변수/메소드)에게 물려주는 행위
        // [2] 목적:빠른 클래스 설계 ,한번 만들어둔 클래스를 재사용/활용 한다.
        // [3] 키워드:extends(확장하다,넓히다 등등 이라는 뜻),
        // [4] 장점: 유지보수,계층표현, 재사용 ,**다형성**


        동물 animal1 = new 동물(); //동물 객체 생성
        animal1.name = "강아지";
        animal1.show();

        조류 bird1 = new 조류();
        bird1.name = "비둘기";
        bird1.show();
        참새 sparrow1 = new 참새();
        sparrow1.name = "참새1";
        sparrow1.show();  // 동물->조류->참새 물려받은 메소드

        닭 chicken1 = new 닭();
        chicken1.name = "닭1";
        chicken1.show(); //동물->조류->닭 물려받은 메소드

        // [5] 주의할점:
        // 1.상속은 무조건 하나의 클래스로부터 상속받는다. 부모가 2개xx
        // 2.하위 클래스가 상위클래스를 선택하는 구조(부모는 자식을 모른다.)


        //[6] 다형성: 다양한 형태(다양한 모양) 을 가진 성질
        // ***본질/데이터는 그대로다***
        // (1)참새가 조류로 타입 변환
        조류 bird2=sparrow1; //자동타입변환, 업캐스팅, 묵시적타입변환


        // (2)조류(참새)가 동물로 타입변환
        동물 animal2=bird2; //업캐스팅
        animal2.show(); //참새 1이 출력댐: 즉 객체 ***본질**은 그대로 유지

        // (3) 동물(참새)가 참새로 타입변환,
        참새 sparrow3=(참새)animal2; //강제타입변환, 다운캐스팅, 명시적 타입변환
        sparrow3.show(); //참새1 출력
        System.out.println(sparrow1); //DAY09.참새@3b07d329
        System.out.println(sparrow3); //DAY09.참새@3b07d329

        //(4) 동물이 닭으로 타입변환
        닭 chicken2=(닭)animal1; //태생이 동물이므로 조류또는 닭/참새 타입 변환 불가능
        chicken2.show(); //오류발생 ClassCastException
        //참새로 생선한 객체:참새->조류->동물, 동물->조류->참새
        //조류로 생성한 객체:조류->동물, 동물->조류
//        닭 chicken3=sparrow1; //업/다운 캐스팅만 가능!!,형제관계도 타입변환 불가능!!


        //[7] 상속 활용처: 1.웹/앱 라이브러리  2.클래스 설계(개발 경험 필요)
    } //main end
} // class end

class 동물{
    String name;
    void show() {
        System.out.println("동물.show"); //soutm
        System.out.println(name);
    }
} //class end

class 조류 extends 동물 {
    // 조류클래스는 동물 클래스로부터 상속을받는다.
} //class end

class 참새 extends 조류 {
    //참새 클래스는 조류클래스로 부터 상속을 받는다.
}

class 닭 extends 조류 {
    //닭 클래스는 조류 클래스로부터 상속을 받는다.
}

/* 상속 구조
        동물
        조류
    참새     닭
 */