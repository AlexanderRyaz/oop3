public class Train {
    private double ticketPrice;
    private double travelTime;
    private String startStation;
    private String endStation;
    private int wagonCount;
    private String statusRefill;

    public Train(String brand, String model, int productionYear, String productionCountry) {
//        super(brand, model, productionYear, productionCountry);
        this.statusRefill = "не заправлен";
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        if (ticketPrice <= 0) {
            this.ticketPrice = 100;
        } else {
            this.ticketPrice = ticketPrice;
        }
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        if (travelTime <= 0) {
            this.travelTime = 60;
        } else {
            this.travelTime = travelTime;
        }
    }

    public String getStartStation() {
        return startStation;
    }

//    public void setStartStation(String startStation) {
//        if (isEmptyString(startStation)) {
//            startStation = "default";
//        } else
//            this.startStation = startStation;
//    }
//
//
//    public String getEndStation() {
//        return endStation;
//    }
//
//    public void setEndStation(String endStation) {
//        if (isEmptyString(endStation)) {
//            this.endStation = "default";
//        } else {
//            this.endStation = endStation;
//        }
//    }

    public int getWagonCount() {
        return wagonCount;
    }

    public void setWagonCount(int wagonCount) {
        if (wagonCount <= 0) {
            this.wagonCount = 8;
        } else {
            this.wagonCount = wagonCount;
        }
    }
////    @Override
////    public void refill(Boolean gasoline, Boolean diesel, Boolean electro) {
////        if (diesel) {
////            this.statusRefill = "заправлен";
////        } else {
////            this.statusRefill = "не заправлен";
////        }
//    }

    @Override
    public String toString() {
        return "Train{" +
//                "brand='" + getBrand() + '\'' +
//                ", model='" + getModel() + '\'' +
//                ", productionYear=" + getProductionYear() +
//                ", productionCountry='" + getProductionCountry() + '\'' +
//                ", maxSpeed=" + getMaxSpeed() + " " +
                "ticketPrice=" + ticketPrice +
                ", travelTime=" + travelTime +
                ", startStation='" + startStation + '\'' +
                ", endStation='" + endStation + '\'' +
                ", wagonCount=" + wagonCount +
                "} " + statusRefill;
    }
}
