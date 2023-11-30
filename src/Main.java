import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Food> foods = List.of(
                new Food("TEOS йогурт", 67, 8, 2, 4.2),
                new Food("Банан",89, 1.09, 0.33, 22.84),
                new Food("Ухтышки какао-порошок", 380, 4.5, 2, 85)
        );

        Recepie recepie = new Recepie("Банановые конфетки");
        recepie.addIngridient(new Ingridient(searchFoodByName(foods, "Банан"), 275));
        recepie.addIngridient(new Ingridient(searchFoodByName(foods, "TEOS йогурт"), 300));
        recepie.addIngridient(new Ingridient(searchFoodByName(foods, "Ухтышки какао-порошок"), 25));
        recepie.printRecepie();
    }

    public static Food searchFoodByName(List<Food> foods, String name) {
        for (Food food : foods) {
            if (food.name.equals(name)) {
                return food;
            }
        }
        return null;
    }
}