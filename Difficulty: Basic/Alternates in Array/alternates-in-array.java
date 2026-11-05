class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
         ArrayList<Integer> newArray = new ArrayList<Integer>();
          for(int i = 0; i<arr.length;i+=2){
               newArray.add(arr[i]);
          }

          return newArray;
    }
}