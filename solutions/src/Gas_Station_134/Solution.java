package Gas_Station_134;

/// compute the total gas and total cost (sum of the elements of the given arrays)
/// if the total cost is bigger than the total gas => return -1
/// compute the difference between the gas and cost at the same index
/// if it is negative the car can t travel around the circuit
/// reset the total to 0 and increase the index

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