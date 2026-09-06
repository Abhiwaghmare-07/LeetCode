class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] arr1=new int[256];
        int[] arr2=new int[256];
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
             char ch2=t.charAt(i);
            arr1[ch1]++;
            arr2[ch2]++;
        }
        if(Arrays.equals(arr1,arr2)) return true;

        return false;
    }
}