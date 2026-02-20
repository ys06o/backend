package DAY12;

import 종합.예제7.model.dto.BoardDto;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exam01 {
    public static void main(String[] args) {
        /*
          기본타입: byte,short,int,long,float,double,boolean,char,
          8개이면서 literal(키보드로 입력받는 값)
          값들을 분류하는 타입
           -소문자로 시작한다.
          참조타입:String,Scanner,MemberDto,[ ] 등등 기본타입 외 모든것
          -기본타입 외 모두 참조타입 배열,클래스,인터페이스
          -대문자로 시작한다.
          -기본타입 외 개발자가 새로운 타입을 만드는 행위: EX)int+double 2개갖는타입
         */
        //자바회사에서 제공하는 기본클래스 틀
        //1.Object:자바에서 최상위 클래스이면서 조상 모든 클래스는 object로 부터 상속받는다.
        Object o1=3; //가능 왜? 모든값들은 object로 부터 상속 받았기 때문 3이 자식이고 object가 부모라는 개념
        Object o2=3.14;
        Object o3 = "유재석";
        Object o4 = new Object();
        Object o5 = new int[3];
        Object o7 = new BoardDto();
        //즉 모든 자료들은 object로 타입변환(다형성)이 가능하다.
            //1-1 toString():인스턴스/자료 주소값(메모리위치) 반환함수
        System.out.println(o5.toString()); //[I@214c265e ,이와 같이 할당된 주소값(개발자가 제어 불가)
        System.out.println(o7.toString()); ///BoardDto{bno=0, bcontent='null', bwriter='null', bdate='null'} 이와 같이 toString 을 오버라이딩한 객체는 문자열이 출력이됨
            //1-2 .equals():주소가 참조하는 객체 비교 vs  ==변수가 갖는 주소(위치)또는 리터럴 비교
        Object o8 = new BoardDto();
        Object o9 = new BoardDto();
        System.out.println(o8 == o9); //false 객체에 주소가 다름
        System.out.println(o8.equals(o9)); //false
         Object o10=o9;   //객체 참조 복사/복제
        System.out.println(o10==o9); //true
        String str1 = new String("유재석");
        String str2 = new String("유재석");
        System.out.println(str1 == str2); //false:서로다른 객체가 같은 문자열을 갖는다.
        System.out.println(str1.equals(str2)); //true:서로 다른 객체내 문자열 비교하기 때문에 true
        String str3 = "유재석";
        //1-3 .hasCode():객체를 식별하는 값을 정수로 반환
        System.out.println(str1.hashCode()); //50621969
        System.out.println(str2.hashCode());
        System.out.println(o10.hashCode());
        System.out.println(o7.hashCode());

        // [2] Class:클래스 정보(멤버변수/메소드) 담는 클래스
        String obj1 = new String();
        Class c1 = obj1.getClass();
        System.out.println(c1); //class java.lang.String

        Integer obj2=3;
        Class c2 = obj2.getClass();
        System.out.println(c2);  //class java.lang.Integer

        // 2-1 Class.forName("패키지명".클래스명); 일반예외 발생
        // *** 리플렉션 *** 최초실행(컴파일)할때 객체를 생성하지 않고 실행 도중에 객체 생성=동적 처리 가능!
        //사용처:JDBC(DB연동),스프링프레임워크(자바플랫폼)=외부 라이브러리 동적 객체 생성을 할때 사용한다.
        try {
            Class.forName("java.lang.String"); //String 클래스가 존재하면 객체가 동적으로 생성된다.
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        //2-2
        Field[] fields = c1.getFields();  //클래스내 모든 멤버변수명/속성/필드 확인(*private제외)
        for (Field field : fields) {
            System.out.println(field);
        }

        Constructor[] constructors = c1.getConstructors(); //클래스내 모든 생성자 확인(매개변수 확인)
        for (Constructor constructor : constructors) {
            System.out.println(constructor); //15개 출력, 오버로딩한 생성자들 출력
        }

        Method[] methods = c1.getMethods(); //클래스내 모든 메소드 확인
        for (Method method : methods) {
            System.out.println(method);
        }

        // [3]래퍼 클래스:기본타입을 감싸 -->참조타입 표현 , 장점:기본타입은 멤버변수/메소드(기능)가 없다. Integer는 기능이 있음
        int value1=100; //자료는 100 타입은 int
        Integer value2=100; //자료는 200 분류는 Integer
        System.out.println(value2.byteValue()); //Integer는 참조타입이므로 기능이 있다.
        //3-1 언박싱
        int value3=value2; //Integer->int 언박싱 ,참조타입->기본타입
        Integer value4=value1; // int->Integer 오토박싱, 기본타입->참조타입

        //자바에서 외부자료들을 주고받을때 타입변환(엑셀/csv/api/js통신/python통신)
        int val1 = Integer.parseInt("100"); //"100"문자->숫자 100으로 변환
        double val2=Double.parseDouble("3.14"); //"3.14->3.14
        float val3 = Float.parseFloat("3.14");
        boolean val4 = Boolean.parseBoolean("true");
        //기본타입->문자열 변환
        String s1=100+""; //기본타입자료+"";
        String s2 = String.valueOf(100);
        System.out.println(String.class.isInstance(s2));
    } //main end
} //class end
