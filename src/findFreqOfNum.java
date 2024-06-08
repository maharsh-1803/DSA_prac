import java.util.HashMap;

public class findFreqOfNum {
    public static void main(String[] args) {
        int [] arr = {4,4,2,4,3,4,4,3,2,4};
        System.out.println(findFreq(arr));
        System.out.println(findnbytwo(arr));
    }
    public static HashMap<Integer, Integer> findFreq(int [] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr)
        {
            int count = map.getOrDefault(num,0);
            map.put(num,count+1);
        }
        return map;
    }
    public static int findnbytwo(int []arr)
    {
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j=i+1;j>0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else {
                    break;
                }
            }
        }
        return arr[arr.length/2];
    }
}
