class Solution {
    public int func(int[] weights,int days,int mid){
        int sum=0;
        int fdays=0;
        int i=0;
        while(i<weights.length){
            sum+=weights[i];
            if(sum>mid){
                fdays++;
                sum=0;
            }
            else{
                if(sum==mid){
                    fdays++;
                    sum=0;
                }
                i++;
            }
        }
        if(sum>0) fdays++;
        return fdays;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(weights[i],low);
              high+=weights[i];
            
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int rday=func(weights,days,mid);
            if(rday<=days){
                 ans=mid;
                 high=mid-1;
            }
            else{
               low=mid+1;
            }
        }
        return ans;
    }
}