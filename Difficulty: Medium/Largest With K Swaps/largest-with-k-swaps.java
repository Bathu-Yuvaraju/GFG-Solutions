class Solution {
    String maxStr;

    public String findMaximumNum(String s, int k) {
        maxStr = s;
        findMax(s.toCharArray(), k, 0);
        return maxStr;
    }

    private void findMax(char[] arr, int k, int idx) {
        if (k == 0 || idx == arr.length) {
            return;
        }

        char maxChar = arr[idx];
        for (int i = idx + 1; i < arr.length; i++) {
            if (arr[i] > maxChar) {
                maxChar = arr[i];
            }
        }

        if (maxChar != arr[idx]) {
            k--;
        }

        for (int i = arr.length - 1; i >= idx; i--) {
            if (arr[i] == maxChar) {
                char temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;

                String current = new String(arr);
                if (current.compareTo(maxStr) > 0) {
                    maxStr = current;
                }

                findMax(arr, k, idx + 1);

                temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }
    }
}