class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            if(i>0&& arr[i]==arr[i-1])
                continue;
            int l=i+1;
            int r=n-1;
            while(l<r)
            {
                int sum=arr[i]+arr[l]+arr[r];
                if(sum == 0)
                {
                    ArrayList<Integer> a=new ArrayList<>();
                    a.add(arr[i]);
                    a.add(arr[l]);
                    a.add(arr[r]);
                    al.add(a);
                    l++;
                    r--;
                    while(l<r && arr[l]==arr[l-1]) 
                    l++;
                while(l<r && arr[r]==arr[r+1])
                    r--;
                }
                else if(sum>0)
                    r--;
                else
                    l++;
            }
        }
        return al;
    }
}