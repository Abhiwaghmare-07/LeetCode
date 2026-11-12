class Solution {
    List<List<Integer>> ans=new ArrayList<>();
        public void helper(int[] candidates,int target,int i,int sum,List<Integer> li){
            if(i==candidates.length && sum==target){
                ans.add(new ArrayList<>(li));
                return;
            }
            if(i==candidates.length || sum> target) return;
            li.add(candidates[i]);
           helper(candidates,target,i,sum+=candidates[i],li);
           li.remove(li.size()-1);
             helper(candidates,target,i+1,sum-=candidates[i],li);

        }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates,target,0,0,new ArrayList<>());
        return ans;
    }
}