class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        if(n==1) return heights[0];
        int[] right=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            right[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
         int[] left=new int[n];
        Stack<Integer> st1=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st1.isEmpty() && heights[st1.peek()]>heights[i]){
                st1.pop();
            }
             left[i]=st1.isEmpty()?-1:st1.peek();
            st1.push(i);
        }
        int area=0;
        for(int i=0;i<n;i++){
            int current=heights[i]*(right[i]-left[i]-1);
            area=Math.max(area,current);
        }
        return area;
    }
}