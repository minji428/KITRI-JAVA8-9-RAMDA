package kr.re.kitri.datetime;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class NextGymDayOff implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal){
        DayOfWeek dow = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        return null;
    }
}
