package 도서관리시스템.Model.Dto;

import java.util.ArrayList;

public class UserDto {
    private int uno; //회원번호
    private String id; //회원아이디
    private String pw; //회원비밀번호
    private String userName;//회원이름

    private ArrayList<Integer> myBookNos = new ArrayList<>();  //빌린책번호 저장

    public ArrayList<Integer> getMyBookNos() {
        return myBookNos;
    }

    public UserDto(){}

    public UserDto(int uno, String id, String pw, String userName) {
        this.uno = uno;
        this.id = id;
        this.pw = pw;
        this.userName = userName;
    }


    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "uno=" + uno +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
