class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        int n = arr.length;
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i] == i+1){
                result.add(arr[i]);
            }
        }
        return result;

    }
}