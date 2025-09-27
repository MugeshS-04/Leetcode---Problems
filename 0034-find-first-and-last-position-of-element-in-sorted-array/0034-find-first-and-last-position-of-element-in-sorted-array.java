class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Find the first occurrence of target
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                break;
            }
        }
        
        // Find the last occurrence of target
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                result[1] = i;
                break;
            }
        }
        
        return result;
    }
}
