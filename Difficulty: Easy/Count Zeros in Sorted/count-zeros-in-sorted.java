
class Solution {
    int countZeroes(int[] arr) {
        // code here
        int zeroCount = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                zeroCount++;
            }
        }
        return zeroCount;
    }
}