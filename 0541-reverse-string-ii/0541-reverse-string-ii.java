class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int start = 0; start < n; start += 2 * k) {
            int end = Math.min(start + k - 1, n - 1);
            reverse(arr, start, end);
        }

        return new String(arr);
    }

    void reverse(char[] arr, int start, int end)
    {
        while(start < end)
        {
            char a = arr[start];
            arr[start] = arr[end];
            arr[end] = a;
            start++;
            end--;
        }
    }
}