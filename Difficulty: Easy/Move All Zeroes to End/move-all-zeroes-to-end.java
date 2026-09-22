class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int c=0;
           for(int i=0;i<arr.length;i++){

               if(arr[i] !=0){

                 int temp = arr[i];
                 arr[c]=temp;
                   c++;
               }

           }
           for(int i=c;i<arr.length;i++){
               arr[i]=0;
           }
        
    }
}