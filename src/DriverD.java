public class DriverD extends Driver<Bus> {
    public DriverD(String name) {
        super(name);
    }

    @Override
    public void startDrive() {
        System.out.println("водитель категории Д");
        super.startDrive();
    }

    @Override
    public void stopDrive() {
        System.out.println("водитель категории Д");
        super.stopDrive();
    }

    @Override
    public void refuelCar() {
        System.out.println("водитель категории Д");
        super.refuelCar();
    }

    @Override
    public void setAuto(Bus auto) {
        super.setAuto(auto);
    }
}
