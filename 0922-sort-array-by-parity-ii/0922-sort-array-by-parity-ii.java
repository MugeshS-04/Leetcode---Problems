class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIndex = 0;
        int oddIndex = 1;
        int n = nums.length;

        while (evenIndex < n && oddIndex < n) {
            if (nums[evenIndex] % 2 == 0) {
                evenIndex += 2;
            } else if (nums[oddIndex] % 2 == 1) {
                oddIndex += 2;
            } else {
                swap(nums, evenIndex, oddIndex);
                evenIndex += 2;
                oddIndex += 2;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
