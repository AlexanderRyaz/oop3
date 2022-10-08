import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.round;

public class Bus extends Transport implements Competing {
private CapacityType capacityType;
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(CapacityType capacityType) {
        this.capacityType = capacityType;
    }

    @Override
    public void startDrive() {
        System.out.println("автобус начал движение");
    }

    @Override
    public void stopDrive() {
        System.out.println("автобус закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("автобус заправлен поменяли передние покрышки");
    }

    @Override
    public String bestTime() {
        int minutes = ThreadLocalRandom.current().nextInt(0, 5);
        int seconds = ThreadLocalRandom.current().nextInt(0, 60);
        return "Минуты: " + minutes + ", секунды: " + seconds;
    }

    @Override
    public double maxSpeed() {
        return round(ThreadLocalRandom.current().nextDouble(110, 180));
    }
    @Override
    public String toString(){
       return super.toString() +  ", capacityType= " + (capacityType == null ? "данных не достаточно" :
               capacityType.getCapacityType());
    }
}
