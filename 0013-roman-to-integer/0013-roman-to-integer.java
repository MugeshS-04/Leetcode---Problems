class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> myhash = new HashMap<>();

        myhash.put('I', 1);
        myhash.put('V', 5);
        myhash.put('X', 10);
        myhash.put('L', 50);
        myhash.put('C', 100);
        myhash.put('D', 500);
        myhash.put('M', 1000);

        int result = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'I' && i+1 < s.length() && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'))
            {
               result += myhash.get(s.charAt(i+1)) - 1;
               i++;
            }
            else if(s.charAt(i) == 'X' && i+1 < s.length() && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'))
            {
               result += myhash.get(s.charAt(i+1)) - 10;
               i++;
            }
            else if(s.charAt(i) == 'C' && i+1 < s.length() && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))
            {
               result += myhash.get(s.charAt(i+1)) - 100;
               i++;
            }
            else
            {
                result += myhash.get(s.charAt(i));
            }
        }

        return result;
    }
}