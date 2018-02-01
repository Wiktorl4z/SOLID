package singleResponsiblePrinciple.main;

import java.util.List;

public class CarFormater {

    public String getCarName(List<Car> cars) {
        return cars.stream()
                .map(c -> c.getBrand() + "" + c.getModel())
                .reduce((prev, next) -> prev + "," + next)
                .orElse("Sorry. No car");
    }
}
