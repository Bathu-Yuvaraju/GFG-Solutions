class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while(l<r){
            int m = (l+r)/2;
            if(arr[m]>arr[r]){
                l = m+1;
            }else{
                r = m;
            }
        }
        return l;
    }
}