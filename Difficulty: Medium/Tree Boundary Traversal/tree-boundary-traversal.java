class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        if (!isLeaf(root)) {
            res.add(root.data);
        }

        collectLeftBoundary(root, res);
        collectLeaves(root, res);
        collectRightBoundary(root, res);

        return res;
    }

    boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    void collectLeftBoundary(Node root, ArrayList<Integer> res) {
        Node curr = root.left;
        while (curr != null) {
            if (!isLeaf(curr)) res.add(curr.data);
            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    void collectLeaves(Node node, ArrayList<Integer> res) {
        if (node == null) return;

        if (isLeaf(node)) {
            res.add(node.data);
            return;
        }

        collectLeaves(node.left, res);
        collectLeaves(node.right, res);
    }

    void collectRightBoundary(Node root, ArrayList<Integer> res) {
        ArrayList<Integer> temp = new ArrayList<>();
        Node curr = root.right;
        while (curr != null) {
            if (!isLeaf(curr)) temp.add(curr.data);
            if (curr.right != null) curr = curr.right;
            else curr = curr.left;
        }

        for (int i = temp.size() - 1; i >= 0; i--) {
            res.add(temp.get(i));
        }
    }
}