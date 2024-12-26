package util.generator;

import data.classes.Bus;
import util.DataError;

import java.util.Map;

import static util.Checker.checkBus;

public class BusGenerator {

    public static Bus generateBus(Map<String, String> entity) throws DataError {
        Bus.BusBuilder busBuilder = new Bus.BusBuilder();

        checkBus(entity);

        busBuilder.licensePlate(entity.get("номер"));
        busBuilder.model(entity.get("модель"));
        busBuilder.mileage(Integer.parseInt(entity.get("пробег")));
        return busBuilder.build();
    }
}
