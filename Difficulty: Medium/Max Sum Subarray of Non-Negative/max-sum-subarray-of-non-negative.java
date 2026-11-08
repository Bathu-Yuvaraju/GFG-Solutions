class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        ArrayList<Integer> bestSubarray = new ArrayList<>();
        long maxLen = -1;
        long maxSum = -1;

        long currentSum = 0;
        int currentStart = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                currentSum += arr[i];
            } else {
                if (currentSum > 0 || (currentSum == 0 && i > currentStart && arr[currentStart] == 0)) {
                    long currentLen = i - currentStart;
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                        maxLen = currentLen;
                        bestSubarray.clear();
                        for (int k = currentStart; k < i; k++) {
                            bestSubarray.add(arr[k]);
                        }
                    } else if (currentSum == maxSum) {
                        if (currentLen > maxLen) {
                            maxLen = currentLen;
                            bestSubarray.clear();
                            for (int k = currentStart; k < i; k++) {
                                bestSubarray.add(arr[k]);
                            }
                        }
                    }
                }
                currentStart = i + 1;
                currentSum = 0;
            }
        }

        if (currentSum > 0 || (currentSum == 0 && arr.length > currentStart && arr[currentStart] == 0)) {
            long currentLen = arr.length - currentStart;
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxLen = currentLen;
                bestSubarray.clear();
                for (int k = currentStart; k < arr.length; k++) {
                    bestSubarray.add(arr[k]);
                }
            } else if (currentSum == maxSum) {
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                    bestSubarray.clear();
                    for (int k = currentStart; k < arr.length; k++) {
                        bestSubarray.add(arr[k]);
                    }
                }
            }
        }

        if (bestSubarray.isEmpty()) {
            bestSubarray.add(-1);
        }

        return bestSubarray;
    }
}