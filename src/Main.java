public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Lada");
        car1.setModel("Grande");
        car1.setProductionYear(2015);
        car1.setProductionCountry("Россия");
        car1.setColor("Желтый цвет");
        car1.setEngineVolume(1.7);
        System.out.println(car1);
        Car car2 = new Car();
        car2.setBrand("Audi ");
        car2.setModel("A8 50 L TDI quattro");
        car2.setProductionYear(2020);
        car2.setProductionCountry("Германия");
        car2.setColor("черный");
        car2.setEngineVolume(3.0);
        System.out.println(car2);
        Car car3 = new Car();
        car3.setBrand("BMW");
        car3.setModel("Z8");
        car3.setProductionCountry("Германия");
        car3.setProductionYear(2021);
        car3.setColor("черный");
        car3.setEngineVolume(3.0);
        System.out.println(car3);
        Car car4 = new Car();
        car4.setBrand("Kia");
        car4.setModel("Sportage 4 поколение");
        car4.setProductionYear(2018);
        car4.setProductionCountry("Южная Корея");
        car4.setColor("красный");
        car4.setEngineVolume(2.4);
        System.out.println(car4);
        Car car5 = new Car();
        car5.setBrand("Hyundai");
        car5.setModel("Avante");
        car5.setProductionCountry("Южная Корея");
        car5.setColor("оранжевый");
        car5.setEngineVolume(1.6);
        car5.setProductionYear(2016);
        System.out.println(car5);

    }
}