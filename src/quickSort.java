import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int partition(int [] arr,int low, int high)
    {
        int pivot = arr[low];
        int i=low;
        int j=high;
        while(i<j)
        {
            while(arr[i]<=pivot && i<=high-1)
            {
                i++;
            }
            while(arr[j]>pivot && j>=low+1)
            {
                j--;
            }
            if(i<j)
            {
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }

    public static void qs(int [] arr, int low, int high)
    {
        if(low<high)
        {
            int partitionIndex = partition(arr,low,high);
            qs(arr,low,partitionIndex-1);
            qs(arr,partitionIndex+1,high);
        }
    }
    public static void swap(int [] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
