package prime;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class PrimeNumberTest {

    private static Logger log =
            LoggerFactory.getLogger(PrimeNumberTest.class);
    @Test
    @Parameters({"1, false",
            "2, true",
            "3, true",
            "4, false",
            "5, true",
            "6, false" })
    public void shouldCheckIf1IsPrimeNumber(int number, boolean valid) {
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();
        //when
        boolean isPrime = primeNumberUtils.isPrime(number);
        //then
        assertThat(isPrime).isEqualTo(valid);
    }


    @Test
    public void shouldThrowExpectionIfNumberIsLessThanTwo() {

    }


}
