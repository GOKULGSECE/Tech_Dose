import java.util.*;

public class additionusingbit {
    public static int additionbit(int a, int b) {
        int carry = (a & b) << 1;
        int result = a ^ b;
        if (carry == 0) {
            return result;
        }
        return additionbit(result, carry);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println(additionbit(num1, num2));
        s.close();
    }
}
