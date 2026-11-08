
class Solution {
    public int numberCount(int n, int k) {
        // code here
        int l=1,u=n;

        while(l<=u)
        {
            int m=l+(u-l)/2;

            if(m-sumOfDigits(m)>=k)
                u=m-1;
            else
                l=m+1;

        }

        return n-l+1;

    }

    public int sumOfDigits(int n)
    {
        int d,z,sum;
        d=sum=0;
        z=n;
        while(z!=0)
        {
            d=z%10;
            sum=sum+d;
            z=z/10;
        }
        return sum;
    }
}

