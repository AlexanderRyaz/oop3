import transport.Transport;

public  class Driver<T extends Transport> {
    private final String name;
    private boolean driverLicense;
    private int drivingExperience;
    private T auto;

    public Driver(String name) {
        if (name == null) {
            this.name = "default";
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public T getAuto() {
        return auto;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public void setAuto(T auto) {
        if (driverLicense) {
            this.auto = auto;
        }
    }


    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience > 0 && driverLicense) {
            this.drivingExperience = drivingExperience;
        } else {
            this.drivingExperience = 0;
        }
    }

    public  void startDrive(){
        System.out.println(" начал движение на автомобиле " + auto.getBrand() + " " + auto.getModel());
    }

    public  void stopDrive(){
        System.out.println(" закончил движение");
    }

    public  void refuelCar(){
        System.out.println(" заправил машину");
    }
}
