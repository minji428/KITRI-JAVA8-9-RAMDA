package kr.re.kitri.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY)).minusDays(2);
        LocalDate firstMondayOfMonth = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY)).minusDays(2);

        int diff = date.getDayOfMonth() - firstMondayOfMonth.getDayOfMonth();
        int weekNum = (int) Math.ceil(diff / 7) + 1;

        if(weekNum == 1 || weekNum == 3) {
            System.out.println("첫째 셋째 수요일");
        }
    }
}
