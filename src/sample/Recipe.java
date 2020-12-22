package sample;

import java.util.ArrayList;

public class Recipe {

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

    public ArrayList showIngredients() {
        return ingredients;
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
}
