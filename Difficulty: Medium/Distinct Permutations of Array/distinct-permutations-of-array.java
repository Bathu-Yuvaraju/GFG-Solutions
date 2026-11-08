import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public static ArrayList<ArrayList<Integer>> uniquePerms(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<ArrayList<Integer>> uniqueSet = new HashSet<>();
        permute(arr, 0, uniqueSet);
        result.addAll(uniqueSet);
        Collections.sort(result, (a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i).compareTo(b.get(i));
                }
            }
            return 0;
        });
        return result;
    }

    private static void permute(int[] arr, int index, HashSet<ArrayList<Integer>> uniqueSet) {
        if (index == arr.length) {
            ArrayList<Integer> current = new ArrayList<>();
            for (int num : arr) {
                current.add(num);
            }
            uniqueSet.add(current);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1, uniqueSet);
            swap(arr, index, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}