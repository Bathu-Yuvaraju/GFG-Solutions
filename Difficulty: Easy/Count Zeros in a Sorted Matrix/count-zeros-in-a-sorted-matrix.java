class Solution {
    public int countZeros(int[][] mat) {
        int n = mat.length;
        int count = 0;
        int row = 0;
        int col = n - 1; 

        while (row < n && col >= 0) {
            if (mat[row][col] == 0) {
                
                count += (col + 1);
                row++;
            } else {
                
                col--;
            }
        }

        return count;
    }
}