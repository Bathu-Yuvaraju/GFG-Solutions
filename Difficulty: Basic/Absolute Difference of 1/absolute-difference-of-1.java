 class Solution {
     int[] getDigitDiff1AndLessK(int[] arr, int k) {
         ArrayList<Integer> list = new ArrayList<>();

         for (int n : arr) {
             if (n >= k || n < 10)
                 continue;

             int x = n;
             boolean valid = true;

             while (x >= 10) {
                 int d1 = x % 10;
                 int d2 = (x / 10) % 10;

                 if (Math.abs(d1 - d2) != 1) {
                     valid = false;
                     break;
                 }

                 x /= 10;
             }

             if (valid) {
                 list.add(n);
             }
         }

         int[] result = new int[list.size()];

         for (int i = 0; i < list.size(); i++) {
             result[i] = list.get(i);
         }

         return result;
     }
 }