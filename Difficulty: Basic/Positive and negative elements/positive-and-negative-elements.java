import java.util.*;
class Solution {
    public ArrayList<Integer> arranged(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int x : arr) {
            if (x > 0)
                pos.add(x);
            else
                neg.add(x);
        }
        int i = 0;
        while (i < pos.size() && i < neg.size()) {
            result.add(pos.get(i));
            result.add(neg.get(i));
            i++;
        }
        while (i < pos.size()) {
            result.add(pos.get(i));
            i++;
        }
        while (i < neg.size()) {
            result.add(neg.get(i));
            i++;
        }
        return result;
    }
}