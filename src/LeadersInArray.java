import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int [] arr = {4,7,1,0};
        System.out.println(bruteForce(arr));
        System.out.println(optimalSolution(arr));
    }
    public static ArrayList<Integer> bruteForce(int []arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            boolean leader = true;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]<arr[j]) {
                    leader = false;
                    break;
                }
            }
            if(leader) {
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static  ArrayList<Integer> optimalSolution (int []arr){
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length-1; i >=0 ; i--) {
            if(arr[i]>max){
                max=arr[i];
                list.add(arr[i]);
            }
        }
        return list;
    }
}
