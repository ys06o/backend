package DAY13;

import 도서관리시스템.Model.Dto.BookDto;
import 종합.예제7.model.dto.BoardDto;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice15 {
    public static void main(String[] args) {
        /*[실습] 제출용 */

/*[문제 1] BookDto는 toString()을 오버라이딩하지 않고 BoardDto는 toString()을 오버라이딩하도록 만든 뒤 Object 타입 변수에 저장하여 두 객체를 하나의 출력문으로 출력했을 때 결과 차이가 나타나게 만드세요.
[출력예시]
day.BookDto@7cca494b | BoardDto{...}
*/
        BookDto bookDto = new BookDto();
        Object o1=bookDto.toString();
        BoardDto boardDto = new BoardDto();
        Object o2=boardDto.toString();
        System.out.println("o1 = " + o1);
        System.out.println("o2 = " + o2);

/*[문제 2] new String("유재석")으로 생성한 두 객체의 == 와 equals() 비교 결과를  출력하시오.
[출력예시]
== 비교:false, equals 비교:true
*/
        String str1=new String("유재석");
        String str2 =new String("유재석");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
/*[문제 3] Class 리플렉션
1. String 객체를 하나 생성하고 getClass()를 이용하여 클래스 타입 정보를 가져오세요.
2. Class.forName("java.lang.String")을 사용하여 String 클래스를 직접 로드하세요.
3. 로드된 Class 객체에서 getMethods()를 사용하여 메소드 개수를 구하세요.
4. 위 결과들을  출력하시오.
[출력예시]
class java.lang.String | forName 성공 | method count:90
*/
        String str3 = new String();
        System.out.println(str3.getClass());
        try {
           Class.forName("java.lang.String");
            System.out.println("forName성공");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        String s1 = new String();
        Method[] methods = s1.getClass().getMethods();
        int  count=0;
        for (int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            count++;
        }
        System.out.println("method count:"+count);





/*[문제 4] 문자열 "100"과 "3.14"를 각각 기본타입으로 변환하고 기본타입을 문자열로 변환하는 방법을 포함하여 출력하시오.
[출력예시]
int:100, double:3.14, str1:"100", str2:"100"
*/

        int value1 = Integer.parseInt("100");
        double value2=Double.parseDouble("3.14");
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        String sa1=value1+"";
        String sa2=value2+"";
        System.out.println("sa2 = " + sa2);
        System.out.println("sa1 = " + sa1);



/*[문제 5] LocalDateTime.now()로 현재 날짜/시간을 생성하고 지정된 포맷으로 변환 후 +10일, -30일 계산 결과를  출력하시오.
[출력예시]
현재:2025년 07월 25일 11:43:11 | +10일:2025-08-04T11:43:11 | -30일:2025-06-25T11:43:11
*/
        LocalDateTime localDateTime = LocalDateTime.of(2025, 7, 25, 11, 43, 11);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss");
        String today = localDateTime.format(formatter);
        LocalDateTime localDateTime1 = localDateTime.plusDays(10);
        LocalDateTime localDateTime2 = localDateTime.minusDays(30);
        System.out.println("현재:"+today+"|"+"+10일:"+localDateTime1+"|"+"-30일:"+localDateTime2);
    }
}
