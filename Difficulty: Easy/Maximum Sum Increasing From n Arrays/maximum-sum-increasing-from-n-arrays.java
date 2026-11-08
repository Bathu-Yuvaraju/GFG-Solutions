class Solution {
    public int maximumSum(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            Integer[] row = new Integer[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                row[j] = arr[i][j];
            }
            java.util.Arrays.sort(row, java.util.Collections.reverseOrder());
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = row[j];
            }
        }

        int totalSum = 0;
        int prevChosen = Integer.MAX_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            boolean found = false;
            int maxValid = -1;

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < prevChosen) {
                    maxValid = arr[i][j];
                    found = true;
                    break;
                }
            }

            if (!found) {
                return 0;
            }

            totalSum += maxValid;
            prevChosen = maxValid;
        }

        return totalSum;
    }
}