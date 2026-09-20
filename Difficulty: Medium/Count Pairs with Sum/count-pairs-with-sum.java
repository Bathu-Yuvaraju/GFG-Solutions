class Solution {
    int countPairs(int arr[], int target) {
        // code here
        HashMap<Integer,Integer> HM=new HashMap<>();
         int count=0;
         for(int i:arr){
             count+=HM.getOrDefault(target-i,0);
             HM.put(i,HM.getOrDefault(i,0)+1);
         }
         return count;
    }
}