class Solution {
    public String reverseString(String s) {
        // code here
        char []c=s.toCharArray();
        int l=0,r=c.length-1;
        while(l<r)
        {
            if(!Character.isLetter(c[l]))
                l++;
            else if(!Character.isLetter(c[r]))
                r--;
            else
            {
                char t=c[l];
                c[l]=c[r];
                c[r]=t;
                l++;
                r--;
            }
        }
        return new String(c);
    }
}