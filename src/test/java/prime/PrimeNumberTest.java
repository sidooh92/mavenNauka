package prime;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;


public class PrimeNumberTest {

    private static Logger log =
            LoggerFactory.getLogger(PrimeNumberTest.class);

    //TODO napisac logike
    //TODO refaktor
    //TODO podpiac junit params
    //TODO refaktor na test z parametrami

    @Test
    void shouldCheckIf1IsPrimeNumber() {
        //given
        int number =1;
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();
        //when
        boolean isPrime = primeNumberUtils.isPrime(number);
        //then
        assertThat(isPrime).isFalse();
    }

    @Test
    void shouldCheckIf2IsPrimeNumber() {
        //given
        int number =2;
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();
        //when
        boolean isPrime = primeNumberUtils.isPrime(number);
        //then
        assertThat(isPrime).isTrue();
    }


    @Test
    void shouldCheckIf3IsPrimeNumber() {
        //given
        int number =3;
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();
        //when
        boolean isPrime = primeNumberUtils.isPrime(number);
        //then
        assertThat(isPrime).isTrue();
    }


    @Test
    void shouldCheckIf4IsPrimeNumber() {
        //given
        int number =4;
        PrimeNumberUtils primeNumberUtils = new PrimeNumberUtils();
        //when
        boolean isPrime = primeNumberUtils.isPrime(number);
        //then
        assertThat(isPrime).isFalse();
    }

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
