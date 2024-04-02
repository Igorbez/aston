import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String openingTime, String closingTime, double cost) {
        Attraction attraction = new Attraction(name, openingTime, closingTime, cost);
        attractions.add(attraction);
    }

    public void displayAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println("Аттракцион: " + attraction.getName());
            System.out.println("Время открытия: " + attraction.getOpeningTime());
            System.out.println("Время закрытия: " + attraction.getClosingTime());
            System.out.println("Стоимость: руб." + attraction.getCost());
            System.out.println();
        }
    }

    public class Attraction {
        private String name;
        private String openingTime;
        private String closingTime;
        private double cost;

        public Attraction(String name, String openingTime, String closingTime, double cost) {
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public String getOpeningTime() {
            return openingTime;
        }

        public String getClosingTime() {
            return closingTime;
        }

        public double getCost() {
            return cost;
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        park.addAttraction("Колесо обозрения", "10:00", "21:00", 10);
        park.addAttraction("Уличные гонки", "11:00", "20:00", 5);

        park.displayAttractions();
    }
}

