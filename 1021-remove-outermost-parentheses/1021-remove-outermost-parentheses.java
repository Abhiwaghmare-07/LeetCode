class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        st.push(s.charAt(0));
        int i=1;
        StringBuilder sb=new StringBuilder();
        while(i<n){
            char ch=s.charAt(i);
            if(st.size()==0){
                st.push(ch);
            }
            else if(st.size()>0){
                if(ch=='('){
                    st.push(ch);
                    sb.append(ch);
                }else{
                    st.pop();
                    if(st.size()>0){
                       sb.append(ch);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }
}