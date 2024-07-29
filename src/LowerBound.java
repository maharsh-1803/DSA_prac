public class LowerBound {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        System.out.println(lowerBound(arr,1));
        System.out.println(upperBound(arr,6));
    }
    public static int lowerBound(int []arr,int target){
        int start=0;
        int end = arr.length-1;
        int ans = arr.length;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>=target){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static int upperBound(int []arr,int target){
        int start=0;
        int end = arr.length-1;
        int ans = arr.length;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
