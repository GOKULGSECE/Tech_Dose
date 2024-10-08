import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = n&(n-1);
        if(result>0)
        {
            System.out.println("This is not a power of 2");
        }
        else{
            System.out.println("This is a power of 2");
        }
        s.close();
    }
}
