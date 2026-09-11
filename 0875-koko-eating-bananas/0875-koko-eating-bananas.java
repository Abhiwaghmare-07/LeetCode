class Solution {
    public long hour(int mid,int[] piles){
        long hours=0;
        for(int i=0;i<piles.length;i++){
               hours+=(long)Math.ceil((double)piles[i]/mid);
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        int low=1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalhours=hour(mid,piles);
            if(totalhours<=h){
                ans=Math.min(ans,mid);
                high=mid-1;
            }else{
               low=mid+1;
            }
        }
        return ans;
    }
}