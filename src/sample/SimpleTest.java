package sample;

import java.util.ArrayList;

public class SimpleTest {

    Recipe icingRecipe;
    Recipe teaRecipe;


    public static void main(String[] args) {
        System.out.println("Welcome to my recipe-application-dummy");

        Recipe icingRecipe = new Recipe("Icing","Steps",2,5);
        Ingredient powderedSugar = new Ingredient("Powdered sugar",400);
        Ingredient water1 = new Ingredient("Water",0);
        icingRecipe.addIngredient(powderedSugar);
        icingRecipe.addIngredient(water1);
        blankLine();
        Recipe teaRecipe = new Recipe("Tea","Steps",1,5);
        Ingredient tea = new Ingredient("Tea",0);
        Ingredient water2 = new Ingredient("Water",0);
        Ingredient lemon = new Ingredient("Lemon",0);
        teaRecipe.addIngredient(tea);
        teaRecipe.addIngredient(water2);
        teaRecipe.addIngredient(lemon);

        blankLine();

        System.out.println("For " + icingRecipe.getName() + " you'll need: ");
        for (int i = 0; i < icingRecipe.showIngredients().size(); i++) {
            Ingredient currentIngredient = (Ingredient) icingRecipe.showIngredients().get(i);
            System.out.println("- " + currentIngredient.getName());
        }
        blankLine();
        System.out.println("For " + teaRecipe.getName() + " you'll need: ");
        for (int i = 0; i < teaRecipe.showIngredients().size(); i++) {
            Ingredient currentIngredient = (Ingredient) teaRecipe.showIngredients().get(i);
            System.out.println("- " + currentIngredient.getName());
        }
    }


    public static void blankLine() {
        System.out.println("\b");
    }
}
