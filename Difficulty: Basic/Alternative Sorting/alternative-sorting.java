class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        ArrayList<Integer> ans = new ArrayList<>();

        while (left < right) {
            ans.add(arr[right]);
            ans.add(arr[left]);
            right--;
            left++;
        }

        // If there's a middle element left in an odd-sized array
        if (left == right) {
            ans.add(arr[right]);
        }

        return ans;
    }
}
