public class Car extends Vechicle {
    private String model;
    private String power;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    Car(String model, String power, String brand, int numberOfSeats, String licencePlate) {
        super(brand, numberOfSeats, licencePlate);
        this.power = power;
        this.model = model;
    }

    @Override
    public void showInfo() {
        System.out.println("----------" + "\r\n" + "Brand: " + getBrand() + "\r\n" + "Model: " + getModel() + "\r\n"
                + "Power: " + getPower()
                + "\r\n" + "Number of seats: " + getNumberOfSeats() + "\r\n" + "Licence Plate Number: "
                + getLicencePlate());

    }

}
