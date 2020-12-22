package sample;

import java.util.ArrayList;

public class Recipe implements CalorieCalculator {

    private String name;
    private String approach;
    private int servings;
    private int timeInMinutes;
    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();


    public Recipe(String name, String approach, int servings, int timeInMinutes) {
        this.name = name;
        this.approach = approach;
        this.servings = servings;
        this.timeInMinutes = timeInMinutes;

        System.out.println("Recipe has been added: " + name);
    }


    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void showIngredients() {
        System.out.println("For " + this.name + " you'll need: ");
        for (int i = 0; i < this.ingredients.size(); i++) {
            Ingredient currentIngredient = this.ingredients.get(i);
            System.out.println("- " + currentIngredient.getName());
        }
    }

    public void showApproach () {
        System.out.println("Recipe for " + this.name + ":");
        System.out.println("- " + this.approach);
    }

    public void showRecipe() {
        this.showIngredients();
        this.showApproach();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApproach() {
        return approach;
    }

    public void setApproach(String approach) {
        this.approach = approach;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    @Override
    public int totalCalories() {
        int total = 0;
        for (int i = 0; i < this.ingredients.size(); i++) {
            total += this.ingredients.get(i).getCalories();
        }
        System.out.println("Recipe " + this.name + " contains " + total + " calories");
        return total;
    }

    public int caloriesPerPortion() {
        try {
            return totalCalories() / this.servings;

        } catch (Exception exception) {
            System.out.println("ERROR - " + this.name + " needs to have at least 1 serving");
        }
        return 0;
    }
}
