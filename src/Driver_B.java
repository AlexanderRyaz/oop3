public class Driver_B extends Driver{
    public Driver_B(String name) {
        super(name);
    }

    @Override
    public void startDrive() {
        System.out.println("водитель категории Б начал движение");
    }

    @Override
    public void stopDrive() {
        System.out.println("водитель категории Б закончил движение");
    }

    @Override
    public void refuelCar() {
        System.out.println("водитель категории Б запрвил автомобиль");
    }
    @Override
    public void setAuto(Transport auto){
        if (auto instanceof Car){
            super.setAuto(auto);
        }
    }
}
