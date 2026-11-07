class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count=0;
        for(int nums:arr1){
            int low=0;
            int high=arr2.length-1;
            boolean valid=false;
            while(low<=high){
                int mid=low+(high-low)/2;
                if((Math.abs(nums-arr2[mid])<=d)){
                    valid=true;
                    break;
                }
               else if (arr2[mid] < nums) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }

            }
            if(valid==false) count++;
        }
        return count;
    }
}