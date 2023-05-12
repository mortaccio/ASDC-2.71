import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    /**
     * Метод main, точка входа в программу.
     * В данном коде класс Main представляет точку входа в программу. 
     * В методе main происходит чтение данных из файла "Dishes.csv" и 
     * создание объектов класса Dish на основе считанных данных.
     * Затем каждое блюдо выводится на экран в формате:
     *  название | цена | вес | первый тип | второй тип.
     */
    public static void main(String[] args) throws IOException {
        ArrayList<Dish> dishes = new ArrayList<Dish>();
        BufferedReader reader = new BufferedReader(new FileReader("./Dishes.csv"));

        String line = reader.readLine();
        while (line != null) {
            String[] fields = line.split(",");
            Dish dish = new Dish();
            dish.setDishName(fields[0]);
            dish.setPrice(Integer.parseInt(fields[1]));
            dish.setWeight(Integer.parseInt(fields[2]));
            dish.setTypeOne(fields[3]);
            dish.setTypeTwo(fields[4]);
            dishes.add(dish);

            line = reader.readLine();
        }

        for (Dish dish : dishes) {
            System.out.println(dish.getDishName() + " | " + dish.getPrice() + " | " + dish.getWeight() + " | " + dish.getTypeOne() + " | " + dish.getTypeTwo());
        }
        reader.close();
    }
}