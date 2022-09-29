public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada","Grande", 2015, "Россия", "седан",5);
        car1.setColor("желтый цвет");
        car1.setNomerAuto("в161аа799");
        car1.changeSeason();
        System.out.println(car1);
        System.out.println();
        Car car2 = new Car("Audi","A8 50 L TDI quattro" ,2020, "Германия", "седан",5);
        car2.setColor("черный");
        car2.setNomerAuto("1161аа799");
        System.out.println(car2);
        System.out.println();
        Car car3 = new Car("BMW","Z8",2021,"Германия", "купе",5);
        car3.setColor("черный");
        car3.setNomerAuto("вв61аа799");
        System.out.println(car3);
        System.out.println();
        car3.changeSeason();
        Car car4 = new Car("Kia","Sportage 4 поколение",2018,"Южная Корея", "кроссовер",5);
        car4.setColor("красный");
        car4.setNomerAuto("");
        System.out.println(car4);
        System.out.println();
        Car car5 = new Car("Hyundai","Avante",2016,"Южная Корея", "купе",2);
        car5.setColor("оранжевый");
        car5.setNomerAuto("в161аа79О");
        System.out.println(car5);
        System.out.println();
        Car car6 = new Car("",null,0,null, "",1);
        System.out.println(car6);

    }
}