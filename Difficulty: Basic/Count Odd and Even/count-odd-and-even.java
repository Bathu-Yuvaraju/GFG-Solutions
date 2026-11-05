class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here

        int res[]=new int[2]; //static array

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                res[0]+=1;
            }
                else{
                    res[1]+=1;
            }
        }
        return res;
    }
}

