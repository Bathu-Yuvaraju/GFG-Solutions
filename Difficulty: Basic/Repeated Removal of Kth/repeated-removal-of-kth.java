class Solution {
    public int getCandidate(int n, int k) {
        // Create a list of integers from 1 to n
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        // Repeat until the number of remaining integers is less than k
        while (list.size() >= k) {
            ArrayList<Integer> nextList = new ArrayList<>();
            // Keep every kth remaining integer (1-indexed, so index k-1, 2k-1, etc.)
            for (int i = k - 1; i < list.size(); i += k) {
                nextList.add(list.get(i));
            }
            list = nextList;
        }
        
        return list.get(0);
    }
}