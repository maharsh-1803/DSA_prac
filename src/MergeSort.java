import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void merge(int [] arr , int low, int mid, int high)
    {
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                list.add(arr[left]);
                left++;
            }
            else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left<=mid)
        {
            list.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            list.add(arr[right]);
            right++;
        }

        for (int i = low; i <=high ; i++) {
            arr[i] = list.get(i-low);
        }
    }
    public static void mergeSort(int [] arr,int low, int high)
    {
        if(low>=high) return ;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
}
