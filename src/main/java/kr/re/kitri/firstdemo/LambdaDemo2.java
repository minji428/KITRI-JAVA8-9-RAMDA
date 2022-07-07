package kr.re.kitri.firstdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo2 {
    public static void main(String[] args) {
        List<String> favoriteColors = Arrays.asList(
                "red", "orange", "blue", "white", "violet"
        );

        System.out.println(favoriteColors);
        favoriteColors.sort(Comparator.comparingInt(String::length));
        System.out.println(favoriteColors);
    }
}
