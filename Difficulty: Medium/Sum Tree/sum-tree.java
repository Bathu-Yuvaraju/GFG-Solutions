class Solution {
    public boolean isSumTree(Node node) {
        return checkSumTree(node).isSum;
    }

    private TreeInfo checkSumTree(Node node) {
        if (node == null) {
            return new TreeInfo(true, 0);
        }

        if (node.left == null && node.right == null) {
            return new TreeInfo(true, node.data);
        }

        TreeInfo leftInfo = checkSumTree(node.left);
        TreeInfo rightInfo = checkSumTree(node.right);

        boolean isCurrentSum = leftInfo.isSum && rightInfo.isSum && (node.data == leftInfo.sum + rightInfo.sum);
        int currentSum = node.data + leftInfo.sum + rightInfo.sum;

        return new TreeInfo(isCurrentSum, currentSum);
    }

    private static class TreeInfo {
        boolean isSum;
        int sum;

        TreeInfo(boolean isSum, int sum) {
            this.isSum = isSum;
            this.sum = sum;
        }
    }
}