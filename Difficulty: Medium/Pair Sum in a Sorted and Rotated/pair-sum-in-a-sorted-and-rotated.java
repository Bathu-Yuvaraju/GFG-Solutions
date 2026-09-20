class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int rem = target-arr[i];
            if(st.contains(rem)){
                return true;
            }
            st.add(arr[i]);
        }
        return false;
    }
}