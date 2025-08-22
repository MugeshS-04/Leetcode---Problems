class Solution {
    public int findMinMoves(int[] machines) {
        int count = 0;

        for(int i = 0; i < machines.length; i++)
        {
            count+=machines[i];
        }

        if(count % machines.length == 0)
        {
            int valid_count = count / machines.length;
            int diff_load = 0;
            int max = 0;

            for(int load : machines)
            {
                int diff = load - valid_count;

                diff_load += diff;

                max = Math.max(max, Math.max(Math.abs(diff_load), diff));
            }

            return max;
        }
        else
        {
            return -1;
        }
    }
}