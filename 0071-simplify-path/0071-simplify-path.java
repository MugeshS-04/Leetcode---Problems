class Solution {
    public String simplifyPath(String path) {
        Stack <String> mystack = new Stack();

        String[] dir = path.split("/");

        for(String word : dir)
        {
            if(word.equals(".."))
            {
                if(!mystack.isEmpty())
                    mystack.pop();
            }
            else if(word.equals(".") || word.equals(""))
            {
                continue;
            }
            else
            {
                mystack.push(word);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!mystack.isEmpty())
        {
            sb.insert(0, "/"+mystack.pop());
        }

        return sb.length() > 0 ? sb.toString() : "/";
    }
}