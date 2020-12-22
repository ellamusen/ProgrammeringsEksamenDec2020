package sample;

import java.util.ArrayList;

public class SimpleTest {

    Recipe icingRecipe;
    Recipe teaRecipe;


    public static void main(String[] args) {
        System.out.println("Welcome to my recipe-application-dummy");

        Recipe icingRecipe = new Recipe("Icing", "Mix all ingredients", 0, 5);
        Ingredient powderedSugar = new Ingredient("Powdered sugar", 400);
        Ingredient water1 = new Ingredient("Water", 0);
        icingRecipe.addIngredient(powderedSugar);
        icingRecipe.addIngredient(water1);
        blankLine();
        Recipe teaRecipe = new Recipe("Tea", "Let tea rest in hot water for 2 minutes and add lemon juice", 1, 5);
        Ingredient tea = new Ingredient("Tea", 0);
        Ingredient water2 = new Ingredient("Water", 0);
        Ingredient lemon = new Ingredient("Lemon", 11);
        teaRecipe.addIngredient(tea);
        teaRecipe.addIngredient(water2);
        teaRecipe.addIngredient(lemon);

        blankLine();

        icingRecipe.showRecipe();

        blankLine();

        teaRecipe.showRecipe();

        blankLine();

        lemon.richOnCalories();
        powderedSugar.richOnCalories();

        blankLine();

        NutritionDetails orange = new NutritionDetails("Orange",5,6,2,5);
        NutritionDetails horse = new NutritionDetails("Horse",1000,1,2,3);

        blankLine();

        orange.preventsCold();
        horse.preventsCold();

        blankLine();

        water1.totalCalories();
        teaRecipe.totalCalories();

        blankLine();

        icingRecipe.caloriesPerPortion();
    }


    public static void blankLine() {
        System.out.println("\b");
    }
}
