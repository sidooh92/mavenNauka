package figures;

public class Kolo implements ObliczPole {

    private int r;
    private Point point;

    public Kolo(int r, int x, int y) {
        this.point = new Point(x, y);
        this.r = r;
    }

    @Override
    public int obliczPoole() {
        return (int) (Math.PI * r * r);
    }

    private class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
