import java.util.Arrays;

class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int n = arr.length;
        int platformsNeeded = 0, maxPlatforms = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platformsNeeded++;
                i++;
            } else {
                platformsNeeded--;
                j++;
            }
            if (platformsNeeded > maxPlatforms) {
                maxPlatforms = platformsNeeded;
            }
        }

        return maxPlatforms;
    }
}