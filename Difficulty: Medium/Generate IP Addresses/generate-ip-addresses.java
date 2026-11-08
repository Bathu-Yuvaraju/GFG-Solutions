
class Solution {
    public ArrayList<String> generateIp(String s) {
        ArrayList<String> result = new ArrayList<>();
        int n = s.length();
        if (n < 4 || n > 12) {
            return result;
        }

        for (int i = 1; i < 4 && i < n - 2; i++) {
            for (int j = i + 1; j < i + 4 && j < n - 1; j++) {
                for (int k = j + 1; k < j + 4 && k < n; k++) {
                    String part1 = s.substring(0, i);
                    String part2 = s.substring(i, j);
                    String part3 = s.substring(j, k);
                    String part4 = s.substring(k);

                    if (isValid(part1) && isValid(part2) && isValid(part3) && isValid(part4)) {
                        result.add(part1 + "." + part2 + "." + part3 + "." + part4);
                    }
                }
            }
        }
        return result;
    }

    private boolean isValid(String str) {
        if (str.length() > 3 || str.length() == 0) {
            return false;
        }
        if (str.charAt(0) == '0' && str.length() > 1) {
            return false;
        }
        int val = Integer.parseInt(str);
        return val >= 0 && val <= 255;
    }
}