class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int start = 0;
        int end = plants.length-1;
        int count = 0;

        int Acan = capacityA;
        int Bcan = capacityB;

        while(start < end){
            
            if(plants[start] > Acan){
                count++;
                Acan = capacityA;
            }
                Acan = Acan - plants[start];
                start++;

            if(plants[end] > Bcan){
                count++;
                Bcan = capacityB;
            }
                Bcan = Bcan - plants[end];
                end--;
        }

        if(start == end){
                if(Math.max(Acan, Bcan) < plants[start]){
                    count++;
                }
            }

        return count;
    }
}