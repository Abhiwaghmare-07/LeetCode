class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum=0;
        int n=nums.length;
        int[] square=new int[n];
        for(int i=0;i<n;i++){
            square[i]=nums[i]*nums[i];
        }
        Arrays.sort(square);
        int negative=n/2;
        for(int i=0;i<negative;i++){
            sum-=square[i];
        }
        for(int i=negative;i<n;i++){
            sum+=square[i];
        }
        return sum;
    }
}