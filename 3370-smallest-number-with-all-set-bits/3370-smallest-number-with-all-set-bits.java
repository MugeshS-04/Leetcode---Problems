class Solution {
    public int smallestNumber(int n) {
        int bits = Integer.toBinaryString(n).length();
        return (1 << bits) - 1;
    }
}