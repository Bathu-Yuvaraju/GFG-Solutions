/* The Node structure is defined as
 class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
     private Integer prev = null;
     private int minDiff = Integer.MAX_VALUE;

     public int absDiff(Node root) {
         prev = null;
         minDiff = Integer.MAX_VALUE;
         inOrder(root);
         return minDiff;
     }

     private void inOrder(Node root) {
         if (root == null) return;

         inOrder(root.left);

         if (prev != null) {
             minDiff = Math.min(minDiff, root.data - prev);
         }
         prev = root.data;

         inOrder(root.right);
     }
 }
