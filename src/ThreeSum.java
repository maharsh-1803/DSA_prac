import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {0,-1,2,-3,1};
        int target = 0;
        Arrays.sort(arr);
        System.out.println(findSum(arr,target));

    }
    public static boolean findSum(int [] arr, int target)
    {
        for (int i = 0; i < arr.length; i++) {
            int lo = i+1;
            int hi = arr.length-1;
            while(lo<hi)
            {
                int current = arr[i]+arr[lo]+arr[hi];
                if(current==target)
                {
                    return true;
                }
                if(current<target)
                {
                    lo++;
                }
                else{
                    hi--;
                }
            }
        }
        return false;
    }
}
