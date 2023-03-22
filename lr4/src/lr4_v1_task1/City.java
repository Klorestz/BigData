package lr4_v1_task1;

import java.util.ArrayList;

public class City {
    private String  NameOfCity;
    private int population;
    public City(String nameOfCity, int population){
        this.NameOfCity = nameOfCity;
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public String getNameOfCity() {
        return NameOfCity;
    }
    public class StreetsAndSquare{
        private ArrayList<String> streets;
        private ArrayList<String> squares;
        private ArrayList<String> avenue;
        public StreetsAndSquare(ArrayList<String> squares, ArrayList<String> streets, ArrayList<String> avenue){
            this.squares = squares;
            this.streets = streets;
            this.avenue = avenue;
        }

        public ArrayList<String> getAvenue() {
            return avenue;
        }

        public ArrayList<String> getSquares() {
            return squares;
        }

        public ArrayList<String> getStreets() {
            return streets;
        }
    }
}
