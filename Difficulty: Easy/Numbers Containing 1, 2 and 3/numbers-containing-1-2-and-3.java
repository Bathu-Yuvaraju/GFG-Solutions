class Solution {
    public ArrayList<Integer> filterByDigits(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (isValid(num)) {
                result.add(num);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    private boolean isValid(int n) {
        if (n == 0) return false;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 1 && digit != 2 && digit != 3) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}