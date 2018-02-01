package test;

import openClosedPrinciple.main.AirplaneTripPlannerStrategyImpl;
import openClosedPrinciple.main.TripPlanner;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TripPlannerTest {

    TripPlanner tripPlanner;
    AirplaneTripPlannerStrategyImpl airplaneTripPlannerStrategy;

    @Before
    public void setUp() throws Exception {
        tripPlanner = new TripPlanner();
    }

    @Test
    public void checkBus() throws Exception {
        airplaneTripPlannerStrategy = new AirplaneTripPlannerStrategyImpl();
        assertEquals(Arrays.asList("Get to the airport"), tripPlanner.getStepsForTrip(airplaneTripPlannerStrategy));
    }
}