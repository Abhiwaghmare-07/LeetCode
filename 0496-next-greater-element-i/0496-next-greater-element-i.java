class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
        int n=nums2.length-1;
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=n;i>=0;i--){
          while(!st.isEmpty() && nums2[i]>st.peek()){
            st.pop();
          }
          if(st.isEmpty()){
            map.put(nums2[i],-1);
          }else{
            map.put(nums2[i],st.peek());
          }
          st.push(nums2[i]);
     }
     int n1=nums1.length;
     int[] ans=new int[n1];
       for(int i=0;i<n1;i++){
        ans[i]=map.get(nums1[i]);
       }
       return ans;
    }
}