
// 한줄 주석
/* 여러줄 주석*/

package DAY01;   //패키지:폴더이면서 클래스의 위치 식별 중요!

public class Exam01 {
    //public:공개용
    //class:자바는 코드의 최소 실행단위,즉 자바는 클래스가 필수이다.
    //Exam1:클래스명은 무조건 첫글자를 대문자
    //{:클래스 내부 시작
    //}:클래스 내부 종료, 즉 클래스{} 밖에서 작성한 코드는 실행이 안된다.

   static int a=10;
    //
//    System.out.println("출력")  //출력함수 안됨.
    public static void main(String[] args) {
        System.out.println("자바안녕");
        System.out.println(a);
    }  //main end
} //class end

//// 클래스 밖 에서는 코드 작성이 안됨.
//int b=10;
