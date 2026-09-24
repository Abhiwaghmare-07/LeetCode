class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=nums.length-1;
        int j=nums.length-2;
        while(j>=0){
            if(nums[i]>nums[j]){
                break;
            }
            i--;
            j--;
        }
        if(j < 0) {
            Arrays.sort(nums);
            return;
        }
        int pos=i;
       int min=nums[i];
       for(int k=j+1;k<n;k++){
        if(min>nums[k] && nums[k]>nums[j]){
            pos=k;
            min = nums[k];
        }
       }
      int temp=nums[j];
      nums[j]=nums[pos];
      nums[pos]=temp;
     Arrays.sort(nums,j+1,n);
    
        
    }}