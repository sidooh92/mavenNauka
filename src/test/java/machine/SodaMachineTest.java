package machine;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@RunWith(JUnitParamsRunner.class)
public class SodaMachineTest {
    private static Logger log =
            LoggerFactory.getLogger(SodaMachineTest.class);

    @Test
    @Parameters({
            "0.01,0.01",
            "3.99,5.00",
            "4.99,5.00",
            "0.99,4.00",
            "99.99,99.99",
    })
    public void shouldSellSodaWhenBalanceIsOk(double priceOfSoda, double balance) throws Exception {
        //given
        SodaMachine sodaMachine = new SodaMachine();
        //when
        double isSold = sodaMachine.sell(priceOfSoda, balance);
        //then
        assertThat(isSold).isLessThanOrEqualTo(balance);
    }

    @Test
    @Parameters({
            "10.00,5.00"
    })
    public void shouldAskForMoneySodaWhenBalanceIsWrong(double priceOfSoda, double balance) throws Exception {
        //given
        SodaMachine sodaMachine = new SodaMachine();
        //when
        double restOfMoney = sodaMachine.sell(priceOfSoda, balance);
        ///then
        assertThat(restOfMoney).isEqualTo(balance);
    }


    @Test
    @Parameters({
            "1.00,5.00,Coke",
            "2.00,5.00,Sprite",
            "3.00,5.00,Beer",
            "2.59,5.00,Water"
    })
    public void shouldReturnSoda(double priceOfSoda,
                                 double balance, String sodaName) throws Exception {
        //given
        SodaMachine sodaMachine = new SodaMachine();
        //when
        String nameOfSoda = sodaMachine.
                payAndGetSoda(priceOfSoda, balance);
        //then
        assertThat(nameOfSoda).isEqualTo(sodaName);
    }


    @Test
    public void shouldSellCokeIfEnoughMoney() {
        //given
        double balance = 5.00;
        String drinkToBuy = "Coke";
        SodaMachine sodaMachine = new SodaMachine();
        //when
        DrinkStatus drinkStatus = sodaMachine
                .sell(drinkToBuy, balance);
        //then
        assertThat(drinkStatus
                .getBalanceAfterDrink()).isEqualTo(4.00);
        assertThat(drinkStatus
                .getBoughtDrink()).isEqualTo(Types.COKE);
    }

}
