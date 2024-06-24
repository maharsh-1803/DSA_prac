import java.util.Arrays;

public class printMaxSumSubArray {
    public static void main(String[] args) {
        int [] arr ={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(kadaneAlgo(arr));
        System.out.println(Arrays.toString(findsubArrayIndex(arr)));
    }
    public static int kadaneAlgo(int []arr)
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

    public static int [] findsubArrayIndex(int []arr)
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int start=-1;
        int startIndex=-1;
        int endIndex=-1;
        for (int i = 0; i <arr.length ; i++) {
            if(sum==0){
                 start=i;
            }
            sum+=arr[i];
            if(sum>max){
                max=sum;
                startIndex=start;
                endIndex=i;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        return new int []{startIndex,endIndex};
    }
}
