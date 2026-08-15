import java.util.*;
class Solution {
    int findSum(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }
        int sum = 0;
        for (int x : set) {
            sum += x;
        }
        return sum;
    }
}