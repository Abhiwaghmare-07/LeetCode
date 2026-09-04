class Solution {
    public String reverseWords(String s) {
        String[] sc=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=sc.length-1;i>=0;i--){
               sb.append(sc[i]);
               if(i!=0){
                sb.append(" ");
               }
        }
        return sb.toString();
    }
}