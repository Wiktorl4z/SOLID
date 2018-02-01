package singleResponsiblePrinciple.main;

import java.util.*;

public class CarManager {

    private final CarDao carDao;
    private final CarFormater carFormater;
    private final CarRater carRater;

    public CarManager(CarDao carDao, CarFormater carFormater, CarRater carRater) {
        this.carDao = carDao;
        this.carFormater = carFormater;
        this.carRater = carRater;
    }

    public Optional<Car> getById(String carId) {
        return carDao.findById(carId);
    }

    public String getCarName() {
        return carFormater.getCarName(carDao.findAll());
    }

    public Optional<Car> getBestCar() {
        return carRater.getBestCar(carDao.findAll());
    }

}
