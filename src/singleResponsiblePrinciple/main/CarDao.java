package singleResponsiblePrinciple.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CarDao {

    List<Car> carDb = Arrays.asList(
            new Car("1", "Golf III", "Volkswagen"),
            new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megan", "Renault"));

    public Optional<Car> findById(String carId) {
        return carDb.stream()
                .filter(c -> c.getId().equals(carId))
                .findFirst();
    }

    public List<Car> findAll() {
        return new ArrayList<>(carDb);
    }

}
