package sample;

public class Ingredient {

    private String name;
    private int calories;


    public Ingredient(String name, int calories) {
        this.name = name;
        this.calories = calories;

        System.out.println("Ingredient has been added: " + name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
