package Stack;
import java.util.*;

public class PGE {
    public static void main(String[] args) {
        int arr[] = {1,4,3,6,2,7,5,9,8};
        int element = 3;
        Stack<Integer> sta = new Stack<>();
        sta.push(-1);
        for(int i=0;arr[i]!=element;i++)
        {
            if(sta.peek()<arr[i])
            {
                sta.push(arr[i]);
            }
        }
        int ans = (sta.peek()>element)?sta.peek():-1;
        System.out.println(ans);
    }
}
