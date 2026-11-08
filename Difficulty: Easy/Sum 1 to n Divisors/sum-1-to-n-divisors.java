class Solution {
    public static long sumOfDivisors(long n) {
       int sum = 0;

       for(int i=1;i<=n;i++){
           sum+=(n/i)*i;
        }
        return sum;

    }
}

