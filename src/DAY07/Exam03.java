package DAY07;

public class Exam03 {
    public static void main(String[] args) {

        //[1]멤버변수가private이면 다른 클래스에서 접근 불가능
        User user = new User();
//        user.name = "유재석";  //에러
//        System.out.println("user.name = " + user.name);//에러

        //getter를 이용한 멤버변수 접근(호출)
        System.out.println(user.getName());

        //setter를 이용한 멤버변수 접근(저장)
        user.setName("유재석");

        System.out.println(user);
    }
}

class User {
    //멤버변수
    private String name;
    private String age;

    //생성자


    //메소드
    //*****관례적으로 private 멤버변수 대해 간접접근 메소드 ******
    //getter 메소드:호출용
    public String getName() {
        return this.name;
    }

    //setter 메소드:저장용

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    //*toString() 메소드
    //모든 클래스가 자동으로 갖고있는 메소드중 하나.
    //객체의 주소(위치)값 출력
    //자동:alt+insert눌러서 생성에 toString 클릭

    @Override  //오버라이드 : 기존 메소드를 커스텀/재정의 //내방식대로 커스텀
    //그니까 객체에 주소값 대신에 출력하고싶은거를 만들면 된다.
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}


//1.멤버변수앞에는 거의 무조건 private붙이기
//2. getter/setter는 거의 무조건 씀
//3.toString 도 거의 무조건 입력하고 시작

