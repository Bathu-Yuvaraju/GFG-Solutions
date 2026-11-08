class Solution {
    private int maxDiameter;

    public int diameter(Node root) {
        maxDiameter = 0;
        height(root);
        return maxDiameter;
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}