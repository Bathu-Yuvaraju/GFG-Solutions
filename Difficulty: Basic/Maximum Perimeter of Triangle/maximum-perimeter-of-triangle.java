class Solution {
    public int maxPerimeter(int[] arr) {


       Arrays.sort(arr);


       int n= arr.length-1;

       for(int i=n;i>=2;i--){


           if(arr[i]<arr[i-1]+arr[i-2]){

               return (arr[i-1]+arr[i-2]+arr[i]);
               //i--;
           }

       }

       return -1;




    }
}

