class Solution {
    ArrayList<Integer> bracketNumbers(String s) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int maxId = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                maxId++;
                stack.push(maxId);
                result.add(maxId);
            } else if (ch == ')') {
                int id = stack.pop();
                result.add(id);
            }
        }

        return result;
    }
}