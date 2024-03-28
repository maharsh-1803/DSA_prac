import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class findDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        System.out.println(findSame(arr));
        System.out.println(findDup(arr));
    }
    public static ArrayList findSame(int [] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            if(set.contains(arr[i]))
            {
                list.add(arr[i]);
            }
            set.add(arr[i]);
        }
        return list;
    }
    public static ArrayList findDup(int [] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map =  new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {

            if(map.containsKey(arr[i]))
            {
                list.add(arr[i]);
            }
            map.put(arr[i],i);

        }
        return list;
    }
}
