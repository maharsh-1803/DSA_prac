import java.util.Arrays;

public class findTwoNumAppOne {
    public static void main(String[] args) {
        int [] arr = {2,3,4,14,2,3};
        System.out.println(Arrays.toString(findNum(arr)));
    }
    public static int []  findNum(int [] arr)
    {
        int num=0;
        for (int i = 0; i <arr.length ; i++) {
            num = num^arr[i];
        }
        int rightmost = (num&(num-1))^num;
        int b1=0,b2=0;
        for (int i = 0; i <arr.length ; i++) {
            if((arr[i]&rightmost)!=0){
                    b1=b1^arr[i];
            }
            else {
                b2=b2^arr[i];
            }
        }
        return new int [] {b1,b2};
    }
}
