class Solution {
    public int findExtra(int a[], int b[]) {
        // code here
        for(int i=0;i<a.length && i<b.length;i++){
            if(a[i] !=b[i])return i;
        }
        return a.length>b.length?b.length:a.length;
    }
}