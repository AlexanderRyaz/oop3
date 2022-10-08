import transport.Truck;

public class DriverC extends Driver<Truck> {
    public DriverC(String name) {
        super(name);
    }

    @Override
    public void startDrive() {
        System.out.print("водитель категории Ц");
        super.startDrive();
    }

    @Override
    public void stopDrive() {
        System.out.print("водитель категории Ц");
        super.stopDrive();
    }

    @Override
    public void refuelCar() {
        System.out.print("водитель категории Ц");
        super.refuelCar();
    }

    @Override
    public void setAuto(Truck auto) {
        super.setAuto(auto);
    }
}
