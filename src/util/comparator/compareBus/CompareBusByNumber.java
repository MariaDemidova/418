package util.comparator.compareBus;

import data.classes.Bus;

import java.util.Comparator;

public class CompareBusByNumber {
    public  Comparator<Bus> BusParam1Comparator = new Comparator<Bus>() {

        public int compare(Bus s1, Bus s2) {
            String busLicensePlate1 = s1.getLicensePlate().toUpperCase();
            String busLicensePlate2 = s2.getLicensePlate().toUpperCase();

            return busLicensePlate1.compareTo(busLicensePlate2);

        }};
}
