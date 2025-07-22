class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> mylist = new ArrayList();
        
        PriorityQueue<Integer> myq = new PriorityQueue<>((a, b) -> {
                    int diff = Math.abs(a - x) - Math.abs(b - x);
                    if (diff == 0) return a - b;
                    return diff; 
                    });

        for(int i = 0; i < arr.length; i++)
        {
            myq.add(arr[i]);
        }

        int i = 0;

        while(!myq.isEmpty() && i < k)
        {
            mylist.add(myq.poll());
            i++;
        }

        Collections.sort(mylist);

        return mylist;

    }
}