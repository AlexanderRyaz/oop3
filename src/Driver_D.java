public class Driver_D extends Driver {
    public Driver_D(String name) {
        super(name);
    }

    @Override
    public void startDrive() {
        System.out.println("водитель категории Д начал движение");
    }

    @Override
    public void stopDrive() {
        System.out.println("водитель категории Д начал движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("водитель категории Д запрвил автомобиль");
    }
    @Override
    public void setAuto(Transport auto){
        if (auto instanceof Bus){
            super.setAuto(auto);
        }
    }
}
