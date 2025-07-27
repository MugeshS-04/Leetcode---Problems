class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> mystack = new Stack();

        int start = 0;

        while(start < s.length())
        {
            if(!mystack.isEmpty() && mystack.peek() == s.charAt(start))
            {
                mystack.pop();
            }
            else
            {
                mystack.push(s.charAt(start));
            }

            start++;
        }

        StringBuilder sb = new StringBuilder();

        while(!mystack.isEmpty())
        {
            sb.insert(0, mystack.pop());
        }

        return sb.toString();
    }
}