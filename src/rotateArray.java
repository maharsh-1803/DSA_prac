import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        rotateArray(arr,arr.length,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateArray(int [] arr,int n,int k)
    {
        k=k%10;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(int [] arr, int first,int last)
    {
        while(first<last)
        {
            int temp = arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
}
