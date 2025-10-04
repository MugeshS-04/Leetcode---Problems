class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area = 0;

        while(left < right)
        {
            int h = Math.min(height[left], height[right]);
            area = Math.max(area, h * (right - left));

            if(height[left] > height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }

        return area;
    }
}