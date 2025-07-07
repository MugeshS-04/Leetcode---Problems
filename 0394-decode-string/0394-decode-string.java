class Solution {
    public String decodeString(String s) {

        Stack <Character> mystack = new Stack();

        int start = 0;

        while(start < s.length())
        {
            if(s.charAt(start) != ']')
            {
                mystack.push(s.charAt(start));
            }

            if(s.charAt(start) == ']')
            {
                StringBuilder sb = new StringBuilder();
                StringBuilder num = new StringBuilder();

                while(mystack.peek() != '[')
                {
                    sb.insert(0, mystack.pop());
                }

                mystack.pop();

                while(!mystack.isEmpty() && Character.isDigit(mystack.peek()))
                {
                    num.insert(0, mystack.pop());
                }

                int rep = Integer.parseInt(new String(num));

                String obtained = sb.toString().repeat(rep);

                for(int i = 0; i < obtained.length(); i++)
                {
                    mystack.push(obtained.charAt(i));
                }
            }

            start++;
        }

        StringBuilder result = new StringBuilder();

        while(!mystack.isEmpty())
        {
            result.insert(0, mystack.pop());
        }

        return result.toString();
    }
}