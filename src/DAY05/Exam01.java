package DAY05;


import java.util.Arrays;

public class Exam01 { //class start
    public static void main(String[] args) { //main start

        //[1] 배열이란? *동일한 타입의 여러 자료들을 순서대로 저장하는 자료타입*
        //[2]선언 : 타입[] 변수명=new 타입[총개수];
        //[3]특징 :(1)동일한타입끼리만 가능 (2)고정길이 (3) 요소의 초기값 존재
        //[4]인덱스란? 배열내 요소들이 저장된 순서 번호, 0번부터 시작
        int[] array1 = new int[3]; //{0,0,0}
        String[] array2 = {"봄","여름","가을","겨울"};   //초기값 가능
        //[5] 배열변수의 출력
        System.out.println(array1);  //[I@4c873330:배열의 주소(메모리위치) 참조값
        System.out.println(array2);  //[Ljava.lang.String;@119d7047
        //[6] 배열변수의 요소/값 전체 출력   ,Arrays.toString(배열변수명);
        System.out.println(Arrays.toString(array1));  //[0, 0, 0]
        System.out.println(Arrays.toString(array2)); //[봄, 여름, 가을, 겨울]
        //[*] 배열의 메모리 주소 상태 간단 구조
        /*
           new int[3]선언하면 int[4byte],int[4byte],int[4byte]
           총 12byte 생성
           컴퓨터는 최소의 저장단위를 바이트(위치/주소값)
           ->12개의 주소값을 생성,101번지,102번지 등등
           배열의 변수는 총 12개의 주소값을 가진게 아니다. 가장 첫번째의 주소값을 가진다.
           int arr1=new int[3];
           **arr1=101번지 주소값 즉 첫번째 주소값이 들어있다.
           **실행중에 개발자가 배열내 주소값/메모리 값을 삭제 불가능 VS JS는 delete 대신 splice
           **주소값의 초기값이 생략되면 임의의 초기값을 자동으로 들어간다. <가비지 컬렉터:비어있는 메모리를 삭제>
           그래서 가비지 컬렉터가 비어있는 메모리를 삭제하기 때문에 초기값을 생성한다.
           정수:0, 실수:0.0, 문자열/객체:NULL  ,논리:false
         */

        //[7]배열의 사용과 활용
        System.out.println(array1.length); //배열변수명.length: 배열의 총길이=3
        //[8]배열의 요소 값 수정
        array1[0]=10;
        System.out.println(array1[0]);  //주소값은 그대로이다.
        array2[1] = "spring";
        System.out.println(array2[1]);
        //[9]배열의 요소 추가/삭제 x
        //array1[4] = 40; //ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3

        //[10]반복문 활용
        for (int index = 0; index <= array1.length - 1; index++) {
            System.out.println(array1[index]);  //[index]번째 요소값 가져오기/출력
        }
        //향상된 for문:위와같이 많이 사용되므로 추가된 반복문
        //for (타입 반복변수 : 배열변수명) { //iterator가 가능한 배열/객체만 가능
        for (int value : array1) {
            System.out.println(value);
        }

        for (String value2 : array2) {
            System.out.println(value2);
        }
    } //main end
} //class end
