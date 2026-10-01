class Solution {
    public static int intersectSize(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }

        HashSet<Integer> intersection = new HashSet<>();

        for (int num : b) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection.size();
    }
}