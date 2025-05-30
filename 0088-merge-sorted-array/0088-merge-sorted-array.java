class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr1 = m-1;
        int arr2 = n-1;
        int p = nums1.length-1;

        while(p >= 0 && arr1 >= 0 && arr2 >= 0)
        {
            if(nums1[arr1] >= nums2[arr2])
            {
                nums1[p--] = nums1[arr1--];
            }
            else
            {
                nums1[p--] = nums2[arr2--];
            }
        }

        while(arr2 >= 0)
        {
            nums1[p--] = nums2[arr2--];
        }
    }
}