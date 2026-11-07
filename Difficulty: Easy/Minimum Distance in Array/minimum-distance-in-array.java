class Solution {
int minDist(int arr[], int x, int y) {
int minIndex = Integer.MAX_VALUE;
int lastx = -1; int lasty = -1;
for (int i = 0; i<arr.length; i++) {

if (arr[i] == x) {

lastx = i;

if (lasty != -1) {
minIndex = Math.min(minIndex, Math.abs(lastx - lasty));
}
}

if (arr[i] == y) {

lasty = i;

if (lastx != -1) {
minIndex = Math.min(minIndex, Math.abs(lastx - lasty));
}

}

}

return (minIndex == Integer.MAX_VALUE)? -1: minIndex;

}
}