package lr4_v1_task1;

import java.util.ArrayList;
import java.util.Arrays;

public class lr4_v1_task1 {
    public static void main(String[] args) {
        City city = new City("Москва", 12655050);
        ArrayList<String> streets = new ArrayList<>(Arrays.asList("Тверская", "Новый Арбат", "Пресненская набережная"));
        ArrayList<String> squares = new ArrayList<>(Arrays.asList("Красная площадь", "Пушкинская площадь", "Театральная площадь"));
        ArrayList<String> avenues = new ArrayList<>(Arrays.asList("Ленинградский проспект", "Пресненский вал", "Кутузовский проспект"));
        City.StreetsAndSquare streetsAndSquares = city.new StreetsAndSquare( squares, streets, avenues);
        ArrayList<String> cityStreets = streetsAndSquares.getStreets();
        ArrayList<String> citySquares = streetsAndSquares.getSquares();
        ArrayList<String> cityAvenues = streetsAndSquares.getAvenue();
        System.out.println("Улицы:");
        System.out.println(cityStreets);
        System.out.println("Проспекты:");
        System.out.println(cityAvenues);
        System.out.println("Площади:");
        System.out.println(citySquares);
    }
}
