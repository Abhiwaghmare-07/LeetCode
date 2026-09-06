class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        int max=0;
        int count=0;
        while(i<s.length()){
           char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
                max++;
                 count=Math.max(count,max);
            }
            else if(ch==')')
            {
                if(st.size()>0){
                st.pop();
                max--;
                }
            }
            
               
            
            
            i++;
        }
        return count;
    }
}