package prime;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;


public class PrimeNumberTest {

    private static Logger log =
            LoggerFactory.getLogger(PrimeNumberTest.class);

    @Test
    void shouldCheckIf5IsPrimeNumber() {
        //given
        int number =5;
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();

        //when
        boolean isPrime = primeNumberUtils.isPrime(number);

        //then
        assertThat(isPrime).isTrue();
    }

}
