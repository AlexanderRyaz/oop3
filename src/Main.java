public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Икарус", "И-1000", 4.0);
        System.out.println(bus1);
        bus1.startDrive();
        bus1.stopDrive();
        Bus bus2 = new Bus("Лиаз", "Л-10", 3.0);
        System.out.println(bus2);
        bus2.startDrive();
        bus2.stopDrive();
        Bus bus3 = new Bus("Паз", "П-30", 2.5);
        System.out.println(bus3);
        bus3.startDrive();
        bus3.stopDrive();
        Bus bus4 = new Bus("Лиаз", "Л-10", 2.7);
        System.out.println(bus4);
        bus4.startDrive();
        bus4.stopDrive();
        Car car1 = new Car("Lada", "Grande", 1.6);
        System.out.println(car1);
        car1.startDrive();
        car1.stopDrive();
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 5.0);
        System.out.println(car2);
        car2.startDrive();
        car2.stopDrive();
        Car car3 = new Car("BMW", "Z8", 3.0);
        System.out.println(car3);
        car3.startDrive();
        car3.stopDrive();
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2.0);
        System.out.println(car4);
        car4.startDrive();
        car4.stopDrive();
        Truck truck1 = new Truck("Камаз", "Т-500", 6.0);
        System.out.println(truck1);
        truck1.startDrive();
        truck1.stopDrive();
        Truck truck2 = new Truck("Зил", "З-125", 4.0);
        System.out.println(truck2);
        truck2.startDrive();
        truck2.stopDrive();
        Truck truck3 = new Truck("Краз", "К-3000", 9.0);
        System.out.println(truck3);
        truck3.startDrive();
        truck3.stopDrive();
        Truck truck4 = new Truck("Белаз", "Б-5000", 7.0);
        System.out.println(truck4);
        truck4.startDrive();
        truck4.stopDrive();
    }

}