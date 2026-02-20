


package DAY13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exam01 {
    public static void main(String[] args) {

        // [1] 날짜/시간 클래스
        //1-1현재날짜 클래스
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        LocalTime localTime= LocalTime.now();
        System.out.println("localTime = " + localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        
        //정해진 날짜/시간 생성(연도,월,일,시,분,초)
        LocalDateTime dateTime = LocalDateTime.of(2020, 3, 5, 11, 23, 24);
        System.out.println("dateTime = " + dateTime);
        
        //1-5정해진 패턴(형식)지정, 패턴:y M d h m s
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시mm분ss초 ");
        String today = dateTime.format(formatter); //날짜/시간객체.format(날짜/시간패턴)
        System.out.println("today = " + today);

        //1-6
        LocalDateTime localDateTime1 = dateTime.plusDays(10);
        System.out.println("localDateTime1 = " + localDateTime1);
        LocalDateTime localDateTime2 = dateTime.minusDays(20);
        System.out.println("localDateTime2 = " + localDateTime2);
        int year = localDateTime.getYear();
        System.out.println("year = " + year);
       int day=localDateTime.getDayOfMonth();
        System.out.println("day = " + day);
        int minute = localDateTime.getMinute();
        System.out.println("minute = " + minute);
        int sc = localDateTime.getSecond();
        System.out.println("sc = " + sc);


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        
        
        
        
        
        
        

        








    } //
    // main end
} //clsss end
































