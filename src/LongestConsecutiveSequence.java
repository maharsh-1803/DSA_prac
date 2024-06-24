import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] arr ={100,100,200,1,1,3,2,4};
        System.out.println(bruteForce(arr));
        System.out.println(betterApproach(arr));
        System.out.println(optimalApproach(arr));
    }
    public static boolean linearSearch(int []arr ,int x){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
    public static int bruteForce(int [] arr){
        int longest =1;
        for (int i = 0; i <arr.length ; i++) {
            int x=arr[i];
            int cnt=1;
            while(linearSearch(arr,x+1)){
                x+=1;
                cnt+=1;
            }
            longest = Math.max(longest,cnt);
        }
        return longest;
    }
    public static int betterApproach(int []arr){
        if(arr.length==0)return 0;
        Arrays.sort(arr);
        int lastSamller = Integer.MIN_VALUE;
        int count=0;
        int longest=1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]-1==lastSamller){
                count+=1;
                lastSamller=arr[i];
            } else if (arr[i]-1!=lastSamller) {
                count=1;
                lastSamller=arr[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
    public static int optimalApproach(int []arr){
        if(arr.length==0)return 0;
        int longest=1;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            set.add(arr[i]);
        }
        for (int it:set) {
            if(!set.contains(it-1)){
                int count=1;
                int x = it;
                while(set.contains(x+1)){
                    x+=1;
                    count+=1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
