class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li=new ArrayList<>();
        int n=nums.length;
        int ele1=Integer.MIN_VALUE;
        int cnt1=0;
        int ele2=Integer.MIN_VALUE;
        int cnt2=0;

        for(int i=0;i<n;i++){
            if(cnt1==0 && nums[i] != ele2){
                ele1=nums[i];
                cnt1++;
            }else if(cnt2==0&& nums[i] != ele1){
                  ele2=nums[i];
                  cnt2++;
            }else if(nums[i]==ele1 ){
                cnt1++;
            }
            else if(nums[i]==ele2 ){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
      
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1) c1++;
            else if(nums[i]==ele2) c2++;
        }
        if(c1>(n/3)) li.add(ele1);
        if(c2>(n/3)) li.add(ele2);

        return li;
    }
}