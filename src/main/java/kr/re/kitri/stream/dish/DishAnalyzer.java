package kr.re.kitri.stream.dish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DishAnalyzer {
    public static List<Dish> dishes = Arrays.asList(
            new Dish("beef", false, 600, "MEAT"),
            new Dish("pork", false, 800, "MEAT"),
            new Dish("chicken", false, 450, "MEAT"),
            new Dish("french fries", true, 530, "OTHER"),
            new Dish("rice", true, 300, "OTHER"),
            new Dish("spagetti", true, 400, "NOODLE"),
            new Dish("apple", true, 300, "FRUIT"),
            new Dish("melon", true, 320, "FRUIT"),
            new Dish("salmon", true, 420, "FISH"),
            new Dish("prawn", true, 410, "FISH")
    );

    public static void main(String[] args) {
        List<String> dishStream = dishes.stream()
                .filter(Dish::isVegeterian)
                .filter(dish -> dish.getCalories() <= 400)
                .sorted(Comparator.comparingInt(Dish::getCalories))
                .map(Dish::getName)
                .collect(Collectors.toList());

        System.out.println(dishStream.subList(0,3));
    }
}
