public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada","Grande", 1.7, "желтый цвет",2015, "Россия");
        System.out.println(car1);
        Car car2 = new Car("Audi","A8 50 L TDI quattro", 3.0, "черный",2020, "Германия");
        System.out.println(car2);
        Car car3 = new Car("BMW","Z8",3.0,"черный",2021,"Германия");
        System.out.println(car3);
        Car car4 = new Car("Kia","Sportage 4 поколение",2.4,"красный",2018,"Южная Корея");
        System.out.println(car4);
        Car car5 = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея");
        System.out.println(car5);
        Car car6 = new Car("",null,0,null,0,"");
        System.out.println(car6);

    }
}