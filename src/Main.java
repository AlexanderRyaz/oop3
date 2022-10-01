import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Grande", 2015, "Россия", "седан", 5);
        car1.setColor("желтый цвет");
        car1.setNomerAuto("в161аа799");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse("29-09-2022", formatter);
        Car.insurance insurance = car1.new insurance(date, 5.500, "123456789");
        insurance.isInsuranceValid();
        test1();
    }

    private static void test1() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Car car1 = new Car("Lada", "Grande", 2015, "Россия", "седан", 5);
        car1.setColor("желтый цвет");
        car1.setNomerAuto("в161аа799");
        car1.changeSeason();
        LocalDate date = LocalDate.parse("20-12-2022", formatter);
        Car.insurance insurance1 = car1.new insurance(date, 5.500, "123456789");
        insurance1.isInsuranceValid();
        insurance1.isNumberValid();
        System.out.println(car1);
        System.out.println();
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "седан", 5);
        car2.setColor("черный");
        car2.setNomerAuto("1161аа799");
        LocalDate date1 = LocalDate.parse("30-05-2023", formatter);
        Car.insurance insurance2 = car2.new insurance(date1, 5.500, "1234569");
        insurance2.isInsuranceValid();
        insurance2.isNumberValid();
        System.out.println(car2);
        System.out.println();
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "купе", 5);
        car3.setColor("черный");
        car3.setNomerAuto("вв61аа799");
        LocalDate date2 = LocalDate.parse("05-12-2022", formatter);
        Car.insurance insurance3 = car3.new insurance(date2, 5.500, "1234569");
        insurance3.isInsuranceValid();
        insurance3.isNumberValid();
        System.out.println(car3);
        System.out.println();
        car3.changeSeason();
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2018, "Южная Корея", "кроссовер", 5);
        car4.setColor("красный");
        car4.setNomerAuto("");
        LocalDate date3 = LocalDate.parse("30-05-2023", formatter);
        Car.insurance insurance4 = car4.new insurance(date3, 5.500, "1234569");
        insurance4.isInsuranceValid();
        insurance4.isNumberValid();
        System.out.println(car4);
        System.out.println();
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "купе", 2);
        car5.setColor("оранжевый");
        car5.setNomerAuto("в161аа79О");
        LocalDate date4 = LocalDate.parse("30-05-2023", formatter);
        Car.insurance insurance5 = car5.new insurance(date4, 5.500, "1234569");
        insurance5.isInsuranceValid();
        insurance5.isNumberValid();
        System.out.println(car5);
        System.out.println();
        Car car6 = new Car("", null, 0, null, "", 1);
        System.out.println(car6);
    }
}