class Solution {
    public int strStr(String haystack, String needle) {
        int ln=needle.length();
        int lh=haystack.length();
        int i=0;
        while(i<lh-ln+1){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(needle.equals(haystack.substring(i,i+ln))){
                    return i;
                }
            }
            i++;
        }
        return -1;
    }
}