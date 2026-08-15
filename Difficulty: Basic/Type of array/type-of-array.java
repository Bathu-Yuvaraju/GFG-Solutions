class Solution {
    int typeOfArr(int arr[]) {
        // code here
        int n = arr.length;
        int inc = 0;
        int dec = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                inc++;
            } else {
                dec++;
            }
        }
        if (dec == 0) {
            return 1;
        }
        if (inc == 0) {
            return 2;
        }
        if (inc == 1) {
            return 3;
        }
        return 4;
    }
}
