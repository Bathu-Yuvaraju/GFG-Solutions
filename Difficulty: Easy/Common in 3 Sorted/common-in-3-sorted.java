class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        Map<Integer, Character> mp = new HashMap<>();
        for (int ele : a) {
            if (!mp.containsKey(ele))
                mp.put(ele , 'A');
        }

        for (int ele : b) {
            if (mp.containsKey(ele) && mp.get(ele) == 'A') {
                mp.put(ele, 'B');
            }
        }

        for (int ele : c) {
            if (mp.containsKey(ele) && mp.get(ele) == 'B') {
                mp.put(ele , 'C');
            }
        }

        for (var entry : mp.entrySet()) {
            if (entry.getValue() == 'C') ans.add(entry.getKey());
        }

        ans.sort(Comparator.naturalOrder());

        return ans;
    }
}