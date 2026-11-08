class Solution {
    public int findStepKeyIndex(int[] arr, int k, int x) {
        int i;
        for(i = 0; i < arr.length; i++) { 
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}