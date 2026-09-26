class Solution {
    int cnt=0;
    public void mergesort(int[] arr,int low,int mid,int high){
        int j = mid + 1;

        for(int i = low; i <= mid; i++) {

            while(j <= high && arr[i] > 2L * arr[j]) {
                j++;
            }

            cnt += j - (mid + 1);
        }
        List<Integer> li=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                li.add(arr[left]);
                left++;
            }else{
                li.add(arr[right]);
               
                right++;
            }
        }
        while(left<=mid){
            li.add(arr[left]);
            left++;
        }
         while(right<=high){
            li.add(arr[right]);
            right++;
        }
        int k=0;
        for(int i=low;i<=high;i++){
            arr[i]=li.get(k);
            k++;
        }
    }
    public void merge(int[] arr,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        merge(arr,low,mid);
        merge(arr,mid+1,high);
        mergesort(arr,low,mid,high);
    }
    public int reversePairs(int[] nums) {
       int n=nums.length;
       merge(nums,0,n-1);
       return cnt;
    }
}