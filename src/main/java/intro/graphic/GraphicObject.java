package intro.graphic;

public abstract class GraphicObject {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public GraphicObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

   public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

   public abstract void resize();
   public abstract void present();

}
