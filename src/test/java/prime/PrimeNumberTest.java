package prime;


import exceptions.PrimeException;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@RunWith(JUnitParamsRunner.class)
public class PrimeNumberTest {

    private static Logger log =
            LoggerFactory.getLogger(PrimeNumberTest.class);
    @Test
    @Parameters({
            "2, true",
            "3, true",
            "4, false",
            "5, true",
            "6, false" })
    public void shouldCheckIf1IsPrimeNumber(int number, boolean valid) throws PrimeException {
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();
        //when
        boolean isPrime = primeNumberUtils.isPrime(number);
        //then
        assertThat(isPrime).isEqualTo(valid);
    }


    @Test
    public void shouldThrowExpectionIfNumberIsLessThanTwo() throws PrimeException {
        //given
        int number = -10;
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();

        //when
        assertThatThrownBy(() -> primeNumberUtils.isPrime(number))
                .isInstanceOf(PrimeException.class)
                .hasMessage("Error");
    }


}
