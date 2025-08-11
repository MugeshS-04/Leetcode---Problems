class Solution {
    public boolean reorderedPowerOf2(int n) {
        String val = String.valueOf(n);
        char[] arr = val.toCharArray();
        Arrays.sort(arr);
        val = new String(arr);

        int nr = 1;

        if(n == nr)
        {
            return true;
        }

        for(int i = 1; i < 31; i++)
        {
            nr *= 2;
            String temp = String.valueOf(nr);
            arr = temp.toCharArray();
            Arrays.sort(arr);
            temp = new String(arr); 
            if(temp.equals(val))
            {
                return true;
            }
        }
        
        return false;
    }
}