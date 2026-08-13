
class Solution {
    public static boolean isPalindrome(int[] arr) {
        int n = arr.length;
        // Checking elements from both ends of the array
        for (int i = 0; i < n / 2; i++) {
            // If any two elements are not equal, array is not perfect
            if (arr[n - i - 1] != arr[i]) return false;
        }
        // If all elements checked and they are equal, array is perfect
        return true;
    }
}