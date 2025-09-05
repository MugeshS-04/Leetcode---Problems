class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int i = 1; i <= 60; i++)
        {
            long diff = (long)num1 - (long)i * num2;

            int bit = Long.bitCount(diff);

            if(bit <= i && i <= diff) return i; 
        }
        return -1;
    }
}