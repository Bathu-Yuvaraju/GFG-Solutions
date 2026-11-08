class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        int n = start.length;
        java.util.Arrays.sort(start);
        java.util.Arrays.sort(end);

        int rooms = 0;
        int maxRooms = 0;
        int i = 0, j = 0;

        while (i < n) {
            if (start[i] < end[j]) {
                rooms++;
                i++;
            } else {
                rooms--;
                j++;
            }
            maxRooms = Math.max(maxRooms, rooms);
        }

        return maxRooms;
    }
}