class Solution {
    public int lastIndex(String s) {
        // code here
        int idx = -1;
               for(int i=0;i<s.length();i++){
                   if(s.charAt(i)=='1'){
                       idx = i;
                   }
               }
               return idx;
           }
    }