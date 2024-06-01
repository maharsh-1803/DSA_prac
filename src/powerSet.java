import java.util.ArrayList;
import java.util.List;

public class powerSet {
    public static void main(String[] args) {
        int [] arr= {1,2,3};
        System.out.println(set(arr));
    }
    public static List<List<Integer>> set(int [] arr)
    {
        List<List<Integer>> ans = new ArrayList<>();
        int n= arr.length;
        int subset = 1<<n;
        for (int num=0;num<subset;num++)
        {
            List<Integer> local = new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                if((num&(1<<i))!=0)
                {
                    local.add(arr[i]);
                }
            }

        ans.add(local);
        }
        return ans;

    }
}
