package kr.re.kitri.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateTimeDemo01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalDateTime todaynow = LocalDateTime.now();
        System.out.println(todaynow);

        // 특정일 표현, 작년 크리스마스
        LocalDate lastChristmas = LocalDate.of(2021, 12, 25);
        LocalDate theDay = lastChristmas.minusWeeks(2);

        // 2002-09-11 300일 후의 2달 전..
        LocalDate.of(2001, 9, 11)
                .plusDays(300)
                .minusMonths(2);

        // 잠자는 시간 오후 11시.. 잠자기 30분전..
        LocalTime.of(23, 0).minusMinutes(30);

        // 날짜의 갭 .. Period
        LocalDate nineoneone = LocalDate.of(2001, 9, 11);
        LocalDate today2 = LocalDate.now();

        Period nineoneoneToNow = nineoneone.until(today2);
        Period nineoneoneToNow2 = Period.between(nineoneone, today2);


    }
}
