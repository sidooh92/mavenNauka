package intro.calc;

public interface Calc {
    int dodaj(int a, int b);

    public default double dziel(double a, double b) {
        return a/b;
    }
    int odejmij(int a, int b);
    int mnoz(int a, int b);
}
