class Solution {
    public ArrayList<String> possibleWords(int[] arr) {
        ArrayList<String> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }

        String[] keypad = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        backtrack(arr, 0, keypad, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int[] arr, int index, String[] keypad, StringBuilder current, ArrayList<String> result) {
        if (index == arr.length) {
            result.add(current.toString());
            return;
        }

        int digit = arr[index];
        String letters = keypad[digit];

        if (letters.isEmpty()) {
            backtrack(arr, index + 1, keypad, current, result);
            return;
        }

        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(arr, index + 1, keypad, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}