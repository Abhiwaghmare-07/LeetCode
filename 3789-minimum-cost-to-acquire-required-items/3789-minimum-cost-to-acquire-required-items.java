class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
       
        long value1=(long)Math.max(need1,need2)*costBoth;
         long value2=(long)cost1*need1+(long)cost2*need2;
        int diff=Math.abs(need1-need2);
       long  value3=(long)Math.min(need1,need2)*costBoth;
        if(need1>=need2)
           value3+=(long)diff*cost1;
        else
        value3+=(long)diff*cost2;

        return Math.min(value1,Math.min(value2,value3));
    }
}