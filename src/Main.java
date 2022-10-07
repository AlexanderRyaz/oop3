import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Икарус", "И-1000", 4.0);
        System.out.println(bus1);
        bus1.startDrive();
        bus1.pitStop();
        bus1.stopDrive();
        System.out.println(bus1.bestTime());
        System.out.println(bus1.maxSpeed());
        Bus bus2 = new Bus("Лиаз", "Л-10", 3.0);
        System.out.println(bus2);
        bus2.startDrive();
        bus2.pitStop();
        bus2.stopDrive();
        System.out.println(bus2.bestTime());
        System.out.println(bus2.maxSpeed());
        Bus bus3 = new Bus("Паз", "П-30", 2.5);
        System.out.println(bus3);
        bus3.startDrive();
        bus3.pitStop();
        bus3.stopDrive();
        System.out.println(bus3.bestTime());
        System.out.println(bus3.maxSpeed());
        Bus bus4 = new Bus("Лиаз", "Л-10", 2.7);
        System.out.println(bus4);
        bus4.startDrive();
        bus4.pitStop();
        bus4.stopDrive();
        System.out.println(bus4.bestTime());
        System.out.println(bus4.maxSpeed());
        Car car1 = new Car("Lada", "Grande", 1.6);
        System.out.println(car1);
        car1.startDrive();
        car1.pitStop();
        car1.stopDrive();
        System.out.println(car1.bestTime());
        System.out.println(car1.maxSpeed());
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 5.0);
        System.out.println(car2);
        car2.startDrive();
        car2.pitStop();
        car2.stopDrive();
        System.out.println(car2.bestTime());
        System.out.println(car2.maxSpeed());
        Car car3 = new Car("BMW", "Z8", 3.0);
        System.out.println(car3);
        car3.startDrive();
        car3.pitStop();
        car3.stopDrive();
        System.out.println(car3.bestTime());
        System.out.println(car3.maxSpeed());
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2.0);
        System.out.println(car4);
        car1.startDrive();
        car1.pitStop();
        car1.stopDrive();
        System.out.println(car4.bestTime());
        System.out.println(car4.maxSpeed());
        Truck truck1 = new Truck("Камаз", "Т-500", 6.0);
        System.out.println(truck1);
        truck1.startDrive();
        truck1.pitStop();
        truck1.stopDrive();
        System.out.println(truck1.bestTime());
        System.out.println(truck1.maxSpeed());
        Truck truck2 = new Truck("Зил", "З-125", 4.0);
        System.out.println(truck2);
        truck2.startDrive();
        truck2.pitStop();
        truck2.stopDrive();
        System.out.println(truck2.bestTime());
        System.out.println(truck2.maxSpeed());
        Truck truck3 = new Truck("Краз", "К-3000", 9.0);
        System.out.println(truck3);
        truck3.startDrive();
        truck3.pitStop();
        truck3.stopDrive();
        System.out.println(truck3.bestTime());
        System.out.println(truck3.maxSpeed());
        Truck truck4 = new Truck("Белаз", "Б-5000", 7.0);
        System.out.println(truck4);
        truck4.startDrive();
        truck4.pitStop();
        truck4.stopDrive();
        System.out.println(truck4.bestTime());
        System.out.println(truck4.maxSpeed());
        Driver driver_d =new Driver_D("Николай Петров");
        driver_d.setDriverLicense(true);
        driver_d.setAuto(bus1);
        driver_d.setDrivingExperience(10);
        Driver driver_c =new Driver_C("Василий Иванов");
        driver_c.setDriverLicense(true);
        driver_c.setAuto(truck2);
        driver_c.setDrivingExperience(15);
        Driver driver_b=new Driver_B("Александр Рязанов");
        driver_b.setDriverLicense(true);
        driver_b.setAuto(car1);
        driver_b.setDrivingExperience(20);
        Driver driver_d1 =new Driver_D("Сергей Сидоров");
        driver_d1.setDriverLicense(true);
        driver_d1.setAuto(car2);
        driver_d1.setDrivingExperience(8);
        Driver driver_d2 =new Driver_D("Константин Сергеев");
        driver_d2.setDriverLicense(false);
        driver_d2.setAuto(bus1);
        driver_d2.setDrivingExperience(1);
        List<Driver>driverList=new ArrayList<>();
        driverList.add(driver_b);
        driverList.add(driver_c);
        driverList.add(driver_d);
        driverList.add(driver_d1);
        driverList.add(driver_d2);
        printRaceInfo(driverList);
    }

    private static void printRaceInfo(List<Driver> driverList) {
        for (Driver driver : driverList) {
            if (driver.getAuto() != null) {
                System.out.println("водитель " + driver.getName() + " управляет автомобилем " + driver.getAuto() + "" +
                        " и будет участвовать в заезде");
            }else {
                System.out.println("водитель " + driver.getName() +
                        " не будет участвовать в заезде");
            }
        }
    }

}