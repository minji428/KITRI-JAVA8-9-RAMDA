package kr.re.kitri.datetime;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {
    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        start.toEpochMilli(); // 1970년까지의 숫자

        Thread.sleep(150);
        Instant end = Instant.now();
        Duration timeElasped = Duration.between(start, end);

        System.out.println(timeElasped.toMillis());
    }
}
