class Solution {
    public int maxPower(String s) {
        char pointer = s.charAt(0);
        int count = 0;
        int max = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == pointer)
            {
                count++;
            }
            else
            {
                max = Math.max(max, count);
                pointer = s.charAt(i);
                count = 1;
            }
        }

        return Math.max(max, count);
    }
}