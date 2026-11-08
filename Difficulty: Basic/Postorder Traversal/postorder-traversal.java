class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        postOrderHelper(root, result);
        return result;
    }

    private void postOrderHelper(Node node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        postOrderHelper(node.left, result);
        postOrderHelper(node.right, result);
        result.add(node.data);
    }
}