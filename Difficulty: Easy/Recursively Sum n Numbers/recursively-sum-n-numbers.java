class Solution {
    public int recursiveSum(int n) {
        // code here
        //Base-case:
        if(n==0){
            return 0;
        }
       int snm1= recursiveSum(n-1);
        int sn=n + snm1;
        return sn;
    }
}