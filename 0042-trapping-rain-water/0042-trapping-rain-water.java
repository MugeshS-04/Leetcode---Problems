class Solution {
    public int trap(int[] height) {
        int start = 0;
        int total = 0;
        int n = height.length;
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];

        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        }

        while (start < height.length) {
            int left = leftmax[start];
            int right = rightmax[start];
            int min = Math.min(left, right);
            if (min - height[start] > 0) {
                total += min - height[start];
            }
            start++;
        }

        return total;
    }
}