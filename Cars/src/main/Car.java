package main;

import java.util.List;

public class Car {
    private String givenName;
    private String manufacturer;
    private String model;
    private int price = 1;
    private List<CarPart> partList;

    public static Car Create(String givenName, String manufacturer, String model, int price, List<CarPart> partList) {
        Car createCar = new Car(); // Objektinstanz
        createCar.setGivenName(givenName);
        createCar.setManufacturer(manufacturer);
        createCar.setModel(model);
        createCar.setPrice(price);
        createCar.setPartList(partList); //
        return createCar; //Objekt Instanz von Car (createdCar)
    }

    public void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0!");
        }
        this.price = price;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public List<CarPart> getPartList() {
        return partList;
    }

    public void setPartList(List<CarPart> partList) {
        this.partList = partList;
    }
}
