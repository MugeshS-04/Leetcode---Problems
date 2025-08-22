class Solution {
    public int longestValidParentheses(String s) {
      Stack <Integer> mystack = new Stack<Integer>();
      int max = 0;
      mystack.push(-1);
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c == '(')
            {
                mystack.push(i);
            }
            else
            {
                mystack.pop();
                if(mystack.isEmpty())
                {
                    mystack.push(i);
                }
                else
                {
                    int len = i - mystack.peek();
                    max = Math.max(max,len);
                }
            }
        }
        return max;
      }
       
    }
   