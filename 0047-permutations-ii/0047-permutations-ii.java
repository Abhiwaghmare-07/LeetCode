class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void permute(int[] nums,boolean[] val,List<Integer> li){
        if(li.size()==nums.length){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(val[i]==true){
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !val[i - 1])
                continue;

                val[i]=true;
                li.add(nums[i]);
                 permute(nums, val, li);
                  li.remove(li.size() - 1);
                 val[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] val=new boolean[nums.length];
       permute(nums,val,new ArrayList<>());  
       return ans;
    }
}