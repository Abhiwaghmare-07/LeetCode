class Solution {
    public String removeKdigits(String num, int k) {
             Stack<Integer> st=new Stack<>();
             for(int i=0;i<num.length();i++){
                while(!st.isEmpty() && k>0 && st.peek() > (num.charAt(i)-'0')){
                    st.pop();
                    k--;
                }
                st.push(num.charAt(i)-'0');
             }
             while(k>0){
                st.pop();
                k--;
             }
             if(st.isEmpty()) return "0";

              StringBuilder ans = new StringBuilder();
                 boolean leadingZero = true;
                for(int c:st){
                    if(leadingZero && c==0){
                        continue;
                    }
                    leadingZero=false;
                    ans.append(c);
                }
                if(ans.length()==0) return "0";
                return ans.toString();


    }
}