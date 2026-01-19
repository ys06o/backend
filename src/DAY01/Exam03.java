package DAY01; //클래스 파일이 속한 패키지명

public class Exam03 {  //class s
    public static void main(String[] args) { //main s
        //[1]:System.out.println():자료 출력후 줄바꿈 포함 (가장 많이씀)
        //System:클래스 이면서 시스템(현재컴퓨터) 관련 기능/함수 제공
        //out:출력에 관련된 기능/함수 갖는 객체 반환
        //print:출력함수
        System.out.println("자바안녕1");   //console.log()랑 같은 기능
        //[2]System.out.print:자료 출력 줄바꿈x
        System.out.print("자바안녕2");
        //[3]System.out.printf:자료 출력+형식 문자
        System.out.printf("%s","자바안녕3");
        /*
        printf(format 형식)
             %s:문자열,%d:정수,%c:문자,%f:실수
             %자릿수d:자릿수 만큼 자리 차지, 만일 비어있으면 공백 , 오른쪽 정렬
             %-자릿수d:자릿수만큼 자리 차지,만일 비어있으면 공백 ,왼쪽 정렬
             %0자릿수d:자릿수만큼 자리 차지,만일 비어있으면 0으로 채움
             전체자릿수.소수점자릿수f
         */
        String name="유재석";
        int age=10;
        System.out.printf("저는"+name+"이고 나이는"+age+"입니다.\n");
        System.out.printf("저는 %s이고 나이는 %d 입니다.\n",name,age);
        System.out.printf("저는 %s이고 나이는 %6d 입니다.\n",name,age);
        System.out.printf("저는 %s이고 나이는 %-6d 입니다. \n",name,age);
        System.out.printf("저는 %s이고 나이는 %06d 입니다.\n",name,age);
        System.out.printf("저는 %s이고 키는 %3.2f 입니다.\n",name,177.23425);
        /*
        [5]이스케이프/제어 문자
        //\n:줄바꿈,\t":들여쓰기
         */
        System.out.println("안녕1\n안녕2");
        System.out.println("안녕1\t안녕2");
        System.out.println("안녕1\"안녕2");
        System.out.println("안녕1\'안녕2");
        System.out.println("안녕1\\안녕2");
    } // main e
} //class e
