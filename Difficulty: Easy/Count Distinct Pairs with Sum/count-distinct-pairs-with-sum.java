class Solution {

    static int countDistinctPairs(int arr[], int target) {
        // Your code here
        int ans = 0;

        HashSet<Integer> hs = new HashSet<>();

        for(int x : arr){
            hs.add(x);
        }

        if(target%2 == 0){
            int half = target/2;
            if(hs.contains(half)){
                int count = 0;
                for(int y : arr){
                    if(y == half){
                        count++;
                        if(count > 1){
                            ans++;
                            break;
                        }
                    }
                }
                hs.remove(half);
            }
        }

        int pairs = 0;

        for(int z : hs){
            int rem = target - z;
            if(hs.contains(rem)){
                pairs++;
            }
        }

        ans += pairs/2;

        return ans;
    }
}