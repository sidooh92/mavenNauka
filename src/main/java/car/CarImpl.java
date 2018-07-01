package car;

public class CarImpl implements Car {
private String company;

    public CarImpl(String company) {
        this.company = company;
    }

    public void present() {
        System.out.println("Hi, I am car");
    }

    public Car getFiat() {
        return new CarImpl("FIAT");
    }
}
