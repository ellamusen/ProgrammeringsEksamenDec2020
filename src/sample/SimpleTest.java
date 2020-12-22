package sample;

import javax.crypto.spec.PSource;

public class SimpleTest {

    Recipe icingRecipe;
    Recipe teaRecipe;

    public static void main(String[] args) {
        System.out.println("Welcome to my recipe-application-dummy");

        Recipe icingRecipe = new Recipe("Icing","Steps",2,5);
        Ingredient powderedSugar = new Ingredient("Powdered sugar",400);
        Ingredient water1 = new Ingredient("Water",0);
        blankLine();
        Recipe teaRecipe = new Recipe("Tea","Steps",1,5);
        Ingredient tea = new Ingredient("Tea",0);
        Ingredient water2 = new Ingredient("Water",0);
        Ingredient lemon = new Ingredient("Lemon",0);



    }

    public static void blankLine() {
        System.out.println("\b");
    }
}
