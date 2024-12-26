package util.comparator.compareBus;

import data.classes.Bus;

import java.util.Comparator;

public class CompareBusByMileage {
    public  Comparator<Bus> BusParam1Comparator = (s1, s2) -> {
        int mileage1 = s1.getMileage();
        int mileage2 = s2.getMileage();

        // Sorting in ascending order
        return mileage1-mileage2;

    };
}
