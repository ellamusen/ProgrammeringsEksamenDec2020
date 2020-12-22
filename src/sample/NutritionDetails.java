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

    public boolean preventsCold() {
        if (this.cVitamin > 5) {
            System.out.println(super.getName() + " is great against a cold");
            return true;
        }
        else {
            System.out.println(super.getName() + " is not great against a cold");
            return false;
        }
    }

}
