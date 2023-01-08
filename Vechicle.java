public abstract class Vechicle {
    private String brand;
    private int numberOfSeats;
    private String licencePlate;

    Vechicle(String brand, int numberOfSeats, String licencePlate) {
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;
        this.licencePlate = licencePlate;
    }

    public abstract void showInfo();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

}
