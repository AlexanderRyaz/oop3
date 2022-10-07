public abstract class Driver {
    private final String name;
    private boolean driverLicense;
    private int drivingExperience;
    private Transport auto;

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

    public Transport getAuto() {
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

    public void setAuto(Transport auto) {
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

    public abstract void startDrive();

    public abstract void stopDrive();

    public abstract void refuelCar();
}
