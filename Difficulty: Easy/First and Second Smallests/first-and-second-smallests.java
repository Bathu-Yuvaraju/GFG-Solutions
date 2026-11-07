class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < first) {
                second = first;
                first = arr[i];
            } else if(arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }

        if(second == Integer.MAX_VALUE) {
            list.add(-1);
        } else {
            list.add(first);
            list.add(second);
        }

        return list;


    }
}