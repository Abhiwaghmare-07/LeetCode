class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void subset(int[] nums,int i,List<Integer> li){
        if(i==nums.length){
            ans.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[i]);
        subset(nums,i+1,li);
        li.remove(li.size()-1);
        subset(nums,i+1,li);
    }
    public List<List<Integer>> subsets(int[] nums) {
        
        subset(nums,0,new ArrayList<>());
        return ans;
    }
}