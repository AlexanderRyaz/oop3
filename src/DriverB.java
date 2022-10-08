import transport.Car;

public class DriverB extends Driver<Car>{
    public DriverB(String name) {
        super(name);
    }

    @Override
    public void startDrive() {
        System.out.print("водитель категории Б");
        super.startDrive();
    }

    @Override
    public void stopDrive() {
        System.out.print("водитель категории Б");
        super.stopDrive();
    }

    @Override
    public void refuelCar() {
        System.out.println("водитель категории Б");
        super.refuelCar();
    }
    @Override
    public void setAuto(Car auto){
            super.setAuto(auto);
    }
}
