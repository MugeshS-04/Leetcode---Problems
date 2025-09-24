class Solution {
    public int minOperations(String s) {
        char[] arr = s.toCharArray();
        int count = 0;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] == arr[i-1])
            {
                if(arr[i-1] == '0') arr[i-1] = '1';
                else arr[i-1] = '0';
                count++;
                i++;
            }
        }

        return count;
    }
}