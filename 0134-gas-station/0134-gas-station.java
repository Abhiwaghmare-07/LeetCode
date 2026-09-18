class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int costgas=0;
        for(int i=0;i<gas.length;i++){
              totalgas+=gas[i];
              costgas+=cost[i];
        }
        if(totalgas<costgas) return -1;
        int startIndex=0;
        int currentGas=0;
        for(int i=0;i<gas.length;i++){
            currentGas+=gas[i]-cost[i];
            if(currentGas<0){
                currentGas=0;
                startIndex=i+1;
            }
        }
        return startIndex;
    }
}