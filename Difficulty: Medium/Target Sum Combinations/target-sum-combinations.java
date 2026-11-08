
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        findCombinations(0, arr, target, new ArrayList<>(), result);
        return result;
    }

    private void findCombinations(int index, int[] arr, int target, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (arr[i] > target) {
                break;
            }
            current.add(arr[i]);
            findCombinations(i, arr, target - arr[i], current, result);
            current.remove(current.size() - 1);
        }
    }
}