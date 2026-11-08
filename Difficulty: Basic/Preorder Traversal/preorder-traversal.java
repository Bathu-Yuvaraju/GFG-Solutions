class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        preOrderHelper(root, result);
        return result;
    }

    private void preOrderHelper(Node node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.data);
        preOrderHelper(node.left, result);
        preOrderHelper(node.right, result);
    }
}