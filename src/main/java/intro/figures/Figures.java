package intro.figures;

public enum Figures {
    KOLO(1),
    KWADRAT(2),
    TROJKAT(3);

    private final int value;

    private Figures(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
