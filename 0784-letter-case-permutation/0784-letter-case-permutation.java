class Solution {
    public List<String> letterCasePermutation(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();
        permute(result, sb, s, 0);
        return result;
    }

    void permute(List<String> result, StringBuilder sb, String s, int index)
    {
        if(sb.length() == s.length())
        {
            result.add(new String(sb.toString()));
            return;
        }

        
        sb.append(s.charAt(index));
        permute(result, sb, s, index+1);
        sb.deleteCharAt(sb.length() - 1);
        

        if(s.charAt(index) >= 'a' && s.charAt(index) <= 'z')
        {
            char t = (char)(s.charAt(index) - 32);
            sb.append(t);
            permute(result, sb, s, index+1);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(s.charAt(index) >= 'A' && s.charAt(index) <= 'Z')
        {
            char t = (char)(s.charAt(index) + 32);
            sb.append(t);
            permute(result, sb, s, index+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}