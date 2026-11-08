class Solution {
    public ArrayList<String> powerSet(String s) {
        ArrayList<String> result = new ArrayList<>();
        generateSubsets(s, 0, "", result);
        // Sorting is optional, but helps match standard expected output order
        Collections.sort(result);
        return result;
    }

    private void generateSubsets(String s, int index, String current, ArrayList<String> result) {
        // Base case: when we have considered all characters
        if (index == s.length()) {
            result.add(current);
            return;
        }

        // Choice 1: Include the current character
        generateSubsets(s, index + 1, current + s.charAt(index), result);

        // Choice 2: Exclude the current character
        generateSubsets(s, index + 1, current, result);
    }
}