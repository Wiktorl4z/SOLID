package openClosedPrinciple.main;

import java.util.Arrays;
import java.util.List;

public class BusPlannerStrategyImpl implements TripPlannerStrategy {
    @Override
    public List<String> getTripSteps() {
        return Arrays.asList("Get to the bus station");
    }
}
