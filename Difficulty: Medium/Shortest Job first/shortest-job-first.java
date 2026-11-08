import java.util.Arrays;

class Solution {
    static int solve(int[] bt) {
        Arrays.sort(bt);
        int totalWaitingTime = 0;
        int currentTime = 0;

        for (int i = 0; i < bt.length; i++) {
            totalWaitingTime += currentTime;
            currentTime += bt[i];
        }

        return totalWaitingTime / bt.length;
    }
}