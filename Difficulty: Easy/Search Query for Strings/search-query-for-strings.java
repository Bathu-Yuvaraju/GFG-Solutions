
class Solution {
    public int[] checkQueries(TrieNode root, String[] arr, String[] queries) {
        // 1. Insert all strings from arr into the Trie
        for (String word : arr) {
            Main.insert(root, word);
        }

        // 2. Process each query and store the result
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (Main.search(root, queries[i])) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }

        return result;
    }
}