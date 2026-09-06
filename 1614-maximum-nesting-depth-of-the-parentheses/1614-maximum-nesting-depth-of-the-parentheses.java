class Solution {
    public int maxDepth(String s) {
      
        int i=0;
        int max=0;
        int count=0;
        while(i<s.length()){
           char ch=s.charAt(i);
            if(ch=='('){
            
                max++;
                 count=Math.max(count,max);
            }
            else if(ch==')')
            {
               
                
                max--;
                
            }
            
               
            
            
            i++;
        }
        return count;
    }
}