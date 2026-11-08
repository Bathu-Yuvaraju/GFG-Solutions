import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<Integer> findElements(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        ArrayList<Integer> result = new ArrayList<>();

        // Add all elements except the two largest ones
        for (int i = 0; i < arr.length - 2; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}