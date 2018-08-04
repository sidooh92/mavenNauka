package prime;

import exceptions.PrimeException;

public class PrimeNumberUtils {


    public boolean isPrime(int number) throws PrimeException {
        if (number <= 1) {
            throw new PrimeException("Error");
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;


    }
}
