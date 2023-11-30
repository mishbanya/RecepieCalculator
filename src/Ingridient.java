public class Ingridient extends Food{
    private int weight;

    public Ingridient(String name, int caloriesper100g, double proteinper100g, double fatper100g, double carbsper100g, int weight) {
        super(name, caloriesper100g, proteinper100g, fatper100g, carbsper100g);
        this.weight = weight;
    }
    public Ingridient(Food food, int weight) {
        super(food.name, food.caloriesper100g, food.proteinper100g, food.fatper100g, food.carbsper100g);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
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
