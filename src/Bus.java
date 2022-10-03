public class Bus extends Transport {
private String statusRefill;
    public Bus(String brand, String model, int productionYear, String productionCountry) {
        super(brand, model, productionYear, productionCountry);
        this.statusRefill = "не заправлен";
    }
    @Override
    public void refill(Boolean gasoline, Boolean diesel, Boolean electro) {
        if (gasoline || diesel) {
            this.statusRefill = "заправлен";
        } else {
            this.statusRefill = "не заправлен";
        }
    }

    @Override
    public String toString() {
        return super.toString()+" " + statusRefill;
    }
}
