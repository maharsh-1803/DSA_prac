import java.util.Arrays;

public class hashing {
    public static void main(String[] args) {
        int [] arr = {1,2,1,1,2};
        findFreq(arr,1);
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
}
