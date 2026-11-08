class Solution {
    public ArrayList<String> binstr(int n) {
        ArrayList<String> result = new ArrayList<>();
        generate(n, "", result);
        return result;
    }

    private void generate(int n, String current, ArrayList<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
        generate(n, current + "0", result);
        generate(n, current + "1", result);
    }
}