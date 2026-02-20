package DAY13;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exam02 {
    public static void main(String[] args) {
        //String 클래스
        //1.문자열 표현 방법
        char str1 = '유'; //char는 한글자만 저장 가능.
        char[] str2 = {'유', '재', '석'}; //char타입의 배열이 문자열의 시초 원래는 이런식으로 저장해야됐음
        
        //2.문자의 변환,아스키코드(C언어):7비트,유니코드(자바) 전세계 표준 문자 부호
        char str3=65;
        System.out.println("str3 = " + str3); //A
        char[] str4 = {74, 65, 86, 65};
        System.out.println("str4 = " + Arrays.toString(str4));
        char str5 = '김';
        System.out.println("(int)str5 = " + (int)str5);

        //3. 문자열 생성, ==리터럴 비교
        String str6 = "유재석"; //문자 리터럴 형식
        String str7 = "유재석";
        String str8 = new String("유재석"); //문자 객체 형식
        System.out.println(str6 == str7); //true
        System.out.println(str6 == str8); //false
        System.out.println(str6.equals(str8)); //true


        //4.주요 기능/메소드
        // 1.문자열.concat("새로운문자열"):문자열에 새로운 문자열을 연결하여 (새로운 문자열)반환하는 함수
        String str9 = "자바"; //str9주소값
        String str10 = str9.concat("프로그래밍");
        System.out.println(str9.concat("프로그래밍")); //str10주소값
        //str9이랑 str10주소값은 다르다!
            //2."문자열"+"새로운문자열":연결 새로운 문자열이 반환된다.
        String str11 = str9 + "프로그래밍";
        System.out.println("str11 = " + str11);
            //3.StringBuilder 클래스,append라는 함수를 이용하여 문자열을 연결하는 객체 *주소값 유지 가능*
        StringBuilder builder = new StringBuilder();
        builder.append(str9);
        builder.append("프로그래밍");
        System.out.println("builder = " + builder);
            //4.String.format("%","문자열");
        String str12=String.format("%s%s", str9, "프로그래밍");
        System.out.println("str12 = " + str12);
            //5.""" 자동 줄바꿈 표현 하는 문자열
        String str13 = """
                자바
                프로그래밍
                """;
        System.out.println("str13 = " + str13);
            //활용:jdbc sql
        String name = "유재석";
        String sql1="insert into table(name)values("+name+")";
        String sql3 = String.format("insert into table(name)values(%s)", name);
        StringBuilder sql4 = new StringBuilder();
        sql4.append("insert into table(name)");
        sql4.append("value()");
        
        //6..charAt(인덱스),문자열내 지정한 인덱스 번호의 문자 한개 추출/반환
        char gender = "020202-123213".charAt(7);
        System.out.println("gender = " + gender);
        
        //7..length():문자열내 문자 개수/길이 반환
        System.out.println("020202-123123".length());
        System.out.println("gender = " + gender);
        //8..replace(기존문자,새로운문자) ":문자열내 기존문자가 존재하면 새로운 문자로 치환하여 문자열 반환
        String str14 = "자바프로그래밍".replace("자바", "JAVA");
        System.out.println("str14 = " + str14);

        //활용:HTML(데이터수집 과정 정제 /정리)
        String html = "<div>유재석</div>";
        html.replaceAll("<div>","\n");
        
        //9..substring(시작,끝) ,시작부터 끝 인덱스까지 문자열 반환
        String str15 = "1232132-12421424".substring(0, 6);
        System.out.println("str15 = " + str15);
        
        //10. .split("구분문자") 구분문자를 기준으로 잘라서 배열로 반환 활용처:날짜/시간,csv,데이터정리 등
        String[] str16 = "2143214-1241244".split("-");
        System.out.println("str16[0] = " + str16[0]);
        System.out.println("str16[0] = " + str16[1]);

        //11. .indexOf("찾을문자), 찾을문자가 존재하면 찾은 인덱스번호,아니면 -1 활용처:검색
        //12. .contains("찾을문자"), 찾을문자가 존재하면 true,아니면 false 반환 활용처:검색
        System.out.println("자바 프로그래밍".indexOf("프로")); //3(인덱스번호)
        System.out.println("자바 프로그래밍 언어".contains("프로")); //true

        //13. .getBytes() 문자열을 byte[]로 반환/추출
        // new String(문자열바이트) ,byte배열-->문자열타입
        byte[] str17 = "자바프로그래밍".getBytes();
        System.out.println(Arrays.toString(str17));
        String str18 = new String(str17);
        System.out.println("str18 = " + str18);
    }  ///main end
} //class end

