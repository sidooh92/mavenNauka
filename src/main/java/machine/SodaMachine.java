package machine;

public class SodaMachine {


    //pierwsza metoda dla testu tdd
    //liczy roznice miedzy balansem a ceną
    private double diff(double price, double balance) {
        if (balance < price)
            return balance;
        else return balance - price;
    }

    //docelowa metoda dla wejsciowego napoju i kwoty -
    // zwraca informacje czy napoj zostal sprzedany
    //oraz ile jest reszty
    public DrinkStatus sell(String types, double balance) {
        Types chosenDrink = Types.valueOf(types.toUpperCase());

        if (balance >= chosenDrink.getPrice()) {
            return new DrinkStatus(chosenDrink,
                    diff(chosenDrink.getPrice(), balance));
        } else {
            return new DrinkStatus(null,
                    diff(chosenDrink.getPrice(), balance));
        }
    }
}