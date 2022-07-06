package kr.re.kitri.firstdemo;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo2 {
    public static void main(String[] args) {
        List<String> favoriteColors = Arrays.asList(
                "red", "orange", "blue", "white", "violet"
        );

        System.out.println(favoriteColors);

        favoriteColors.sort((o1, o2) -> o1.length() - o2.length());

        System.out.println(favoriteColors);
    }
}
