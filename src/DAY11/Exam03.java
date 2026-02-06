package DAY11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam03 {
    public static void main(String[] args) {

        //[JDBC]:자바 데이터베이스 연동 라이브러리
        //mysql-connector-j-9.6.0 파일 준비
        //준비된 .jar파일을 프로젝트폴더에 넣어준다.
        //.jar파일을 오른쪽버튼 클릭->하단에 라이브러리 추가 *프로젝트 마다 1번*
        //[연동1 JDBC 클래스 호출] Class.forName("패키지명.JDBC클래스명") *SQL회사마다 다르다. *일반예외 발생*
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //해당클래스가 존재하면 동적으로 객체를 생성
            //[연동 2 DB서버 계정정보]
            //String url = "jdbc:mysql://localhost:포트번호/데이터베이스명";
            // String user="계정명";
            // String password="비밀번호"; //띄어쓰기 주의
            String url = "jdbc:mysql://localhost:3306/mydb0205";
            String user = "root";
            String password = "1234";
            // [연동3]Connection(I) java.sql 패키지
            //DriverManager.getConnection(C) mysql 구현체,일반예외
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("연동성공!!");

            //[연동 이후 DML(select,insert,delete,update)]
            String sql="insert into buy values(null,'BLK','지갑','가죽',30,5)"; //실행할 sql문법을 문자열로 작성한다.
            //ctrl+enter 대신 실행 메소드 사용
            PreparedStatement ps =conn.prepareStatement(sql); //conn.prepareStatement(sql); sql기재
            //기재된 sql을 실행
            int count = ps.executeUpdate(); //기재된sql 실행후 반영된 레코드 수 반환
            System.out.println("등록된 레코드는:"+count+"개 입니다.");

        } catch (ClassNotFoundException e) {
            System.out.println(e); //드라이버 클래스 연동 실패
        } catch (SQLException e) {
            System.out.println("등록된 DB서버로 연동실패 "+e);
        }

    } //main end
} //class end
