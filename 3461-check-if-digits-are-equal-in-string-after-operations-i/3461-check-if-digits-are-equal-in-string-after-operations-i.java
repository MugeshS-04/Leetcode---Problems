class Solution {
    public boolean hasSameDigits(String s) {
        int[] arr = new int[s.length()];

        for(int i = 0; i < s.length(); i++)
        {
            arr[i] = s.charAt(i) - '0';
        }

        int size = s.length();

        for(int i = 0; i < s.length(); i++)
        {
            int[] temp = new int[size];
            int index = 0;

            for(int j = 1; j < size; j++)
            {
                int a = arr[j-1];
                int b = arr[j];

                int val = (a + b) % 10;
                arr[j-1] = val;
            }
            size--;
            if(check(arr, size)) return true;
        }

        return false;
    }

    boolean check(int[] arr, int size)
    {
        if(size <= 1) return false;

        for(int i = 1; i < size; i++) 
        {
            if(arr[i-1] != arr[i]) return false;
        }

        return true;
    }
}