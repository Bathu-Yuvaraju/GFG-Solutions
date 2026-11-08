
class Solution {
    public int countSubsets(int[] arr, int l, int r) {
        int n = arr.length;
        int mid = n / 2;

        java.util.List<Integer> leftSums = new java.util.ArrayList<>();
        int leftLen = mid;
        for (int i = 0; i < (1 << leftLen); i++) {
            int sum = 0;
            for (int j = 0; j < leftLen; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += arr[j];
                }
            }
            leftSums.add(sum);
        }

        java.util.List<Integer> rightSums = new java.util.ArrayList<>();
        int rightLen = n - mid;
        for (int i = 0; i < (1 << rightLen); i++) {
            int sum = 0;
            for (int j = 0; j < rightLen; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += arr[mid + j];
                }
            }
            rightSums.add(sum);
        }

        java.util.Collections.sort(rightSums);

        long count = 0;
        for (int s : leftSums) {
            int low = l - s;
            int high = r - s;

            int start = lowerBound(rightSums, low);
            int end = upperBound(rightSums, high);

            count += (end - start);
        }

        return (int) count;
    }

    private int lowerBound(java.util.List<Integer> list, int target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int upperBound(java.util.List<Integer> list, int target) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) > target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}