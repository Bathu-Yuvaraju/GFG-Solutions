class Solution {
    private static int preorderIndex;
    private static java.util.HashMap<Integer, Integer> inorderMap;

    public static Node buildTree(int[] inorder, int[] preorder) {
        preorderIndex = 0;
        inorderMap = new java.util.HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return arrayToTree(preorder, 0, inorder.length - 1);
    }

    private static Node arrayToTree(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }

        int rootValue = preorder[preorderIndex++];
        Node root = new Node(rootValue);

        int index = inorderMap.get(rootValue);

        root.left = arrayToTree(preorder, left, index - 1);
        root.right = arrayToTree(preorder, index + 1, right);

        return root;
    }
}