import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String kpp;
    private final String tipKuzova;
    private String nomerAuto;
    private final int mesta;
    private boolean isWinter;

    public Car(String brand, String model, int productionYear, String productionCountry, String tipKuzova, int mesta) {
        if (brand == null || "".equals(brand)) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || "".equals(model)) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || "".equals(productionCountry)) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (mesta == 2 || mesta == 5 || mesta == 7) {
            this.mesta = mesta;
        } else {
            this.mesta = 2;
        }
        if (tipKuzova == null || "".equals(tipKuzova)) {
            this.tipKuzova = "default";
        } else {
            this.tipKuzova = tipKuzova;
        }
        this.nomerAuto = "х000хх000";
        this.color = "белый";
        this.engineVolume = 2.0;
        this.kpp = "мкпп";
    }


    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || "".equals(color)) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }


    public String getProductionCountry() {
        return productionCountry;
    }

    public String getKpp() {
        return kpp;
    }

    public String getTipKuzova() {
        return tipKuzova;
    }

    public String getNomerAuto() {
        return nomerAuto;
    }

    public int getMesta() {
        return mesta;
    }

    public boolean isWinter() {
        return isWinter;
    }

    public void setKpp(String kpp) {
        if (kpp == null || "".equals(kpp)) {
            this.kpp = "default";
        } else {
            this.kpp = kpp;
        }
    }

    public void setNomerAuto(String nomerAuto) {
        if (nomerAuto == null || "".equals(nomerAuto) || !checkNomerAuto(nomerAuto)) {
            this.nomerAuto = "х000хх000";
        } else {
            this.nomerAuto = nomerAuto;
        }

    }

    public void setWinter(boolean winter) {
        isWinter = winter;
    }

    public void changeSeason() {
        this.isWinter = !this.isWinter;
    }

    public boolean checkNomerAuto(String nomerAuto) {
        char[] chars = nomerAuto.toCharArray();
        if (nomerAuto.length() != 9) {
            return false;
        }
        if (!Character.isAlphabetic(nomerAuto.charAt(0)) || !Character.isAlphabetic(nomerAuto.charAt(4)) || !Character.isAlphabetic(nomerAuto.charAt(5))) {
            return false;
        }
        if (!Character.isDigit(nomerAuto.charAt(1))
                || !Character.isDigit(nomerAuto.charAt(2))
                || !Character.isDigit(nomerAuto.charAt(3))
                || !Character.isDigit(nomerAuto.charAt(6))
                || !Character.isDigit(nomerAuto.charAt(7))
                || !Character.isDigit(nomerAuto.charAt(8))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", kpp='" + kpp + '\'' +
                ", tipKuzova='" + tipKuzova + '\'' +
                ", nomerAuto='" + nomerAuto + '\'' +
                ", mesta=" + mesta +
                ", isWinter=" + isWinter +
                '}';
    }

    class Key {
        private final String autoStart;
        private final String keyless;

        public Key(String autoStart, String keyless) {
            if (autoStart == null || "".equals(autoStart)) {
                this.autoStart = "default";
            } else {
                this.autoStart = autoStart;
            }
            if (keyless == null || "".equals(keyless)) {
                this.keyless = "default";
            } else {
                this.keyless = keyless;
            }
        }
    }

    class insurance {
        private final LocalDate validUntil;
        private final double cost;
        private final String number;

        public insurance(LocalDate validUntil, double cost, String number) {
            if (validUntil == null) {
                this.validUntil = LocalDate.now();
            } else {
                this.validUntil = validUntil;
            }

            if (cost <= 0) {
                this.cost = 1;
            } else {
                this.cost = cost;
            }
            if (number == null || "".equals(number)) {
                this.number = "default";
            } else {
                this.number = number;
            }
        }

        boolean isInsuranceValid() {
            if (this.validUntil.isAfter(LocalDate.now())) {
                return true;
            } else {
                System.out.println("Срочно оформляйте новую страховку!");
                return false;
            }
        }

        boolean isNumberValid() {
            if (this.number.length() == 9) {
                return true;
            } else {
                System.out.println("Номер страховки некорректный!");
                return false;
            }
        }
    }
}


