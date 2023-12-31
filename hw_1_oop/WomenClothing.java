package hw_1_oop;

public class WomenClothing {
    private String brand;
    private final Manufacture manufacture;

    public WomenClothing(String brand, Manufacture manufacture) {
        this.brand = brand;
        this.manufacture = manufacture;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

}
