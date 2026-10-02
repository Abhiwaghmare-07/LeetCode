class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int k=n-1;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int j=n+n-1;j>=0;j--){
            while(!st.isEmpty() && nums[j%n]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                if(j<n){
                    ans[k--]=-1;
                }
            }else{
                if(j<n){
                    ans[k--]=st.peek();
                }
            }
            st.push(nums[j%n]);
        }
        return ans;
    }
}