class Solution {
    public ArrayList<Integer> greaterElement(int[] arr) {
        int n = arr.length;

        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Integer nextGreater = set.higher(arr[i]);

            if (nextGreater == null) {
                result.add(-10000000);
            } else {
                result.add(nextGreater);
            }
        }

        return result;
    }
}