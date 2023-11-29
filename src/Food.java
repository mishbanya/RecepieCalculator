public class Food {
    String name;
    int weight;
    double caloriesper100g;
    double proteinper100g;
    double fatper100g;
    double carbsper100g;

    public Food(String name,int weight, int caloriesper100g, double proteinper100g, double fatper100g, double carbsper100g) {
        this.name = name;
        this.weight = weight;
        this.caloriesper100g = caloriesper100g;
        this.proteinper100g = proteinper100g;
        this.fatper100g = fatper100g;
        this.carbsper100g = carbsper100g;
    }

    public double calculateCalories() {
        return caloriesper100g / 100 * weight;
    }
    public double calculateProtein() {
        return proteinper100g / 100 * weight;
    }
    public double calculateFat() {
        return fatper100g / 100 * weight;
    }
    public double calculateCarbs() {
        return carbsper100g / 100 * weight;
    }
}
