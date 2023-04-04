import java.util.ArrayList;

class City {
    private String name;
    private int population;

    City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    String getName() {
        return name;
    }

    int getPopulation() {
        return population;
    }

    void setPopulation(int population) {
        this.population = population;
    }
}

public class CityArrayList {
    public static void main(String[] args) {

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Shimoga",5765000));
        cities.add(new City("Banglore",3279000));
        cities.add(new City("Kundapura",456000));

        for (City city : cities) {
            System.out.println("Name: " + city.getName());
            System.out.println("Population: " + city.getPopulation());
            System.out.println();
        }

        cities.get(1).setPopulation(cities.get(1).getPopulation() + 100000);

        System.out.println("Updated information for " + cities.get(1).getName());
        System.out.println("Population: " + cities.get(1).getPopulation());
    }
}