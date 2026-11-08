class Solution {
    public int digitsInFactorial(int n) {
        // code here
        if(n<=1){
            return 1;
        }

        double sum=0.0;
        for(int i=2;i<=n;i++){
            sum+=Math.log10(i);
        }
        return (int) sum+1;

    }
}