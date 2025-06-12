class Solution {
    public String decodeString(String s) {
        Stack <Character> mystack = new Stack();
        StringBuilder sb = new StringBuilder();
        StringBuilder num = new StringBuilder();

        int start = 0;

        while(start < s.length())
        {
            if(s.charAt(start) != ']')
            {
                mystack.push(s.charAt(start));
            }

            if(s.charAt(start) == ']')
            {
                while(mystack.peek() != '[')
                {
                    sb.insert(0, mystack.pop());
                }
                mystack.pop();
                while(!mystack.isEmpty() && Character.isDigit(mystack.peek()))
                {
                    num.insert(0, mystack.pop());
                }

                String result = sb.toString().repeat(Integer.parseInt(num.toString()));
                sb.setLength(0);
                num.setLength(0);
                for(int i = 0; i < result.length(); i++)
                {
                    mystack.push(result.charAt(i));
                }
            }
            start++;
        }
        sb.setLength(0);
        while(!mystack.isEmpty())
        {
            sb.insert(0, mystack.pop());
        }

        return sb.toString();
    }
}