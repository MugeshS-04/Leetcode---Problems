class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int sum = numbers[start] + numbers[end];
        while(start < end)
        {
            if(sum == target)
            {
                return new int[]{start+1, end+1};
            }
            else if(sum > target)
            {
                sum-=numbers[end--];
                sum+=numbers[end];
                System.out.println(sum);
            }
            else
            {
                sum-=numbers[start++];
                sum+=numbers[start];
            }
        }

        return new int[]{0, 0};
    }
}