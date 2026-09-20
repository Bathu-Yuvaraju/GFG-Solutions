class Solution {
    String merge(String s1, String s2) {
        // code here
        int min=Math.min(s1.length(),s2.length());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<min;i++)
        {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        sb.append(s1.substring(min));
        sb.append(s2.substring(min));
        return sb.toString();
    }

}