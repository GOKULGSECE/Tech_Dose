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
            int sm = (left / prime) * prime;
            if (sm < left) {
                sm += prime;
            }
            if (sm == prime) {
                sm += prime;
            }
            for (int m = sm; m <= right; m += prime) {
                segSieve[m - left] = false;
            }
        }
        List<Integer> resultPrimes = new ArrayList<>();
        for (int i = 0; i < segSieve.length; i++) {
            if (segSieve[i]) {
                resultPrimes.add(i + left);
            }
        }
        for (int prime : resultPrimes) {
            System.out.println(prime);
        }
    }
}
