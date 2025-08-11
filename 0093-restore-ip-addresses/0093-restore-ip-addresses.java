class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        restore(s, result, new ArrayList(), 0);
        return result;
    }

    void restore(String s, List<String> result, List<String> parts, int index)
    {
        if(parts.size() == 4 && index == s.length())
        {
            result.add(String.join(".", parts));
            return;
        }


        if(parts.size() >= 4)
        {
            return;
        }

        for(int len = 1; len <= 3 && len + index <= s.length(); len++)
        {
            String part = s.substring(index, index + len);

            if(part.startsWith("0") && part.length() > 1) continue;

            int val = Integer.parseInt(part);

            if(val <= 255)
            {
                parts.add(part);
                restore(s, result, parts, index+len);
                parts.remove(parts.size() - 1);
            }
        }
    }
}