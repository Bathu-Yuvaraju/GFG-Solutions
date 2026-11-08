
import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> uniqueRow(int[][] mat) {
        Set<String> seen = new HashSet<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int[] row : mat) {
            StringBuilder sb = new StringBuilder();
            ArrayList<Integer> currentRow = new ArrayList<>();

            for (int val : row) {
                sb.append(val).append(",");
                currentRow.add(val);
            }

            // If the row hasn't been seen yet, add it to our result and set
            if (seen.add(sb.toString())) {
                result.add(currentRow);
            }
        }

        return result;
    }
}