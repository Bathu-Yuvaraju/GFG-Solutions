 import java.util.*;
 class Solution {
     static ArrayList<Integer> removeDuplicate(int arr[]) {
         LinkedHashSet<Integer> set = new LinkedHashSet<>();
         for (int x : arr) {
             set.add(x);
         }
         return new ArrayList<>(set);
     }
 }