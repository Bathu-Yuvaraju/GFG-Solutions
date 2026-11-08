class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        // code here
       ArrayList<Integer> faiz = new ArrayList<>();
       for(int num1:arr1)
       {
           faiz.add(num1);
       }
       for(int num2:arr2)
       {
           faiz.add(num2);
       }
       Collections.sort(faiz);
       LinkedHashSet<Integer> set= new LinkedHashSet<>();
       for(int it : faiz)
       {
           set.add(it);
       }
        return new ArrayList<>(set);       
    }
}