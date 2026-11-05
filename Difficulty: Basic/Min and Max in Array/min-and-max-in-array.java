class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       for(int num : arr){
           max = Math.max(max, num);
           min = Math.min(min, num);
       }
       return new ArrayList<>(Arrays.asList(min, max));

    }
}  