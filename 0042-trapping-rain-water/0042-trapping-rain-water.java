class Solution {
    public int trap(int[] height) {
            int n=height.length;
           
           
           int[] suffix=new int[n];
          int   max=0;
         for(int i=n-1;i>=0;i--){
             max=Math.max(height[i],max);
             suffix[i]=max;
           }
        int total=0;
        int pre=0;
        for(int i=0;i<height.length;i++){
            pre=Math.max(pre,height[i]);
            if(height[i]< pre& height[i]<suffix[i]){
                total+=Math.min(pre,suffix[i])-height[i];
            }
        }
        return total;
    }
}