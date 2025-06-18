class Solution {
    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) return new ArrayList();

        HashMap <Character, String> myhash = new HashMap<>();
        myhash.put('2', "abc"); 
        myhash.put('3', "def"); 
        myhash.put('4', "ghi"); 
        myhash.put('5', "jkl"); 
        myhash.put('6', "mno"); 
        myhash.put('7', "pqrs"); 
        myhash.put('8', "tuv"); 
        myhash.put('9', "wxyz");

        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList();

        combinate(result, myhash, digits, sb, 0); 

        return result;
    }

    void combinate(List<String> result, HashMap <Character, String> myhash, String digits, StringBuilder sb, int index)
    {
        if(sb.length() == digits.length())
        {
            result.add(new String(sb.toString()));
            return;
        }

        char digit = digits.charAt(index);
        String letters = myhash.get(digit);

        for(char l : letters.toCharArray())
        {
            sb.append(l);
            combinate(result, myhash, digits, sb, index+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}