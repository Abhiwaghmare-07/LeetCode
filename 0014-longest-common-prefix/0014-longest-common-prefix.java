class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        for(int i=1;i<strs.length;i++){
            int a=0;
            while(a<strs[i].length() && a<ans.length()){
                if(strs[i].charAt(a)==ans.charAt(a) ){
                    a++;
                }
                else{
                  
                    break;
                }
                
            }
              ans=strs[i].substring(0,a);
           
        }
        return ans;
    }
}