class Solution {
    public int smallestNumber(int n) {
        String num = Integer.toBinaryString(n);
        int val = 0;
        for(int i = 0; i < num.length(); i++)
        {
            val = val | 1;
            val = val << 1; 
        }

        return val/2;
    }
}