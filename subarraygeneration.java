import java.util.*;
public class subarraygeneration {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<1<<arr.length;i++)
        {
            List<Integer> ans = new ArrayList<>();
            for(int j=0;j<arr.length;j++)
            {
                if((i & (1<<j))>0)
                {
                    ans.add(arr[j]);
                }
            }
            res.add(ans);
        }
        for(List<Integer> c:res)
        {
            System.out.println(c);
        }
    }
}
