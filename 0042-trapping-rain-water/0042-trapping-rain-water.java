class Solution {
    public int trap(int[] height) {
        int lt = 0;
        int rt = height.length - 1;
        int left = height[0];
        int right = height[rt];
        int w = 0;
        while(lt < rt)
        {
            if(left < right)
            {
                lt++;
                left = Math.max(left, height[lt]);
                w = w+left-height[lt];
            }
            else
            {
                rt--;
                right = Math.max(right, height[rt]);
                w = w+right-height[rt];
            }
        }
        return w;
    }
}