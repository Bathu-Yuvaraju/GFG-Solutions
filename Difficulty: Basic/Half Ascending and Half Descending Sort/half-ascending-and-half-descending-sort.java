import java.util.*;
class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        int n = arr.length;
        int mid = n / 2;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);
        int i = mid;
        int j = n - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (int x : arr) {
            result.add(x);
        }

        return result;
    }
}