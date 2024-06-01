public class CheckBitSet {
    public static void main(String[] args) {
        System.out.println(setBit(5,0));
    }
    public static boolean setBit(int n,int bit)
    {
        if((n&(1<<bit))!=0)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
