public class Truck extends Vechicle {
    private String weight;
    private int year;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    Truck(String weight, int year, String brand, int numberOfSeats, String licencePlate) {
        super(brand, numberOfSeats, licencePlate);
        this.weight = weight;
        this.year = year;
    }

    public void showInfo() {
        System.out.println("----------" + "\r\n" +
                "Brand: " + getBrand() + "\r\n" + "Weight: " + getWeight() + "\r\n" + "Year of production: " + getYear()
                + "\r\n" + "Number of seats: " + getNumberOfSeats() + "\r\n" + "Licence Plate Number: "
                + getLicencePlate());

    }
}
