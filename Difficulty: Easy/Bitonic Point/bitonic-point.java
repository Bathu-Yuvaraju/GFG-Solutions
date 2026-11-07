
class Solution {
    public int findMaximum(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(i==0&&arr[i]>arr[i+1] || arr[i]>arr[i+1]&&arr[i-1]<arr[i]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}