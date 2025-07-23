class Solution {
    public int maximumGain(String s, int x, int y) {
        int count[] = new int[1];

        if(y > x)
        {
            //count for ba
            String temp = count_ba(s, y, count);

            System.out.print(temp+" ");

            //count for ab
            s = count_ab(temp, x, count);
        }
        else
        {
            //count for ab
            String temp = count_ab(s, x, count);

            //count for ba
            s = count_ba(temp, y, count);
        }


        return count[0];
    }

    String count_ba(String s, int y, int[] count)
    {
        StringBuilder sb = new StringBuilder();
        Stack <Character> mystack = new Stack();


        if(s.length() == 0)
        {
            return s;
        }
        mystack.push(s.charAt(0));
        int start = 1;

        while(start < s.length())
        {
            if(!mystack.isEmpty() && mystack.peek() == 'b' && s.charAt(start) == 'a')
            {
                //System.out.print(start+" ");
                mystack.pop();
                //System.out.println(mystack.peek()+" ");
                count[0] += y;
                start++;
                continue;
            }
            mystack.push(s.charAt(start));
            start++;
        }


        while(!mystack.isEmpty())
        {
            sb.insert(0, mystack.pop());
        }
        //System.out.print(sb);

        return sb.toString();
    }

    String count_ab(String s, int x, int[] count)
    {
        StringBuilder sb = new StringBuilder();
        Stack <Character> mystack = new Stack();

        if(s.length() == 0)
        {
            return s;
        }

        mystack.push(s.charAt(0));
        int start = 1;

        while(start < s.length())
        {
            if(!mystack.isEmpty() && mystack.peek() == 'a' && s.charAt(start) == 'b')
            {
                mystack.pop();
                count[0]+=x;
                start++;
                continue;
            }
            mystack.push(s.charAt(start));
            start++;
        }

        while(!mystack.isEmpty())
        {
            sb.insert(0, mystack.pop());
        }

        System.out.print(sb);

        return sb.toString();
    }
}