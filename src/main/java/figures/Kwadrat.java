package figures;

public class Kwadrat implements ObliczPole {
    private Punkt[] punkty;

    public Kwadrat(int[] wspolrzedne) {
        if (wspolrzedne.length > 8) {
            System.out.println("Błąd");
        } else {
            punkty = new Punkt[4];
            for (int i = 0; i < 4; i++) {
                punkty[i] = new Punkt(wspolrzedne[i * 2],
                        wspolrzedne[i * 2 + 1]);
            }
        }
        System.out.println(punkty[0] + " " + punkty[1]
                + " " + punkty[2] + " " + punkty[3]);
    }

    @Override
    public int obliczPoole() {
        int x1 = punkty[0].x;
        int y1 = punkty[0].y;
        int x2 = punkty[1].x;
        int y2 = punkty[1].y;
        double distance = Math.hypot(x1-x2, y1-y2);
        return (int) (distance*distance);
    }

    private class Punkt {
        private int x;
        private int y;

        public Punkt(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Punkt{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

}
