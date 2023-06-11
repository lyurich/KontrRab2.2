import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Трактор", 2.4);
        Toy toy2 = new Toy(1, "Пупс", 0.7);
        Toy toy3 = new Toy(2, "Пистолет", 1.1);
        Toy toy4 = new Toy(3, "Мягкая игрушка", 0.2);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.ToyLottery();
        toyStore.ToyLottery();
        toyStore.ToyLottery();
        toyStore.ToyLottery();


    }
    
    
}