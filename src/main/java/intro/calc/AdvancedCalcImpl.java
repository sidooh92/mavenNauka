package intro.calc;

public class AdvancedCalcImpl implements Calc {

    @Override
    public int dodaj(int a, int b) {
        return Math.addExact(a, b);
    }

    @Override
    public double dziel(double a, double b) {
        return a/b;
    }

    @Override
    public int odejmij(int a, int b) {
        return Math.subtractExact(a, b);
    }

    @Override
    public int mnoz(int a, int b) {
        return Math.multiplyExact(a, b);
    }
}
