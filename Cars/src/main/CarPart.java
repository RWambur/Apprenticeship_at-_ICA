package main;

public class CarPart {
    private String name;
    private String manufacturer;
    public void setName(String name) {
        this.name = name;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    String getManufacturer() { return manufacturer; }
    String getName() { return name; }
}
