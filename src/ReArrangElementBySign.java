import java.util.Arrays;

public class ReArrangElementBySign {
    public static void main(String[] args) {
        int [] arr = {-1,1};
//        reArrange(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reArrangeOptimal(arr)));

    }
    public static void reArrange(int [] arr) {
        int n = arr.length;
        int flag = 1;

        for (int i = 0; i < n - 1; i++) {
            if (flag == 1 && arr[i] < 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] >= 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            } else if (flag == 0 && arr[i] >= 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
            flag = 1 - flag;
        }
    }

    public static int [] reArrangeOptimal(int [] arr){
        int [] ans = new int [arr.length];
        int pos=0;
        int neg=1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] >= 0) {
                ans[pos] = arr[i];
                pos += 2;
            } else {
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        return ans;
    }
}
