package classes;

public class Bus implements Comparable<Bus> {
    private final String licensePlate;
    private final String model;
    private final int mileage;

    private Bus(BusBuilder busBuilder) {
        licensePlate = busBuilder.licensePlate;
        model = busBuilder.model;
        mileage = busBuilder.mileage;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }
    @Override
    public int compareTo(Bus o) {
        int result=this.licensePlate.compareTo(o.licensePlate);
        return result;
    }

    @Override
    public String toString(){
        return (licensePlate+", "+model+", "+ mileage+" km");
    }

    @Override
    public int compareTo(Bus busToCompare) {

        if (!this.licensePlate.equalsIgnoreCase(busToCompare.licensePlate))
            return this.licensePlate.compareTo(busToCompare.licensePlate);

        if (this.mileage != busToCompare.mileage) {
            return Integer.compare(this.mileage, busToCompare.mileage);
        }
        return this.model.compareTo(busToCompare.model);
    }

    @Override
    public String toString() {
        return "Автобус{" +
                "номер='" + licensePlate + '\'' +
                ", модель='" + model + '\'' +
                ", пробег=" + mileage +
                '}';
    }

    public static class BusBuilder {
        private String licensePlate;
        private String model;
        private int mileage;

        public BusBuilder licensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }

        public BusBuilder model(String model) {
            this.model = model;
            return this;
        }

        public BusBuilder mileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Bus build() {
            return new Bus(this);
        }
    }
}
