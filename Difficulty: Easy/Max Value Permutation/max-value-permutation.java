import java.util.Arrays;

class Solution {
    int maxValue(int arr[]) {
        Arrays.sort(arr);
        long sum = 0;
        long mod = 1000000007;
        for (int i = 0; i < arr.length; i++) {
            sum = (sum + (long) arr[i] * i) % mod;
        }
        return (int) sum;
    }
}