class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> currentLevel = new ArrayList<>(size);

            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();

                if (leftToRight) {
                    currentLevel.add(curr.data);
                } else {
                    currentLevel.add(0, curr.data);
                }

                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }

            result.addAll(currentLevel);
            leftToRight = !leftToRight;
        }

        return result;
    }
}