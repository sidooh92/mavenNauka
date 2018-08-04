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

    //TODO podpiac junit params do pom'a
    //TODO refaktor na test z parametrami


    @Test
    @Parameters({"17, false"})
    public void shouldCheckIf1IsPrimeNumber(int number, boolean valid) {
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();
        //when
        boolean isPrime = primeNumberUtils.isPrime(number);
        //then
        assertThat(isPrime).isEqualTo(valid);
    }


}
