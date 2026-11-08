class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp = n;
        long sum = 0;
        while (n != 0) {
            long digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        return temp == sum;
    }
}