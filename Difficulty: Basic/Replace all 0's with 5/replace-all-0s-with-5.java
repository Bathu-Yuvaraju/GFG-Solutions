class Solution {
    public int convertFive(int n) {
        int rev=0;
        int original;
        if(n==0) return 5;

        while(n>0)
        {
           int digit=n%10;
           if(digit==0 ) digit=5; 
           rev=rev*10+digit;
           n=n/10;
        }
        int ans = 0;
        while(rev>0)
        {
            int d=rev%10;
            ans=ans*10+d;
            rev=rev/10;
        }

        return ans;

    }
}