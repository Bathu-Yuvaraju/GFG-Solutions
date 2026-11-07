class Solution {
        public int thirdLargest(List<Integer> arr) {

            if (arr.size() < 3) {
                return -1;
            }

            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;

            for (int i = 0; i < arr.size(); i++) {

                int current = arr.get(i);

                if (current >= first) {
                    third = second;
                    second = first;
                    first = current;
                }
                else if (current >= second) {
                    third = second;
                    second = current;
                }
                else if (current >= third) {
                    third = current;
                }
            }

            return third;
        }
    }