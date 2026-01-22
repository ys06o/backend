package DAY03;

public class Exam01 { //class s
    public static void main(String[] args) { //main s

        //[1] 조건문 if,경우의 수
        // (1) if(조건문) 실행문;
        int 온도 = 5;
        if(온도<=10) {
            System.out.println("외투 입니다.");
        }

        //(2)
            int 나이 = 10;
            if(나이>=19){
                System.out.println("성인 입니다.");
                System.out.printf("19세 입니다.");
            }


            //(3)
        boolean 회원검사 = false;
        if(회원검사==true){
            System.out.println("안녕하세요 회원님");
        }
        else{
            System.out.println("비회원 입니다.");
        }

        //(4)  여러 조건의 따른 하나의 실행문을 갖는다.
        int 지갑 = 1750;
        if(지갑>=3000){
            System.out.println("택시를 탄다.");
        }
        else if(지갑>=1700){
            System.out.println("버스를 탄다.");
        }
        else if(지갑>=1200){
            System.out.println("전동자전거를 탄다.");
        }
        else{
            System.out.println("걸어간다.");
        }

        //vs여러 조건에 따른 여러 실행문을 갖는다.
//        int 지갑 = 1750;
//        if(지갑>=3000){
//            System.out.println("택시를 탄다.");
//        }
//        if(지갑>=1700){
//            System.out.println("버스를 탄다.");
//        }
//        if(지갑>=1200){
//            System.out.println("전동자전거를 탄다.");
//        }
//        if{
//            System.out.println("걸어간다.");
//        }


        //(5)if 중첩문
        int age = 25;
        char gender = 'w';

        if(age>=19){
            System.out.println("성인");
            if(gender=='w'){
                System.out.println("여자");
            }
            else {
                System.out.println("남자");
            }
        }
        else{
            System.out.println("미성년자");
        }

        //(6)switch문:논리검사 보다 값에 따른 흐름 제어를 할때 자주 사용 //break가 필수이다. switch 문을 탈출할때 사용
        // 정해진 경우의 수가 있을때 스위치문 많이 사용한다.
        char grade = 'a';
        switch (grade){
            case 'a':{
                System.out.println("우수학생");
                break;
            }
            case 'b':{
                System.out.println("장려학생");
                break;
            }
            default:
                System.out.println("그외 학생");
        }

        //(7)switch중첩
        int adult = 1;
        char gender2 = 'w';
        switch (adult){
            case 1:
                System.out.println("성인");
                switch (gender2){
                    case 'w':
                        System.out.println("성인여자");
                        break;
                    case 'm':
                        System.out.println("성인남자");
                }
                break;
            case 2:
                System.out.println("미성년자");
                break;
        }


    } //main e
} //class e
