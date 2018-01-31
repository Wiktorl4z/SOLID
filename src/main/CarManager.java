package main;

import java.util.*;

public class CarManager {

    List<Car> carDb = Arrays.asList(
            new Car("1", "Golf III", "Volkswagen"),
            new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megan", "Renault"));

    public Optional<Car> getFromDb(String carId) {
        return carDb.stream()
                .filter(c -> c.getId().equals(carId))
                .findFirst();
    }

    public String getCarName() {
        return carDb.stream()
                .map(c -> c.getBrand() + "" + c.getModel())
                .reduce((prev, next) -> prev + "," + next)
        .orElse("Sorry. No car");
    }

    public Optional<Car> getBestCar(){
        Map<Car, Integer> carRates =  new HashMap<>();
        Car renault =  new Car("3", "Megan", "Renault");
        Car fiat =  new Car("2", "Multipla", "Fiat");
        Car volks = new Car("1", "Golf III", "Volkswagen");

        carRates.put(renault,3);
        carRates.put(fiat,2);
        carRates.put(volks,1);

        return carDb.stream()
                .max((c1,c2)-> Integer.compare(carRates.get(c1),carRates.get(c2)));
    }

}
