public abstract class Transport {

    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private double maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry) {
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
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (isEmptyString(productionCountry)) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color == null || "".equals(color)) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 10;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public boolean isEmptyString(String s) {
        return s == null || "".equals(s);
    }
    public abstract void refill(Boolean gasoline, Boolean diesel, Boolean electro);



    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}


