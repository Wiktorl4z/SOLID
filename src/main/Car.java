package main;

import java.util.Objects;

public class Car {

    private final String Id;
    private final String model;
    private final String brand;

    public Car(String id, String model, String brand) {
        Id = id;
        this.model = model;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(Id, car.Id) &&
                Objects.equals(model, car.model) &&
                Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Id, model, brand);
    }

    public String getId() {
        return Id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
