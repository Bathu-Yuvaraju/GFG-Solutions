import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int activitySelection(int[] start, int[] finish) {
        int n = start.length;
        int[][] activities = new int[n][2];

        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }

        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        int count = 1;
        int lastFinish = activities[0][1];

        for (int i = 1; i < n; i++) {
            if (activities[i][0] > lastFinish) {
                count++;
                lastFinish = activities[i][1];
            }
        }

        return count;
    }
}