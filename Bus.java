public class Bus extends Vechicle {
    private String engine;
    private String color;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Bus(String engine, String color, String brand, int numberOfSeats, String licencePlate) {
        super(brand, numberOfSeats, licencePlate);
        this.color = color;
        this.engine = engine;
    }

    @Override
    public void showInfo() {
        System.out.println("----------" + "\r\n"
                + "Brand: " + getBrand() + "\r\n" + "Color: " + getColor() + "\r\n" + "Engine: " + getEngine()
                + "\r\n" + "Number of seats: " + getNumberOfSeats() + "\r\n" + "Licence Plate Number: "
                + getLicencePlate());

    }

}
