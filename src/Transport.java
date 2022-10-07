public abstract class Transport {

    private final String brand;
    private final String model;

    private final double engineVolume;


    public Transport(String brand, String model, double engineVolume) {
        if (isEmptyString(brand)) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (isEmptyString(model)) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume < 0) {
            this.engineVolume = 2.0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }



    public boolean isEmptyString(String s) {
        return s == null || "".equals(s);
    }

    public abstract void startDrive();

    public abstract void stopDrive();


    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}


