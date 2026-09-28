class Solution {
    public String intToRoman(int num) {
        StringBuilder ans=new StringBuilder();
        int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<value.length;i++){
            while(num>=value[i]){
                num-=value[i];
                ans.append(roman[i]);
            }
        }
        return ans.toString();
    }
}