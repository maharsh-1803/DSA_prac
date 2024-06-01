public class coutNoOfSetBit {
    public static void main(String[] args) {
        System.out.println("no of set in given no:"+noOfOne(14));
        System.out.println("no of set in given no:"+countNoOfOneUsingAndOperator(14));
    }

    public static int noOfOne(int n)
    {
        int count=0;
        while(n>0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }

    public static int countNoOfOneUsingAndOperator(int n)
    {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
