package machine;


//enum zawierajacy rodzaje napojow dla maszyny
public enum Types {
    COKE("Coke"),
    BEER("Beer"),
    SPRITE("Sprite"),
    WATER("Water");

    private final String value;

    private Types(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}