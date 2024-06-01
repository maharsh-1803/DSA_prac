public class NoOfBitFlip {
    public static void main(String[] args) {
        System.out.println(noOfBitFlip(10,7));
    }
    public static int noOfBitFlip(int start,int goal)
    {
        int count=0;
        int ans = start ^ goal;
        for (int i = 0; i <31 ; i++) {
            if((ans&(1<<i))!=0)
            {
                count++;
            }
        }
        return count;
    }
}
