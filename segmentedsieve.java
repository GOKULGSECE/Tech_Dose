import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class segmentedsieve {
    public static List<Integer> sieve(int r) {
        int[] primes = new int[r + 1];
        List<Integer> res = new ArrayList<>();
        Arrays.fill(primes, 1);

        for (int i = 2; i * i <= r; i++) {
            if (primes[i] == 1) {
                for (int p = i * i; p <= r; p += i) {
                    primes[p] = 0;
                }
            }
        }

        for (int i = 2; i <= r; i++) {
            if (primes[i] == 1) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int left = 40;
        int right = 800; 
        List<Integer> smallPrimes = sieve((int) Math.ceil(Math.sqrt(right)));
        boolean[] segSieve = new boolean[right - left + 1];
        Arrays.fill(segSieve, true);
        for (int prime : smallPrimes) {
            int start = Math.max(prime * prime, (left + prime - 1) / prime * prime);
            if (start < left) {
                start = (left + prime - 1) / prime * prime;
            }
            for (int j = start; j <= right; j += prime) {
                segSieve[j - left] = false;
            }
        }
        List<Integer> resultPrimes = new ArrayList<>();
        for (int i = 0; i < segSieve.length; i++) {
            if (segSieve[i] && (i + left) >= 2) {
                resultPrimes.add(i + left);
            }
        }
        for (int prime : resultPrimes) {
            System.out.println(prime);
        }
    }
}
