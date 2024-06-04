public class XorInRange {
    public static void main(String[] args) {
        System.out.println(findXor(4));
        System.out.println(fincXorInRange(4,7));
    }
    public static int findXor(int n)
    {
        if(n%4==1) return 1;
        else if(n%4==2) return n+1;
        else if(n%4==3) return  0;
        else return n;
    }
    public static int fincXorInRange(int l,int r)
    {
        int ans = findXor(l-1)^findXor(r);
        return ans;
    }
}
