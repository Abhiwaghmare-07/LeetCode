class Solution {
    public int findKthPositive(int[] arr, int k) {
       List<Integer> li=new  ArrayList<>();
        int num=1;
        int i=0;
        while(i< arr.length){
            if(arr[i]==num){
                i++;
                num++;
            }
            else{
                li.add(num);
                num++;
                
            }
            if(li.size()==k) {
                return li.get(li.size()-1);
            }
        }
        while(li.size()<k){
            li.add(num++);
        }
        return li.get(li.size()-1);
    }
}