import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(findsum(arr,7)));
        System.out.println(Arrays.toString(TwoSumTwoPointer(arr,7)));
    }

    public static int [] findsum(int [] arr , int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int a = arr[i];
            int rem = target-a;
            if(map.containsKey(rem))
            {
                return new int [] {map.get(rem),i};
            }
            map.put(a,i);
        }
        return new int [] {-1,-1};
    }

    public static int [] TwoSumTwoPointer(int [] arr,int target)
    {
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int sum = arr[left]+arr[right];
            if(sum==target)
            {
                return new int [] {left,right};
            }
            else if(sum<target)
            {
                left++;
            }
            else {
                right--;
            }
        }
        return new int [] {-1,-1};
    }
}
