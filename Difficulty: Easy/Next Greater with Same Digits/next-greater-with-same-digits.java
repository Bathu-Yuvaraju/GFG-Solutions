class Solution {
    public int findNext(int n) {
        // Convert the number to a character array of digits
        char[] digits = String.valueOf(n).toCharArray();
        int len = digits.length;

        // Step 1: Find the pivot index from the right
        int i = len - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // If no pivot is found, the number is strictly decreasing (max permutation)
        if (i < 0) {
            return -1;
        }

        // Step 2: Find the element just larger than digits[i] from the right
        int j = len - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Step 3: Swap the pivot with this element
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Step 4: Reverse the suffix starting from i + 1
        int left = i + 1, right = len - 1;
        while (left < right) {
            temp = digits[left];
            digits[left] = digits[right];
            digits[right] = temp;
            left++;
            right--;
        }

        // Step 5: Convert back to integer and handle potential overflow
        long result = Long.parseLong(new String(digits));
        if (result > Integer.MAX_VALUE) {
            return -1;
        }

        return (int) result;
    }
}