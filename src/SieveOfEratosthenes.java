import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {
    public static List<Integer> findPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primeNumbers.add(i);
            }
        }
        List<Integer> prime;
        return primeNumbers;
        }
    }