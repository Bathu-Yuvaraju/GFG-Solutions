class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;

        while( i<j ){
            int sum = arr[i] + arr[j];
            if(sum == target){
                return Arrays.asList(arr[i], arr[j]);
            }else if( sum < target){
                i++; 
            }else{
                j--;
            }
        }

        return new ArrayList<>();
    }
}