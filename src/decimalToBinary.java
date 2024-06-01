public class decimalToBinary {
    public static void main(String[] args) {
        System.out.println(DTB(10));
        System.out.println(BTD("111"));
    }
    public static StringBuffer DTB(int n)
    {
        String res = "";
        while(n>0)
        {
            if(n%2==1)
            {
                res+='1';
            }
            else {
                res+='0';
            }
            n/=2;
        }
        StringBuffer ans = new StringBuffer(res);
        ans.reverse();
        return ans;
    }
    public static int BTD(String binary)
    {
        int len = binary.length();
        int p2=1;
        int num=0;
        for(int i=len-1;i>=0;i--)
        {
            if(binary.charAt(i)=='1')
            {
                num=num+p2;
            }
            p2*=2;
        }
        return num;
    }
}
