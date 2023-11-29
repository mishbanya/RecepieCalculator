import java.util.List;

public class Main {
    public static void main(String[] args) {
        Food food1 = new Food("TEOS йогурт", 210, 67, 8, 2, 4.2);
        Food food2 = new Food("Банан",180, 89, 1.09, 0.33, 22.84);
        Food food3 = new Food("Ухтышки какао-порошок", 15, 380, 4.5, 2, 85);
        List<Food> ingredients = List.of(
                food1,
                food2,
                food3
        );
        Recepie recepie = new Recepie(ingredients, "Банановые конфетки");
        recepie.printRecepie();
    }
}