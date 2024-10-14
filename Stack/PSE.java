package Stack;

import java.util.Stack;

public class PSE {
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,4,8,9,4,2};
        Stack<Integer> sta = new Stack<>();
        int element = 4;
        sta.push(arr[0]);
        for(int i=1;arr[i]!=element;i++)
        {
            if(sta.peek()>arr[i])
            {
                sta.push(arr[i]);
            }
        }
    }
}
