public class Bus extends Transport {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startDrive() {
        System.out.println("автобус начал движение");
    }

    @Override
    public void stopDrive() {
        System.out.println("автобус закончил движение");
    }
//    @Override
//    public void refill(Boolean gasoline, Boolean diesel, Boolean electro) {
//        if (gasoline || diesel) {
//            this.statusRefill = "заправлен";
//        } else {
//            this.statusRefill = "не заправлен";
//        }
//    }

}
