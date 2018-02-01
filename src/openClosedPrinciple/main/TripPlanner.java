package openClosedPrinciple.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripPlanner {

    public List<String> getStepsForTrip(TransportType transportType) {
        List<String> steps = new ArrayList<>();
        switch (transportType) {
            case BUS:
                steps.addAll(Arrays.asList("Get to the bus station"));
                break;
            case CAR:
                steps.addAll(Arrays.asList("Get into the car"));
                break;
            case AIRPLANE:
                steps.addAll(Arrays.asList("Get to the airport"));
                break;
        }
        return steps;
    }
}
