import java.util.Arrays;

public class singleNumber_2 {
    public static void main(String[] args) {
        int [] arr = {5,5,5,6,4,4,4};
        System.out.println(singleNum(arr));
        System.out.println(singleNum2(arr));
        System.out.println(singleNum3(arr));
    }
    public static int singleNum(int [] arr)
    {
        int ans=0;
        for(int bitIndex=0;bitIndex<32;bitIndex++)
        {
            int count=0;
            for (int i = 0; i < arr.length; i++) {
                if((arr[i] & (1 << bitIndex)) != 0) {
                    count++;
                }
            }
            if(count%3==1)
            {
                ans = ans | (1<<bitIndex);
            }
        }
        return ans;
    }
    public static int singleNum2(int [] arr)
    {
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i+=3){
            if(arr[i]!=arr[i-1]){
                return arr[i-1];
            }
        }
        return arr[arr.length-1];
    }
    public static int singleNum3(int [] arr)
    {
        int ones=0;
        int twos=0;
        for (int i = 0; i <arr.length ; i++) {
            ones = (ones^arr[i]) & (~twos);
            twos = (twos^arr[i]) & (~ones);
        }
        return ones;
    }
}
