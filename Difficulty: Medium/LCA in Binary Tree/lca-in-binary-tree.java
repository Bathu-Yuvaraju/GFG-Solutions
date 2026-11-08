class Solution {
    Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        if (leftLca != null && rightLca != null) {
            return root;
        }

        return (leftLca != null) ? leftLca : rightLca;
    }
}