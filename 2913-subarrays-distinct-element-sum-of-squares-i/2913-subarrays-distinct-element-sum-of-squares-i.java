class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i;j<n;j++){
                int val=nums.get(j);
                map.put(val,map.getOrDefault(val,0)+1);
                int s=map.size();
                sum+=(s*s);
            }
        }
        return sum;
    }
}