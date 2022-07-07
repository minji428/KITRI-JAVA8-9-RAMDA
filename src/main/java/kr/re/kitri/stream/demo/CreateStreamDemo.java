package kr.re.kitri.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStreamDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        int[] intArray = {1,2,3,4,5};
        Stream<Integer> stream = integers.stream();     // IntStream

        IntStream stream1 = Arrays.stream(intArray);

        IntStream range = IntStream.range(1, 100);  // 1 ~ 99 까지
        IntStream intStream = IntStream.rangeClosed(1, 100);// 1 ~ 100 까지

        LongStream longStream = LongStream.range(1L, 1000000L);
    }
}
