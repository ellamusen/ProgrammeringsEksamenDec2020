package sample;

public class Ingredient implements CalorieCalculator{

    private String name;
    private int calories;

    public Ingredient(){

    }

    public Ingredient(String name, int calories) {
        this.name = name;
        this.calories = calories;

        System.out.println("Ingredient has been added: " + name);
    }

    public boolean richOnCalories() {
        if (this.calories > 100) {
            System.out.println(this.name + " is rich on calories");
            return true;
        }
        else {
            System.out.println(this.name + " is not rich on calories");
            return false;
        }
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

    @Override
    public int totalCalories() {
        System.out.println(this.name + " has a total of " + this.calories + " calories");
        return this.calories;
    }
}
