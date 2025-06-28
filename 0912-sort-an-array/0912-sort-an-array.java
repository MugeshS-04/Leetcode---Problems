class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length-1);
        return nums;
    }

    void mergesort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int middle = left + (right - left) / 2;

            mergesort(arr, left, middle);

            mergesort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    void merge(int[] arr, int left, int middle, int right)
    {
        int[] larr = new int[middle - left + 1];
        int[] rarr = new int[right - middle];

        int l = 0;
        int r = 0;

        int index = left;

        for(int i = 0; i < middle - left + 1; i++)
        {
            larr[i] = arr[left + i];
        }

        for(int i = 0; i < right - middle; i++)
        {
            rarr[i] = arr[middle + 1 + i];
        }

        while(l < larr.length && r < rarr.length)
        {
            if(larr[l] < rarr[r])
            {
                arr[index] = larr[l];
                l++;
                index++;
            }
            else
            {
                arr[index] = rarr[r];
                r++;
                index++;
            }
        }

        while(l < middle - left + 1)
        {
            arr[index] = larr[l];
            index++;
            l++;
        }

        while(r < rarr.length)
        {
            arr[index] = rarr[r];
            r++;
            index++; 
        }
    }
}