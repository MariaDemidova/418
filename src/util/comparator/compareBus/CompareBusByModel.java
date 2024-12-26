package util.comparator.compareBus;

import data.classes.Bus;

import java.util.Comparator;

public class CompareBusByModel {
    public  Comparator<Bus> BusParam1Comparator = new Comparator<Bus>() {

        public int compare(Bus s1, Bus s2) {
            String busModel1 = s1.getModel().toUpperCase();
            String busModel2 = s2.getModel().toUpperCase();

            return busModel1.compareTo(busModel2);

        }};
}
