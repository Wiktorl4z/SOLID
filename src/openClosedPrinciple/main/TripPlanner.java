package openClosedPrinciple.main;

import java.util.List;

public class TripPlanner {

    public List<String> getStepsForTrip(TripPlannerStrategy tripPlannerStrategy) {
        return tripPlannerStrategy.getTripSteps();
    }
}
