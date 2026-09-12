class Solution {
    public boolean day(int[] bloomDay,int mid,int m,int k){
        int count=0;
        int booque=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
            }
            else{
                booque+=count/k;
                count=0;
            }
        }
          booque += count / k;
        if(booque>=m) return true;

        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
        
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
             low=Math.min(bloomDay[i],low);
             high=Math.max(bloomDay[i],high);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(day(bloomDay,mid,m,k)==true){
                ans=Math.min(mid,ans);
                    high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}