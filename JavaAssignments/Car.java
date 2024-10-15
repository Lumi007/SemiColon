public class Car {
    // Fields (attributes)
    private String model;
    private int year;
    private double price;

    // Constructor
    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void startEngine() {
        System.out.println("The " + model + " engine is starting.");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}