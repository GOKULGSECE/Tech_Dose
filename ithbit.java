public class ithbit {
    public static void main(String[] args) {
        int n = 10;
        int i = 4;
        int result = n&(1<<i);
        if(result >0)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
}
