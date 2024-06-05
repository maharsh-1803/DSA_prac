import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findUnion {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {3,4,5,6,7};
        List<Integer> merge = union(arr1,arr2, arr1.length,arr2.length);
        for (int it:merge)
        {
            System.out.print(it+" ");
        }
    }
    public static List<Integer> union(int [] arr1,int [] arr2,int n, int m)
    {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i <m ; i++) {
            set.add(arr2[i]);
        }
        for(int it:set){
            list.add(it);
        }
        return list;
    }
}
