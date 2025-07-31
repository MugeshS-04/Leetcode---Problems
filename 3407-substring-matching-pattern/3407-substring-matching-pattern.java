class Solution {
    public boolean hasMatch(String s, String p) {

        if(p.equals("*"))
        {
            return true;
        }

        int start = p.indexOf('*')-1;
        int end = p.indexOf('*') + 1;

        String pre = p.substring(0 , start+1);
        String suf = p.substring(end, p.length());

        int begin = s.indexOf(pre);
        int last = s.lastIndexOf(suf);

        if(s.contains(pre) && suf.equals("") || s.contains(suf) && pre.equals("") || s.contains(pre + suf))
        {
            return true;
        }

        if(!s.contains(pre) || !s.contains(suf))
        {
            return false;
        }

        for (int i = 0; i <= s.length() - pre.length() - suf.length(); i++) {
            
            if (s.startsWith(pre, i)) {
            
                for (int j = i + pre.length(); j <= s.length() - suf.length(); j++) {
                    if (s.startsWith(suf, j)) {
                        return true; 
                    }
                }
            }
        }

        return false;

    }
}