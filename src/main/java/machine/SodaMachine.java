package machine;

public class SodaMachine {


    //pierwsza metoda dla testu tdd
    //liczy roznice miedzy balansem a ceną
    public double sell(double price, double balance) throws Exception {
        if (balance < price)
            return balance;
        else return balance - price;
    }

//w zaleznosci od kwoty zwraca odpowiedni napoj
    public String payAndGetSoda(double priceOfSoda, double balance) {
        if(priceOfSoda == 1.0) return Types.COKE.getValue();
        else if(priceOfSoda == 2.00) return Types.SPRITE.getValue();
        else if(priceOfSoda == 3.00) return Types.BEER.getValue();
        else if(priceOfSoda == 2.59) return Types.WATER.getValue();
        return "";
    }


    //docelowa metoda dla wejsciowego napoju i kwoty -
    // zwraca informacje czy napoj zostal sprzedany
    //oraz ile jest reszty
    public DrinkStatus sell(String types, double balance)
    {


        return null;
    }
}
