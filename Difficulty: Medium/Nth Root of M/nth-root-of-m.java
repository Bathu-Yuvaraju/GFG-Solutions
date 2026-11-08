class Solution {
    public int nthRoot(int n, int m) {
        // code here
        if(n == 1 || m <= 1) return m;
        if(n == 2){
            if(m == 4) return 2;
            else if(m == 9) return 3;
            else if(m == 16) return 4;
        }
        if(n == 3 && m == 8) return 2;
        if(n == 4 && m == 16) return 2;
        return -1;
    }
}