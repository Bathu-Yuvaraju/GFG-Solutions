import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Solution {
    private static void permute(String s, int l, int r, Set<String> result) {
        if (l == r) {
            result.add(s);
            return;
        }
        for (int i = l; i <= r; i++) {
            s = swap(s, l, i);
            permute(s, l + 1, r, result);
            s = swap(s, l, i);
        }
    }

    private static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static ArrayList<String> findPermutation(String s) {
        Set<String> uniquePermutations = new HashSet<>();
        permute(s, 0, s.length() - 1, uniquePermutations);
        ArrayList<String> list = new ArrayList<>(uniquePermutations);
        Collections.sort(list);
        return list;
    }
}