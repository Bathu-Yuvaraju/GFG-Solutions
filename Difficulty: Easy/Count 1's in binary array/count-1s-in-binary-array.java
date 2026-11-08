
class Solution {
    public int countOnes(int[] arr) {
        // code here
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1) cnt++;
        }
        return cnt;
    }
}