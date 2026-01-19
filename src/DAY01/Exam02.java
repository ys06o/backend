package DAY01; //패키지(폴더) 로써 클래스 위치한 폴더명

public class Exam02 {  //class s
    //public class:공개용 클래스 선언 뜻 갖는 키워드
    //Exam2:임의의 클래스명 정의한다. 첫글자 대문자!
    //[1]m+엔터:메인함수
    //자바에서 최초로 실행 흐름(스레드)를 갖는 (미리만들어진)함수
    public static void main(String[] args) { // main s
//        [2]리터럴:상수 이면서 키보드로 입력가능한 자료들
        System.out.println(3);  //js의 console.log랑 동일한기능의 함수
        System.out.println(3.14);
        System.out.println("유");   //선언 또는 함수실행 뒤에 ; 세미콜론 작성한다.
        System.out.println("유재석");  //문자열 처리할때는 "큰따옴표 사용
//        [3]자료형/타입/(분류):자료들을 효율적으로 사용하기 위한 분류 방법
          //정수:byte(1),short(2),int(4),long(8)
          //바이트란?bit(0또는1)-->01010101(8bit)1byte-->1024byte--->1kb-->1024kb--->1mb
          //실수:float,double(8,소수점17자리 표현,*실수기본*)
          //문자:char(2,''작은따옴표 감싼),문자열 :String(문자열클래스,""큰따옴표로 감싼)
          //논리:boolean(1,ture/false)
        //1.boolean:ture또는 false를 저장하는 타입
        boolean bool1=true;  //java:자료형 변수명=값;      //[동적타입] js let bool1=true;
        boolean bool2=false;  //변수명은 카멜표기법 권장, 숫자/특수/띄어쓰기 x
//        boolean bool3=3;    오류 발생
        System.out.println(bool1);
        System.out.println(bool2);

        //2.char:''작은따옴표로 감싼 문자 1개 저장하는 타입
        char ch1='A';
//        char ch2='ABC'; 오류발생 문자여러개 불가능
//        char ch3="ABc"; 오류발생 큰따옴표 불가능
        System.out.println(ch1);
        //3.String:" " 큰따옴표로 감싼문자 여러개 저장하는 (클래스)타입
        String str1="ABC";
        System.out.println(str1);

        //4. byte:-128~+127
        byte b1=100;
//        byte b2=300;  오류
        System.out.println(b1);

        //5. short:+-3만 정도
        short s1=32000;
//        short s2=40000;   오류
        System.out.println(s1);

        //6. int:+-21억정도 ,정수의 리터럴 기본타입,즉]
        // 키보드로부터
        // 입력받은 값들을 모두 int 타입이다.
        int i1=2100000000;
        System.out.println(i1);
//        int i2=3000000000; 30억 오류

        //7.long:+-21억 이상, 리터럴 뒤에 L/l을 붙인다.
        long l1=3000000000L;  //3000000000(INT)이다. 그러므로 L을 붙여 리터럴을 LONG 으로 바꿔야한다.
        System.out.println(l1);

        //8. double: 소수점을 포함한17자리 표현,오차 발생할수 있다., 실수의 리터럴 기본타입
        double d1=0.23235235235235;
        System.out.println(d1);
        //9. float:소수점을 포함한 8자리까지 표현,리터럴 뒤에 F/f 붙인다.
        float f1=0.123134355112412441215515151515f;
        System.out.println(f1);


    } //main e

}  //class end
/*
    ------코드작성--------                  ---------코드 실행----------
    JS:console.log("자바");                브라우저
    JAVA:print("자바");                    main/C언어
 */