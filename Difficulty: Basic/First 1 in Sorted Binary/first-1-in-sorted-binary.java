class Solution {
    public int firstIndex(int arr[]) {
        // code here
        int idx = -1;
               for(int i=0;i<arr.length ; i++){
                   if(arr[i] == 1){
                       idx = i;
                       break;
                   }
               }
               return idx;
    }
}