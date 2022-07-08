package kr.re.kitri.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterDemo {
    public static void main(String[] args) {
        LocalDate wDay = LocalDate.of(2020, 3, 1);

        LocalDate theDay = wDay.with(TemporalAdjusters.lastInMonth(DayOfWeek.WEDNESDAY));
        System.out.println(theDay);

    }
}
