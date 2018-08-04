package machine;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class SodaMachineTest {
    private static Logger log =
            LoggerFactory.getLogger(SodaMachineTest.class);


    //docelowy dzialajacy test w pelni dzialajacej uslugi przypadki jak jest wystarczajaco pieniedzy
    @Test
    @Parameters({"5.90,Coke,4.90",
            "1.00,Coke,1.00",
            "5.90,Beer,3.90",
            "5.99,Water,3.40",
            "5.10,Sprite,3.10"})
    public void shouldSellCokeIfEnoughMoney(double balance, String drinkToBuy, double change) {
        //given
        SodaMachine sodaMachine = new SodaMachine();

        //when
        DrinkStatus drinkStatus = sodaMachine
                .sell(drinkToBuy, balance);
        //then
        assertThat(drinkStatus
                .getBalanceAfterDrink()).isEqualTo(change);
        assertThat(drinkStatus
                .getBoughtDrink().getValue()).isEqualTo(drinkToBuy);
    }

    //docelowy dzialajacy test w pelni dzialajacej uslugi przypadki jak brakuje pieniedzy
    @Test
    @Parameters({"0.90,Coke",
            "0.00,Coke",
            "1.90,Beer",
            "0.99,Water",
            "1.10,Sprite"})
    public void shouldNotSellCokeIfNotEnoughMoney(double balance, String drinkToBuy) {
        //given
        SodaMachine sodaMachine = new SodaMachine();

        //when
        DrinkStatus drinkStatus = sodaMachine
                .sell(drinkToBuy, balance);
        //then
        assertThat(drinkStatus
                .getBalanceAfterDrink()).isEqualTo(balance);
        assertThat(drinkStatus
                .getBoughtDrink()).isNull();
    }

}
