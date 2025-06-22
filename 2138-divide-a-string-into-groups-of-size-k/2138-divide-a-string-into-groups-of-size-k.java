class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> result = new ArrayList<>();
        int iter = 0;

        for(int i = 0; i < s.length(); i+=k)
        {
            char[] arr = new char[k];
            Arrays.fill(arr, fill);
            int j = 0;
            while(iter < s.length() && j < k)
            {
                arr[j++] = s.charAt(iter);
                iter++;
            }
            result.add(new String(arr));
        }

        return result.toArray(new String[0]);
    }
}