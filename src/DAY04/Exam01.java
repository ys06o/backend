package DAY04;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        //[1] 1부터 5까지 출력하세요.
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        //vs 초기값:1,조건문:5까지 ,증감식:1씩증가
        for(int 출력값=1;출력값<=5; 출력값++){
            System.out.println(출력값);
        } //1번 for end

        // [2] 구구단
          //(1)2단~9단 1부터 9까지 증가
        for(int 단=2; 단<=9; 단++){
            for(int 곱=1; 곱<=9; 곱++){
                System.out.printf("%d X %d=%d\n",단,곱,단*곱);
            }
        }
        //(2)곱
        //단마다 곱? 곱마다 단? vs구매 목록[식별변호pno] 출력하고 제품 마다 제품목록[pno/pname]
        //단마다 곱

        //[3]break:가장 가까운 반복문{}/switch{} 탈출/continue:가장 가까운 반복문(증감식)이동;
        for(int i=1; i<=5; i++){
            if(i==3){break;}  //코드 흐름이 break를 만나면 반복문 탈출
            System.out.println(i);
        }  //출력:1 2

        for(int i=1; i<=5; i++){
            if(i==3){continue;}
            System.out.println(i);
        }

        //[4]무한루프:조건문이 true 상수로 계속 되는 반복문
//        for(;;){
//            System.out.println("무한루프");
//        }


        while( true ){
            System.out.println("무한루프");
            Scanner scan = new Scanner(System.in);
            String data = scan.next();
            if(data.equals("q")){break;}
        }

        for(int 단=2; 단<=9; 단++){
            for(int 곱=1; 곱<=9; 곱++){
                System.out.printf("%d X %d=%d\n",단,곱,단*곱);
            }
        }


    }  //main e
} //class e
