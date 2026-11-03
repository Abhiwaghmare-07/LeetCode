class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int[] nums,int idx,List<Integer> li){
        if (idx == nums.length) {
            ans.add(new ArrayList<>(li));
            return;
        }
         for (int i = idx; i < nums.length; i++) {

            swap(nums, idx, i);

            li.add(nums[idx]);

            helper(nums, idx + 1, li);

            li.remove(li.size() - 1);

            swap(nums, idx, i);
        }
    }
     public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        helper(nums,0,new ArrayList<>());
        return ans;
    }
}