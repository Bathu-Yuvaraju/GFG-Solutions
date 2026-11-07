
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first = arr[0];
        int second = -1;

        for(int i : arr){
            if(i > second){
                if(i > first){
                    second = first;
                    first = i;
                }
                else{
                    if(i != first) second = i;
                }
            }

        }

        return second;

    }
}