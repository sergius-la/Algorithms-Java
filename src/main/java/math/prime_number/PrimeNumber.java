package math.prime_number;

/**
 * A prime number is a whole number greater than 1 whose only factors are 1 and itself.
 * A factor is a whole numbers that can be divided evenly into another number.
* */
public class PrimeNumber {

    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
