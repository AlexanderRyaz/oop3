import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.round;

public class Truck extends Transport implements Competing {
    private LoadType loadType;

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public LoadType getLoadType() {
        return loadType;
    }

    public void setLoadType(LoadType loadType) {
        this.loadType = loadType;
    }

    @Override
    public void startDrive() {
        System.out.println("грузовик начал движение");
    }

    @Override
    public void stopDrive() {
        System.out.println("грузовик закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("грузовик заправлен поменяли задние покрышки");
    }

    @Override
    public String bestTime() {
        int minutes = ThreadLocalRandom.current().nextInt(0, 5);
        int seconds = ThreadLocalRandom.current().nextInt(0, 60);
        return "Минуты: " + minutes + ", секунды: " + seconds;
    }

    @Override
    public double maxSpeed() {
        return round(ThreadLocalRandom.current().nextDouble(120, 190));
    }

    @Override
    public String toString() {
        return super.toString() + ", loadType= " + (loadType == null ? "данных не достаточно" :
                loadType.getLoadType());
    }
}
