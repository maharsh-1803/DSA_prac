public class DivsionWithoutOperator {
    public static void main(String[] args) {
        System.out.println(divide(21,3));
    }
    public static int divide(int dividend,int divisor)
    {
        boolean sign;
        if(dividend==divisor)
        {
            return 1;
        }
        if(dividend>=0 && divisor<0) sign=false;
        if(dividend<0 && divisor>0) sign=false;
        long n = Math.abs(dividend);
        long d = Math.abs(divisor);
        long ans=0;
        while(n>=d){
            int count=0;
            while(n>=(d<<(count++)))
            {
                count++;
            }
            ans+=1<<count;
            n-=(d<<count);
        }
        if(ans==(1<<31) && sign){
            return Integer.MAX_VALUE;
        }
        else if(ans==(1<<31) && !sign)
        {
            return Integer.MIN_VALUE;
        }
        return sign ? ans : -ans;
    }
}
