class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        Node pre = null;
        Node suc = null;
        Node curr = root;

        while (curr != null) {
            if (curr.data >= key) {
                curr = curr.left;
            } else {
                pre = curr;
                curr = curr.right;
            }
        }

        curr = root;
        while (curr != null) {
            if (curr.data <= key) {
                curr = curr.right;
            } else {
                suc = curr;
                curr = curr.left;
            }
        }

        ArrayList<Node> result = new ArrayList<>();
        result.add(pre);
        result.add(suc);
        return result;
    }
}