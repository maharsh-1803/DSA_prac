public class printMaxSumSubArray {
    public static void main(String[] args) {
        int [] arr ={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(findSum(arr));
    }
    public static int findSum(int []arr)
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            max=Integer.max(max,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return max;
    }
}
