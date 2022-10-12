package transport;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Math.round;

public class Car extends Transport implements Competing {


    private String statusRefill;

    private String kpp;
    private Category category;

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean checkNomerAuto(String nomerAuto) {
        char[] chars = nomerAuto.toCharArray();
        if (nomerAuto.length() != 9) {
            return false;
        }
        if (!Character.isAlphabetic(nomerAuto.charAt(0)) || !Character.isAlphabetic(nomerAuto.charAt(4)) || !Character.isAlphabetic(nomerAuto.charAt(5))) {
            return false;
        }
        if (!Character.isDigit(nomerAuto.charAt(1))
                || !Character.isDigit(nomerAuto.charAt(2))
                || !Character.isDigit(nomerAuto.charAt(3))
                || !Character.isDigit(nomerAuto.charAt(6))
                || !Character.isDigit(nomerAuto.charAt(7))
                || !Character.isDigit(nomerAuto.charAt(8))) {
            return false;
        }
        return true;
    }


    @Override
    public void startDrive() {
        System.out.println("легковой автомобиль начал движение");
    }

    @Override
    public void stopDrive() {
        System.out.println("легковой автомобиль закончил движение");
    }

    @Override
    public boolean diagnostic() {
        return ThreadLocalRandom.current().nextInt() % 2 == 0;
    }

    @Override
    public String toString() {
        return "transport.Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume='" + getEngineVolume() + '\'' +
                ", category= " + (category == null ? "данных не достаточно" : category.getCategory()) +
                "} ";
    }

    @Override
    public void pitStop() {
        System.out.println("легковой автомобиль заправлен ипоменяли резину");
    }

    @Override
    public String bestTime() {
        int minutes = ThreadLocalRandom.current().nextInt(0, 5);
        int seconds = ThreadLocalRandom.current().nextInt(0, 60);
        return "Минуты: " + minutes + ", секунды: " + seconds;
    }

    @Override
    public double maxSpeed() {
        return round(ThreadLocalRandom.current().nextDouble(180, 250));
    }

    class Key {
        private final String autoStart;
        private final String keyless;

        public Key(String autoStart, String keyless) {
            if (isEmptyString(autoStart)) {
                this.autoStart = "default";
            } else {
                this.autoStart = autoStart;
            }
            if (isEmptyString(keyless)) {
                this.keyless = "default";
            } else {
                this.keyless = keyless;
            }
        }
    }

    class insurance {
        private final LocalDate validUntil;
        private final double cost;
        private final String number;

        public insurance(LocalDate validUntil, double cost, String number) {
            if (validUntil == null) {
                this.validUntil = LocalDate.now();
            } else {
                this.validUntil = validUntil;
            }

            if (cost <= 0) {
                this.cost = 1;
            } else {
                this.cost = cost;
            }
            if (isEmptyString(number)) {
                this.number = "default";
            } else {
                this.number = number;
            }
        }

        boolean isInsuranceValid() {
            if (this.validUntil.isAfter(LocalDate.now())) {
                return true;
            } else {
                System.out.println("Срочно оформляйте новую страховку!");
                return false;
            }
        }

        boolean isNumberValid() {
            if (this.number.length() == 9) {
                return true;
            } else {
                System.out.println("Номер страховки некорректный!");
                return false;
            }
        }
    }
}


