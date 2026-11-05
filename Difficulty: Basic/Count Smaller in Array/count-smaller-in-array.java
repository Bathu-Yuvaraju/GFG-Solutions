class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        int count = 0;
      for(int num: arr){

          if(num<=x){
              count+=1;
          }
      }
        return count;
    }
}

