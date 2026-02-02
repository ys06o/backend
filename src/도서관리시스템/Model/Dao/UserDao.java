package 도서관리시스템.Model.Dao;

import DAY07.package1.A;
import 도서관리시스템.Model.Dto.UserDto;

import java.util.ArrayList;

public class UserDao {
    private UserDao() {
    }

    private static final UserDao instance = new UserDao();

    public static UserDao getInstance() {
        return instance;
    }

    private final ArrayList<UserDto> userTable = new ArrayList<>();

    //1.회원가입 메소드

    private int userNo = 1;

    public boolean signup(String id, String pw, String userName) {
        System.out.println("UserDao.signup");
        System.out.println("id = " + id + ", pw = " + pw + ", userName = " + userName);
        UserDto userDto = new UserDto(userNo, id, pw, userName);
        boolean result = userTable.add(userDto);
        if (result) {
            userNo++;
        }
        return result;
    }

    //2.로그인 메소드
    public int login(String id, String pw) {
        System.out.println("UserDao.login");
        System.out.println("id = " + id + ", pw = " + pw);
        if (id.equals("1234") && pw.equals("1234")) {
            return -1;
        }
        //비교과정
        for (int index = 0; index <= userTable.size() - 1; index++) {

            UserDto userDto = userTable.get(index);
            if (userDto.getId().equals(id) && userDto.getPw().equals(pw)) {
                return userDto.getUno();
            }
        }
        return 0;
    }


    public UserDto getUser(int uno) {
        for (UserDto user : userTable) {
            if (user.getUno() == uno) {
                return user;
            }
        }
        return null;
    }



}
