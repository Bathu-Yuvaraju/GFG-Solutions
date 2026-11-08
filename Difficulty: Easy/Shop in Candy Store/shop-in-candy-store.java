class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        Arrays.sort(prices);
        int n = prices.length;

        int minCost = 0;
        int buy = 0;
        int free = n - 1;
        while (buy <= free) {
            minCost += prices[buy];
            buy++;
            free -= k;
        }

        int maxCost = 0;
        buy = n - 1;
        free = 0;
        while (free <= buy) {
            maxCost += prices[buy];
            buy--;
            free += k;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(minCost);
        result.add(maxCost);
        return result;
    }
}