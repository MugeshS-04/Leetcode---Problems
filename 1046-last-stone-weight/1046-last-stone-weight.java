class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> myq = new PriorityQueue<>((a,b) -> b - a);

        for(int i = 0; i < stones.length; i++)
        {
            myq.add(stones[i]);
        }

        while(!myq.isEmpty())
        {
            if(myq.size() == 1)
            {
                return myq.poll();
            }
            

            int val1 = myq.poll();
            int val2 = myq.poll();

            if(val1 == val2)
            {
                continue;
            }
            else if(val1 < val2)
            {
                myq.add(val2 - val1);
            }
            else
            {
                myq.add(val1 - val2);
            }
        }

        return 10;
    }
}