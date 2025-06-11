class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max = 0;

        while(start < end)
        {
            int len = end - start;
            int he = Math.min(height[start], height[end]);
            int area = len * he;
            max = Math.max(max, area);

            if(height[start] < height[end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }

        return max;
    }
}