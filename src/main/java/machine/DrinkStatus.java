package machine;


//klasa zawierajaca enum z rodzajem kupionego napoju oraz reszte z zakupow
public class DrinkStatus {
        private Types boughtDrink;
        private double balanceAfterDrink;

    public DrinkStatus(Types boughtDrink, double balanceAfterDrink) {
        this.boughtDrink = boughtDrink;
        this.balanceAfterDrink = balanceAfterDrink;
    }

    public Types getBoughtDrink() {
        return boughtDrink;
    }

    public void setBoughtDrink(Types boughtDrink) {
        this.boughtDrink = boughtDrink;
    }

    public double getBalanceAfterDrink() {
        return balanceAfterDrink;
    }

    public void setBalanceAfterDrink(double balanceAfterDrink) {
        this.balanceAfterDrink = balanceAfterDrink;
    }
}
