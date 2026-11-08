class Solution {
    public int minStep(int h, int u, int d) {
        if (u >= h) {
            return 1;
        }
        if (u <= d) {
            return -1;
        }
        int effectiveClimb = u - d;
        int remainingHeight = h - u;
        int steps = (remainingHeight + effectiveClimb - 1) / effectiveClimb;
        return steps + 1;
    }
}