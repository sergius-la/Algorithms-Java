package math.prime_number;

public class PrimeNumber {

    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = num; i <= num; i++) {
            if (num / i == 0) return false;
        }
        return true;
    }
}
