package test;


import main.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarManagerTest {

    private CarManager carManager;

    @Before
    public void setUp() throws Exception {

        CarDao carDao = new CarDao();
        CarFormater carFormater = new CarFormater();
        CarRater carRater = new CarRater();
        carManager = new CarManager(carDao,carFormater,carRater);
    }

    @Test
    public void shouldGetVolsagen() throws Exception {
        Car car = carManager.getById("1").get();
        assertEquals("Golf III", car.getModel());
        assertEquals("Volkswagen", car.getBrand());
    }

    @Test
    public void shouldGetCarString() throws Exception {
        String car = carManager.getCarName();
        assertEquals("VolkswagenGolf III,FiatMultipla,RenaultMegan", car.toString());
    }

    @Test
    public void renaultShouldBeBestCar() throws Exception {
        Car car = carManager.getBestCar().get();
        assertEquals("Renault", car.getBrand());
    }
}