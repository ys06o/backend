package DAY02;
//같은 패키지 에서는 동일한 명에 클래스가 존재할수없다.
public class Exam01 { //class s
    public static void main(String[] args) {  //main s
        //[1] 타입=자료형=분류=자료들을 분류/나누는 방법
        //*****자바는 다형성이라는 특징을 가짐 다형성:다양한/형 모양을 갖는다.*****
        //(1) 자동 타입 변환/캐스팅(묵시적:개발자가 따로 할게 없다.)
        //byte->short->int->long->float->double(작은상자->큰상자로 갈수가있음)
        byte byteValue=10; //10인 자료를 byte타입으로 분류하였다.
        short shortValue=byteValue; //byte타입을 short타입으로 변환
        int intValue = shortValue; //short타입을 int 타입으로 변환
        long longValue = intValue; //int타입을 long 타입으로 변환
        float floatValue = longValue; //long타입을 float타입으로 변환
        double doubleValue = floatValue; //float타입을 double타입으로 변환

        //(2) 연산중(자동) 타입변환
        //byte+byte=int, byte+short=int ,int+int=int, //**int 이하 피연산자들은 연산을 하면 int로 나온다.
        //long / float /double 들은 피연산자 중에 더 큰 타입으로 결과가 나온다.
        byte b1 = 10; byte b2=20; short s1=30; int i1=40; long l1=50; float f1=3.14f; double d1=41.25;
        int result1=b1+b2; //result1:int
        int result2=b1+s1; //result2:int
        int result3=i1+i1; //result3:int
        long result4=i1+l1; //int+long=long
        float result5=i1+f1;  //int+float=float
        double result6=i1+d1; //int+double=double;

        //(3)강제 타입 변환(명시적:개발자가 변환할 타입 작성)
        //double->float->long->int->short->byte, 큰상자에서 작은상자로 가기때문에 손실이 있을수밖에없음
        double dvalue = 3.14;
        float fvalue= (float)dvalue;   //(새로운타입)기존값
        long lvalue = (long) fvalue;
        int ivalue=(int)lvalue;
        short svalue = (short) intValue;
        byte bvalue = (byte) dvalue;  //bvalue 에는 3자료가 들어있다. 즉 손실발생하였다.


    } //main  e
} //class e
