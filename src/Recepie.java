import java.util.List;

public class Recepie {
    String name;
    List<Food> ingredients;

    public Recepie(List<Food> ingredients, String name) {
        this.ingredients = ingredients;
        this.name = name;
    }

    public int calculateTotalWeight() {
        int totalweight = 0;
        for (Food ingredient : ingredients) {
            totalweight += ingredient.weight;
        }
        return totalweight;
    }
    public double calculateCalories() {
        double totalcalories = 0;
        for (Food ingredient : ingredients) {
            totalcalories += ingredient.calculateCalories();
        }
        return totalcalories;
    }
    public double calculateProtein() {
        double totalprotein = 0;
        for (Food ingredient : ingredients) {
            totalprotein += ingredient.calculateProtein();
        }
        return totalprotein;
    }
    public double calculateFat() {
        double totalfat = 0;
        for (Food ingredient : ingredients) {
            totalfat += ingredient.calculateFat();
        }
        return totalfat;
    }
    public double calculateCarbs() {
        double totalcarbs = 0;
        for (Food ingredient : ingredients) {
            totalcarbs += ingredient.calculateCarbs();
        }
        return totalcarbs;
    }

    public double calculateCaloriesPer100g() {
        return calculateCalories() / calculateTotalWeight() * 100;
    }
    public double calculateProteinPer100g() {
        return calculateProtein() / calculateTotalWeight() * 100;
    }
    public double calculateFatPer100g() {
        return calculateFat() / calculateTotalWeight() * 100;
    }
    public double calculateCarbsPer100g() {
        return calculateCarbs() / calculateTotalWeight() * 100;
    }
    public void printRecepie() {
        System.out.println("Recepie: " + name);
        System.out.println("Ingredients:\n");
        for (Food ingredient : ingredients) {
            System.out.println(ingredient.name + " " + ingredient.weight + "g");
        }
        System.out.println("\nTotal weight: " + calculateTotalWeight() + "g");
        System.out.println("Total calories: " + calculateCalories() + "kcal");
        System.out.println("Total protein: " + calculateProtein() + "g");
        System.out.println("Total fat: " + calculateFat() + "g");
        System.out.println("Total carbs: " + calculateCarbs() + "g");
        System.out.println("Calories per 100g: " + String.format("%.2f",calculateCaloriesPer100g()) + "kcal");
        System.out.println("Protein per 100g: " + String.format("%.2f",calculateProteinPer100g()) + "g");
        System.out.println("Fat per 100g: " + String.format("%.2f",calculateFatPer100g()) + "g");
        System.out.println("Carbs per 100g: " + String.format("%.2f",calculateCarbsPer100g()) + "g");
    }
}
