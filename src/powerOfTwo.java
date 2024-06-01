public class powerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8192));
    }
    public static boolean isPowerOfTwo(int n)
    {
        if((n&(n-1))==0)
        {
            return true;
        }
        return false;
    }
}
