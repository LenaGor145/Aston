import java.util.ArrayList;

public class Park {
    private String parkName;
    private Attraction attraction;
    private ArrayList<Attraction> attractions = new ArrayList<Attraction>();

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public String getParkName() {
        return this.parkName;
    }

    public void setParkAtrction(String attractionName, String workingHours, double price) {
        this.attractions.add(new Attraction(attractionName, workingHours, price));
    }

    public void getAtractionsInConsole() {
            if (this.attractions.isEmpty()) {
                System.out.println("This park has no attractions");
            } else {
                System.out.println("This park has " + this.attractions.size() + " attractions");
                for(Attraction attraction : this.attractions) {
                    attraction.printInfo();
                }
            }
        }



    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;

        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Attraction Name: " + attractionName);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Price: $" + price);
        }
    }

}