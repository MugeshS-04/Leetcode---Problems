class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        int index = 0;
        List<int[]> mylist = new ArrayList<>();

        while(index < intervals.length)
        {
            int start = intervals[index][0];
            int cur = intervals[index][1];

            while(index < intervals.length && cur >= intervals[index][0])
            {
                cur = Math.max(cur, intervals[index][1]);
                index++;
            }

            int end = cur;
    
            mylist.add(new int[]{start, end});
        }

        index = 0;

        int result[][] = new int[mylist.size()][2];

        for(int[] val : mylist)
        {
            result[index] = val;
            index++;
        }

        return result;
    }
}