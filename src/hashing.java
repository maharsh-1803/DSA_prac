import java.util.Arrays;
import java.util.HashMap;

public class hashing {
    public static void main(String[] args) {
        int [] arr = {1,2,1,2};
        findFreq(arr,1);
        String name="maharsh";
        char target='a';
        findCharFreq(name,target);
        findFreqMap(arr,1);
    }
    public static void findFreq(int [] arr,int target)
    {
        int [] hash = new int [13];
        Arrays.fill(hash,0);
        for (int i = 0; i <arr.length ; i++) {
            hash[arr[i]]++;
        }
        System.out.println(hash[target]);

    }

    public static void findCharFreq(String s,char target)
    {
        int [] hash = new int[256];
        Arrays.fill(hash,0);
        for (int i = 0; i <s.length() ; i++) {
            hash[s.charAt(i)]++;
        }
        System.out.println(hash[target]);
    }
    public static void findFreqMap(int [] arr,int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],i);
        }
        System.out.println(map.get(target));

    }
}
