class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack <Integer> mystack = new Stack();
        int arr[] = new int[temp.length];
        arr[temp.length-1] = 0;
        for(int i = temp.length-1; i >=0; i--)
        {
            while(!mystack.isEmpty() && temp[i] >= temp[mystack.peek()])
            {
                mystack.pop();
            }
            if(!mystack.isEmpty())
            {
                arr[i] = mystack.peek() - i;
            }
            mystack.push(i);
        }

        return arr;
    }
}