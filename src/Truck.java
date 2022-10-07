public class Truck extends Transport {


    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startDrive() {
        System.out.println("грузовик начал движение");
    }

    @Override
    public void stopDrive() {
        System.out.println("грузовик закончил движение");
    }
}
