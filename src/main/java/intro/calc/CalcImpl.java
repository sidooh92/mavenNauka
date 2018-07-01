package intro.calc;


public class CalcImpl implements Calc, NewCalc{
    @Override
    public int dodaj(int a, int b) {
        return 0;
    }

    public int odejmij(int a, int b) {
        return a-b;
    }

    public int mnoz(int a, int b) {
        return a*b;
    }


    @Override
    public int multiplyByItSelf(int a) {
        return a*a;
    }
}
