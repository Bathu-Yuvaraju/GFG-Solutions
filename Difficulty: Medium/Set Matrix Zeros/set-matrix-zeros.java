
class Solution {
    public void setMatrixZeroes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int i = 0; i < rows; i++) {
            if (mat[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        for (int j = 0; j < cols; j++) {
            if (mat[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                mat[i][0] = 0;
            }
        }

        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                mat[0][j] = 0;
            }
        }
    }
}