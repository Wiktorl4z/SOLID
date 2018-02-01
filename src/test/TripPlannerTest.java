package test;

import openClosedPrinciple.main.TransportType;
import openClosedPrinciple.main.TripPlanner;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TripPlannerTest {

    TripPlanner tripPlanner;

    @Before
    public void setUp() throws Exception {
        tripPlanner = new TripPlanner();
    }

    @Test
    public void checkBus() throws Exception{
        assertEquals(Arrays.asList("Get to the bus station"),tripPlanner.getStepsForTrip(TransportType.BUS));
    }
}