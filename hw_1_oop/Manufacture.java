package hw_1_oop;

public class Manufacture {
    private String fabric;
    private final String placeOfManufacture;

    public Manufacture(String fabric, String placeOfManufacture) {
        this.fabric = fabric;
        this.placeOfManufacture = placeOfManufacture;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getPlaceOfManufacture() {
        return placeOfManufacture;
    }

}



