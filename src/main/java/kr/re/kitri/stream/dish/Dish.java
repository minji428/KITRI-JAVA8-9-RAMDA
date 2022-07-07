package kr.re.kitri.stream.dish;

public class Dish {
    private String name;
    private boolean isvegeterian;
    private int calories;
    private String type;

    public Dish() {}
    public Dish(String name, boolean isvegeterian, int calories, String type) {
        this.name = name;
        this.isvegeterian = isvegeterian;
        this.calories = calories;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public boolean isVegeterian() {
        return isvegeterian;
    }
    public int getCalories() {
        return calories;
    }
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", isvegeterian=" + isvegeterian +
                ", calories=" + calories +
                ", type='" + type + '\'' +
                '}';
    }
}
