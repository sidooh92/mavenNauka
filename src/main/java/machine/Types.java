package machine;

//enum zawierajacy rodzaje napojow dla maszyny
public enum Types {
    COKE("Coke", 1.00),
    BEER("Beer", 2.00),
    SPRITE("Sprite", 2.00),
    WATER("Water", 2.59);

    private final String value;
    private final double price;


    private Types(String value, double price) {
        this.value = value;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getValue() {
        return value;
    }
}