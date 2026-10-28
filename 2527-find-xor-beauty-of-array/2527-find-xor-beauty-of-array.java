class Solution {
    public int xorBeauty(int[] nums) {
        int num = 0;
        for(int i = 0;i<nums.length;i++){
            num ^=nums[i];
    }

    return num;
    }
}