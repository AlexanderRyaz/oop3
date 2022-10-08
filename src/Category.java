public enum Category {
    SEDAN("седан"),
    HATCHBACK("хетчбек"),
    COUPE("купе"),
    UNIVERSAL("универсал"),
    SUV("SUV"),
    CROSSOVER("кроссовер"),
    PICKUP("пикап"),
    VAN("автобус"),
    MINIVAN("минивэн");
    private final String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
    public void determineTypeCar(){
        System.out.println("тип авто: " + getCategory());
    }
}
