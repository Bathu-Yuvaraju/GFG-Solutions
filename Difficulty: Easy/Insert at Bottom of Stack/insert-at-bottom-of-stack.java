class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return st;
        }

        int topElement = st.pop();
        insertAtBottom(st, x);
        st.push(topElement);

        return st;
    }
}