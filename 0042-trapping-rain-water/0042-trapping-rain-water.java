class Solution {
    public int trap(int[] height) {
            int n=height.length;
           int[] prefix=new int[n];
           int max=0;
           for(int i=0;i<n;i++){
             max=Math.max(height[i],max);
             prefix[i]=max;
           }
           int[] suffix=new int[n];
           max=0;
         for(int i=n-1;i>=0;i--){
             max=Math.max(height[i],max);
             suffix[i]=max;
           }
        int total=0;
        for(int i=0;i<height.length;i++){
            if(height[i]< prefix[i]& height[i]<suffix[i]){
                total+=Math.min(prefix[i],suffix[i])-height[i];
            }
        }
        return total;
    }
}