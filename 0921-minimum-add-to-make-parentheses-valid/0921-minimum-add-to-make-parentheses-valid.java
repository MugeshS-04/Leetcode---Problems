class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> mystack = new Stack<>();
        int count = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                mystack.push(s.charAt(i));
            }
            else
            {
                if(mystack.isEmpty()) count++;
                else mystack.pop();
            }
        }

        return count + mystack.size();
    }
}