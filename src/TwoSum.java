import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {1,-2,1,0,5};
        int target = 0;
        System.out.println(checkSum(arr,target));
        printPair(arr,target);
    }
    public static String checkSum(int [] arr , int target)
    {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==target) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
    public static void printPair(int [] arr ,int target)
    {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            int temp = target - arr[i];
            if(s.contains(temp))
            {
                System.out.println("YES");
            }
            s.add(arr[i]);
        }
        System.out.println("NO");
    }
}
