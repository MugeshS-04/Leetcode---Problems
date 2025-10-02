class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count = numBottles;
        int next = 0;

        while(numBottles >= 0)
        {
            if(numBottles - numExchange >= 0)
            {
                count++;
                numBottles -= numExchange;
                numExchange++;
                next++;
            }
            else if(next != 0)
            {
                numBottles += next;
                next = 0;
            }
            else break;
        }

        return count;
    }
}