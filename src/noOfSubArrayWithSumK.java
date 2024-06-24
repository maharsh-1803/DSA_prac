import java.util.HashMap;

public class noOfSubArrayWithSumK {
    public static void main(String[] args) {
        int [] arr = {1,1,1};
        System.out.println(noOfSubArray(arr,2));
        System.out.println(noOfSubArrayHashMap(arr,2));
    }
    public static int noOfSubArray(int []arr,int k){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            int sum=0;
            for (int j = i; j <arr.length ; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
    public static int noOfSubArrayHashMap(int [] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int preSum=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            int remove = preSum - k;
            if (map.containsKey(remove)) {
                count += map.get(remove);
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
