import transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(Data.checkData("Fedor12", "1487rest", "1487rest")?"данные верны":
                "данные не верны");
        System.out.println(Data.checkData("Petya-", "1487rest", "1487rest")?"данные верны":
                "данные не верны");
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