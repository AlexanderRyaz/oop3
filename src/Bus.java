import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.round;

public class Bus extends Transport implements Competing {

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
}
