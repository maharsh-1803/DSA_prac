public class findSubArrayWithKsum {
    public static void main(String[] args) {
        int [] arr = {2,3,4,3,1,2,1,1,2,3};
        System.out.println(lenOfLongSubarr(arr,arr.length,5));
    }
    public static int lenOfLongSubarr (int A[], int N, int K) {
        int left=0,right=0;
        int sum=A[0];
        int maxLen=0;
        while(right<N)
        {
            while(left<=right && sum>K)
            {
                sum-=A[left];
                left++;
            }
            if(sum==K)
            {
                maxLen = Integer.max(maxLen,right-left+1);
            }
            right++;
            if(right<N)
            {
                sum+=A[right];

            }

        }
        return maxLen;
    }
}
