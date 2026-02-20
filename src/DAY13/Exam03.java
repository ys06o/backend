package DAY13;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Exam03 {
    public static void main(String[] args) {
        
        //[난수 클래스]
        //[1]Random 객체 생성
        Random random = new Random();
        //1-1 0~9 사이에 난수 .nextXXX(개수)
        int var1 = random.nextInt(); //INT타입 허용 범위내 난수 생성
        System.out.println("var1 = " + var1);
        int var2 = random.nextInt(10);
        System.out.println("var2 = " + var2);
        //1-2 1부터10사이에 난수, nextXXX(개수)+시작값
        int var3=random.nextInt(10)+1;
        System.out.println("var3 = " + var3);
        //1-3 0~1사이에 실수 생성
        double var4 = random.nextDouble();
        System.out.println("var4 = " + var4);
        //1-4. true,flase 난수 생성
        boolean var5 = random.nextBoolean();
        System.out.println("var5 = " + var5);


        //활용처:인증코드/임시비밀번호 생성,주사위,
        ArrayList<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("강호동");
        list.add("신동엽");
        int index = random.nextInt(list.size()); //리스트내 항목개수 만큼 난수 생성
        System.out.println("list.get(index) = " + list.get(index));
        String code = ""; //인증코드
        for (int i = 0; i < 6; i++) {
            int rand = random.nextInt(26) + 97;
            char ch = (char) rand;
            code += ch; //인증코드에 연결
        }
        System.out.println("code = " + code);
        
        //  [2] UUID:범용 고유 식별자
        String uuid = UUID.randomUUID().toString();
        System.out.println("uuid = " + uuid);
        /*
        UUID 장점:
        -중복될 확률이 거의 없다.
        -랜덤 기반 식별자
        활용처:데이터베이스 pk,파일명,로그인세션(토큰)
        -(mysql)auto_increment:1 2 3 4 5 순으로 증가하면 가볍고 노출이 쉽다.
        -UUID:난수 이므로 무겁고 노출이 어렵다.
        */

    } //main end
} //class end 
