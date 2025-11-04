class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        StringBuilder sb = new StringBuilder();
        generate(result, sb, n, 0, 0);
        return result;
    }

    void generate(List<String> result, StringBuilder sb, int n, int opencount, int closecount)
    {
        if(opencount == closecount && opencount == n)
        {
            result.add(new String(sb.toString()));
            return;
        }

        if(opencount < n)
        {
            sb.append('(');
            generate(result, sb, n, opencount+1, closecount);
            sb.deleteCharAt(sb.length()-1);
        }

        if(opencount > closecount)
        {
            sb.append(')');
            generate(result, sb, n, opencount, closecount+ 1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}