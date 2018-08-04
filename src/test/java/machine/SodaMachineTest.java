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
    //docelowy dzialajacy test w pelni dzialajacej uslugi
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

    //docelowy dzialajacy test w pelni dzialajacej uslugi
    @Test
    public void shouldNotSellCokeIfNotEnoughMoney() {
        //given
        double balance = 0.90;
        String drinkToBuy = "Coke";
        SodaMachine sodaMachine = new SodaMachine();
        //when
        DrinkStatus drinkStatus = sodaMachine
                .sell(drinkToBuy, balance);
        //then
        assertThat(drinkStatus
                .getBalanceAfterDrink()).isEqualTo(0.90);
        assertThat(drinkStatus
                .getBoughtDrink()).isNull();
    }

}
