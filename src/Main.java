import transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Bus bus1 = new Bus("Икарус", "И-1000", 4.0);
        bus1.setCapacityType(CapacityType.AVERAGE);
        Bus bus2 = new Bus("Лиаз", "Л-10", 3.0);
        bus2.setCapacityType(CapacityType.SMALL);
        Bus bus3 = new Bus("Паз", "П-30", 2.5);
        bus3.setCapacityType(CapacityType.BIG);
        Bus bus4 = new Bus("Лиаз", "Л-10", 2.7);
        Car car1 = new Car("Lada", "Grande", 1.6);
        car1.setCategory(Category.SEDAN);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 5.0);
        car2.setCategory(Category.SEDAN);
        Car car3 = new Car("BMW", "Z8", 3.0);
        car3.setCategory(Category.COUPE);
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2.0);
        Truck truck1 = new Truck("Камаз", "Т-500", 6.0);
        Truck truck2 = new Truck("Зил", "З-125", 4.0);
        truck2.setLoadType(LoadType.N2);
        Truck truck3 = new Truck("Краз", "К-3000", 9.0);
        truck3.setLoadType(LoadType.N3);
        Truck truck4 = new Truck("Белаз", "Б-5000", 7.0);
        Driver<Bus> driver_d = new DriverD("Николай Петров");
        driver_d.setDriverLicense(true);
        driver_d.setAuto(bus1);
        driver_d.setDrivingExperience(10);
        Driver<Truck> driver_c = new DriverC("Василий Иванов");
        driver_c.setDriverLicense(true);
        driver_c.setAuto(truck2);
        driver_c.setDrivingExperience(15);
        DriverB driver_b = new DriverB("Александр Рязанов");
        driver_b.setDriverLicense(true);
        driver_b.setAuto(car1);
        driver_b.setDrivingExperience(20);
        Driver<Bus> driver_d2 = new DriverD("Константин Сергеев");
       try {
           driver_d2.setDriverLicense(false);
       } catch (RuntimeException e){
           System.out.println(e.getMessage());
       }
        driver_d2.setAuto(bus1);
        driver_d2.setDrivingExperience(1);
        List<Driver> driverList = new ArrayList<>();
        driverList.add(driver_b);
        driverList.add(driver_c);
        driverList.add(driver_d);
        driverList.add(driver_d2);
        diagnostic(bus1, bus2, bus3 ,bus4, car1,car2,car3,car4,truck1,truck2,truck3,truck4);
    }
    private static void diagnostic(Transport ... transports){
        for (Transport transport : transports) {
            try {
                if (transport.diagnostic()){
                    System.out.println(transport.toString() + " прошел диагностику");
                }else {
                    System.out.println(transport.toString() + " не прошел диагностику");
                }
            }
            catch (RuntimeException e){
                System.out.println(transport + " не прошел диагностику. причина: " + e.getMessage());
            }
        }
    }


    private static void printRaceInfo(List<Driver> driverList) {
        for (Driver driver : driverList) {
            if (driver.getAuto() != null) {
                System.out.println("водитель " + driver.getName() + " управляет автомобилем " + driver.getAuto() + "" +
                        " и будет участвовать в заезде");
            } else {
                System.out.println("водитель " + driver.getName() +
                        " не будет участвовать в заезде");
            }
        }
    }

}