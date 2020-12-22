package sample;

import java.util.List;

public class Recipe {

    private String name;
    private String approach;
    private int servings;
    private int timeInMinutes;
    private List<Ingredient> ingredients;


    public Recipe(String name, String approach, int servings, int timeInMinutes, List<Ingredient> ingredients) {
        this.name = name;
        this.approach = approach;
        this.servings = servings;
        this.timeInMinutes = timeInMinutes;
        this.ingredients = ingredients;

        System.out.println("Recipe has been added: " + name);
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

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
