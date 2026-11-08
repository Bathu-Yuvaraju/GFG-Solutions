class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        long sumN = (long) n * (n + 1) / 2;
        long sumSqN = (long) n * (n + 1) * (2L * n + 1) / 6;

        long sumArr = 0;
        long sumSqArr = 0;

        for (int i = 0; i < n; i++) {
            sumArr += arr[i];
            sumSqArr += (long) arr[i] * arr[i];
        }

        long diff = sumArr - sumN;
        long sqDiff = sumSqArr - sumSqN;

        long sumAdd = sqDiff / diff;

        int repeating = (int) ((diff + sumAdd) / 2);
        int missing = (int) (sumAdd - repeating);

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);

        return result;
    }
}