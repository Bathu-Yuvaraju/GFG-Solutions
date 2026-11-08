class Solution {
    public int swapBits(int n) {
        int evenMask = n & 0xAAAAAAAA;
        int oddMask = n & 0x55555555;
        return (evenMask >> 1) | (oddMask << 1);
    }
}