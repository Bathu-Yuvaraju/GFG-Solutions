class Solution {
    public int moves(int n, int p, int q) {
        int minMoves = -1;
        int maxSteps = Math.max(n / p, n / q);

        for (int i = maxSteps; i >= 0; i--) {
            int remaining = n - (i * p);
            if (remaining >= 0 && remaining % q == 0) {
                int totalMoves = i + (remaining / q);
                if (minMoves == -1 || totalMoves < minMoves) {
                    minMoves = totalMoves;
                }
            }
        }

        for (int j = maxSteps; j >= 0; j--) {
            int remaining = n - (j * q);
            if (remaining >= 0 && remaining % p == 0) {
                int totalMoves = j + (remaining / p);
                if (minMoves == -1 || totalMoves < minMoves) {
                    minMoves = totalMoves;
                }
            }
        }

        return minMoves;
    }
}