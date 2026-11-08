class Solution {
    private int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        int invCount = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }

    private int sortAndCount(int[] arr, int[] temp, int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            invCount += sortAndCount(arr, temp, left, mid);
            invCount += sortAndCount(arr, temp, mid + 1, right);

            invCount += mergeAndCount(arr, temp, left, mid, right);
        }
        return invCount;
    }

    public int inversionCount(int[] arr) {
        int[] temp = new int[arr.length];
        return sortAndCount(arr, temp, 0, arr.length - 1);
    }
}