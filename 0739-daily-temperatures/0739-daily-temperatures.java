class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack <Integer> mystack = new Stack();

        int result[] = new int[temp.length];

        for(int i = temp.length-1; i>=0; i--)
        {
            while(!mystack.isEmpty() && temp[i] >= temp[mystack.peek()])
            {
                mystack.pop();
            }

            if(!mystack.isEmpty())
            {
                result[i] = mystack.peek() - i;
            }

            mystack.push(i);
        }

        return result;
    }
}