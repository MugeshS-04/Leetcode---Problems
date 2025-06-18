class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        StringBuilder mystr = new StringBuilder();
        combinations(result, n, mystr, 0, 0);
        return result;
    }

    public void combinations(List<String> result, int n, StringBuilder mystr, int open_count, int close_count)
    {
        if(mystr.length() == n+n)
        {
            result.add(mystr.toString());
            return;
        }
  
        if(open_count < n)
        {
            mystr.append('(');
            combinations(result, n, mystr, open_count+1, close_count);
            mystr.deleteCharAt(mystr.length()-1);
        }
            
        if(close_count < open_count)
        {
            mystr.append(')');
            combinations(result, n, mystr, open_count, close_count+1);
            mystr.deleteCharAt(mystr.length()-1);
        }   
         
    }      
}