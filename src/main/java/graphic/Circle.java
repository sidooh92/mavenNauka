package graphic;

public class Circle extends GraphicObject{

    public Circle(int x, int y) {
        super(x, y);
    }

    @Override
  public   void resize() {
        this.x += 10;
        this.y += 10;
    }

    @Override
   public void present() {
        System.out.println("I am circle");
    }
}
