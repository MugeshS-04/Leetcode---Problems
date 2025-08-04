class Solution {
    public int totalFruit(int[] fruits) {
        int count = 0;
        int fruit_count = 0;
        int max = 0;

        int end = 0;
        int start = 0;

        HashSet <Integer> myhash = new HashSet<>();

        while(end < fruits.length)
        {
            if(!myhash.contains(fruits[end]))
            {
                if(fruit_count < 2)
                {
                    fruit_count++;
                    count++;
                    myhash.add(fruits[end]);
                    end++;
                }
                else
                {
                    max = Math.max(max, count);
                    fruit_count--;
                    start = end - 1;
                    count = 0;
                    while(start >= 0 && fruits[start] == fruits[end - 1])
                    {
                        count++;
                        start--;
                    }
                    myhash.remove(fruits[start]);
                    start++;
                }
            }
            else
            {
                count++;
                end++;
            }
        }


        //max = Math.max(count, max);

        return max >= count ? max : count;   
    }
}