public class singleNumber {
    public static void main(String[] args) {
        int [] arr = {4,1,4,1,2};
        System.out.println(singleNum(arr));
    }
    public static int singleNum(int [] arr)
    {
        int ans=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            ans = ans^arr[i];
        }
        return ans;
    }

}
