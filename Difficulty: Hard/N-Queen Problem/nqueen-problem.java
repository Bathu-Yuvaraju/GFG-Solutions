
import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(1, n, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int row, int n, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (row > n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int col = 1; col <= n; col++) {
            if (isValid(current, row, col)) {
                current.add(col);
                backtrack(row + 1, n, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isValid(ArrayList<Integer> current, int row, int col) {
        for (int i = 0; i < current.size(); i++) {
            int placedRow = i + 1;
            int placedCol = current.get(i);

            if (placedCol == col || Math.abs(placedRow - row) == Math.abs(placedCol - col)) {
                return false;
            }
        }
        return true;
    }
}