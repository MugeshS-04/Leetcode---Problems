class Solution {
    public String removeDuplicateLetters(String s) {
       Stack<Character> mystack = new Stack<>();

       boolean check[] = new boolean[26];
       int lastindex[] = new int[26];

       for(int i = 0; i < s.length(); i++)
       {
            lastindex[s.charAt(i) - 'a'] = i;
       }

       for(int i = 0; i < s.length(); i++)
       {
            int index = s.charAt(i) - 'a';

            if(check[index])
            {
                continue;
            }

            while(!mystack.isEmpty() && mystack.peek() > s.charAt(i) && i < lastindex[mystack.peek() - 'a'])
            {
                check[mystack.peek() - 'a'] = false;
                mystack.pop();
            }
            mystack.push(s.charAt(i));
            check[s.charAt(i) - 'a'] = true;
       }

       StringBuilder sb = new StringBuilder ();

       while(!mystack.isEmpty())
       {
        sb.insert(0, mystack.pop());
       }

       return sb.toString();
    }
}