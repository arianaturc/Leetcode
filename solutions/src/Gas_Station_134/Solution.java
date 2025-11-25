package Gas_Station_134;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int total_gas = 0;
        int total_cost = 0;
        int total = 0;
        int return_value = 0;

        for(int i = 0; i < len; i++) {
            total_gas += gas[i];
            total_cost += cost[i];
        }

        if(total_gas < total_cost)
            return -1;

        for(int i = 0; i < len; i++) {
            total += gas[i] - cost[i];
            if(total < 0) {
                total = 0;
                return_value = i + 1;
            }
        }
        return return_value;
    }
}