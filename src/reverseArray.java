import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        revArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void revArray(int [] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

}
