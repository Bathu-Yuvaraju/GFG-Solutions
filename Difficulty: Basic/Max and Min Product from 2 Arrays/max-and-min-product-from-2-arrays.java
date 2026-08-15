
class Solution {

    public long minMaxProduct(int[] arr1, int[] arr2) {
        // code here
        int max = arr1[0];
        int min = arr2[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
            }
        }

        return (long) max * min;
    }
}