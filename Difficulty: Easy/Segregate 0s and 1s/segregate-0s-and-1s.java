class Solution {
    void segregate0and1(int[] arr) {
      int n= arr.length;
      int numberOfZero= 0;
      for(int i= 0; i< n; i++){
          if(arr[i] == 0){
              numberOfZero+= 1;
          }
      }
      for(int j= 0; j< n; j++){
          if(j< numberOfZero){
              arr[j]= 0;
          }
          else arr[j]= 1;
      }

    }
}