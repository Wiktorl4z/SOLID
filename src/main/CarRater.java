package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CarRater {

   private Map<Car, Integer> carRates;

    public CarRater() {
        carRates = new HashMap<>();
        Car renault = new Car("3", "Megan", "Renault");
        Car fiat = new Car("2", "Multipla", "Fiat");
        Car volks = new Car("1", "Golf III", "Volkswagen");

        carRates.put(renault, 3);
        carRates.put(fiat, 2);
        carRates.put(volks, 1);
    }

    public Optional<Car> getBestCar(List<Car> cars) {
        return cars.stream()
                .max((c1, c2) -> Integer.compare(carRates.get(c1), carRates.get(c2)));
    }
}
