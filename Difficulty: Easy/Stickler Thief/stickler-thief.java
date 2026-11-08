class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int a = 0, b = 0, temp;
        for(int num : arr){
            temp = a;
            a = b;
            b = Math.max(num+temp,b);
        }
        return b;
    }
}