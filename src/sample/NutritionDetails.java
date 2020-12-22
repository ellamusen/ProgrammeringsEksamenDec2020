package sample;

public class NutritionDetails extends Ingredient {

    public int cVitamin;
    public int magnesium;
    public int calcium;

    public NutritionDetails(String name, int calories, int cVitamin, int magnesium, int calcium) {
        super(name, calories);
        this.cVitamin = cVitamin;
        this.magnesium = magnesium;
        this.calcium = calcium;
    }
}
