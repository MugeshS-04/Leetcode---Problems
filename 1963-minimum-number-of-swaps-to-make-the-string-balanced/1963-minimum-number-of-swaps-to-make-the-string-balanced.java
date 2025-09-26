class Solution {
    public int minSwaps(String s) {
        char[] arr = s.toCharArray();
        int en = arr.length - 1;

        int bal = 0;
        int count = 0;

        for(int st = 0; st < s.length(); st++)
        {
            if(st >= en) break;

            if(arr[st] == '[')
            {
                bal++;
            }

            if(arr[st] == ']')
            {
                if(bal - 1 >= 0)
                {
                    bal--;
                }
                else
                {
                    while(en > st && arr[en] == ']')
                    {
                        en--;
                    }

                    arr[st] = '[';
                    arr[en] = ']';
                    en--;
                    count++;
                    bal++;

                    // System.out.print(st +" "+ en +" ---> ");

                    // for(int i = 0; i < arr.length; i++)
                    // {
                    //     System.out.print(arr[i]+" ");
                    // }

                    // System.out.println();
                }
            }
            
        }

        return count;
    }

    boolean balance(char[] arr)
    {
        Stack<Character> mystack = new Stack<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == '[')
            {
                mystack.push(arr[i]);
            }
            else
            {
                if(mystack.isEmpty()) return false;
                else mystack.pop();
            }
        }

        return mystack.isEmpty();
    }
}