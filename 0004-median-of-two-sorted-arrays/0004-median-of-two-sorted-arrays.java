class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length + nums2.length];
        int k = 0;
        for(int i : nums1)
        {
            arr[k] = i;
            k++;
        }
        for(int i : nums2)
        {
            arr[k] = i;
            k++;
        }
        Arrays.sort(arr);

        int size = arr.length;

        if(arr.length%2 != 0)
        {
            return (double)(arr[size/2]);
        }
        else
        {
            double result = (double)(arr[size / 2] + arr[(size / 2) - 1]);
            System.out.print(arr[size / 2] + arr[(size / 2) - 1]);
            return (double)(result/2);
        }
    }
}