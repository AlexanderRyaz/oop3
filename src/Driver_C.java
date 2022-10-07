public class Driver_C extends Driver{
    public Driver_C(String name) {
        super(name);
    }

    @Override
    public void startDrive() {
        System.out.println("водитель категории Ц начал движение");
    }

    @Override
    public void stopDrive() {
        System.out.println("водитель категории Ц начал движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("водитель категории Ц запрвил автомобиль");
    }
    @Override
    public void setAuto(Transport auto){
        if (auto instanceof Truck){
            super.setAuto(auto);
        }
    }
}
