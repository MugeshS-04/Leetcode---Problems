class Solution {
    public boolean canFinish(int num, int[][] pre) {
        int[] ind = new int[num];
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < num; i++)
        {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < pre.length; i++)
        {
            int pr = pre[i][1];
            int c = pre[i][0];
            graph.get(pr).add(c);
            ind[c]++;
        }

        int finish = 0;
        Queue<Integer> myq = new LinkedList<>();

        for(int i = 0; i < num; i++)
        {
            if(ind[i] == 0) myq.add(i);
        }

        while(!myq.isEmpty())
        {
            int course = myq.poll();

            finish++;

            for(int next : graph.get(course))
            {
                ind[next]--;
                if(ind[next] == 0)
                {
                    myq.add(next);
                }
            }
        }

        return finish == num;
    }
}