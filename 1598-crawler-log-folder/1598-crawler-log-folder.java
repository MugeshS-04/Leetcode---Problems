class Solution {
    public int minOperations(String[] logs) {
        Stack <String> mystack = new Stack();

        for(String word : logs)
        {
            if(word.equals("../"))
            {
                if(!mystack.isEmpty()) mystack.pop();
            }
            else
            {
                if(!word.equals("./")) mystack.push(word);
            }
        }

        return mystack.size();
    }
}