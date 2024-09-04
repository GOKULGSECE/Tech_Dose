import java.util.ArrayList;
import java.util.List;

public class segmentedsieve {
    public static List<Integer> sieve(int r)
    {
        int[] primes = new int[r+1];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= r; i++)
        {
            primes[i] = 1;
        }
        for(int i=2;i*i<=r;i++)
        {
            if(primes[i]==1)
            {
                for(int p=i*i;p<=r;p+=i)
                {
                    primes[p] = 0;
                }
            }
        }
        for(int i=2;i<r;i++)
        {
            if(primes[i]==1)
            {
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int left = 40;
        int right = 800;
        List<Integer>primes = sieve((int)Math.ceil(Math.sqrt(right)));
        for(int i:primes){
            System.out.println(i);
        }
    }
}
