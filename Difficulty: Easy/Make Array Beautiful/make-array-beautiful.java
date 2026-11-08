class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (!stack.isEmpty()) {
                int top = stack.peek();
                if ((top < 0 && num >= 0) || (top >= 0 && num < 0)) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(num);
        }
        return new ArrayList<>(stack);
    }
}