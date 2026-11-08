
class Solution {
    public int countDigits(int n) {
        // Code here

        if(n==0){
            return ++n;
        }
        int count =0;
        while(n!=0){

            count++;
            n=n/10;
        }
        return count;
    }

}