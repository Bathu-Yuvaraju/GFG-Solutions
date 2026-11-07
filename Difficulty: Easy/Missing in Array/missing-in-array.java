class Solution {
    int missingNum(int arr[]) {

        int n = arr.length + 1;

        long actualSum = (long)n * (n + 1) / 2;

        long currSum = 0;

        for(int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
        }

        return (int)(actualSum - currSum);
    }
}