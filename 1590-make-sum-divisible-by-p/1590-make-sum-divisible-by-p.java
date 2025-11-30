class Solution {
    public int minSubarray(int[] nums, int p) {
        int tot = 0;
        for(int i = 0; i < nums.length; i++)
        {
            tot = (tot + nums[i]) % p;
        }

        if(tot == 0)
        {
            return 0;
        }

        HashMap <Integer, Integer> myhash = new HashMap();
        int rem = tot;
        int result = 0;
        int min1 = nums.length;
        int con = 0;
        int need = 0;
        myhash.put(0, -1);
        for(int i = 0; i < nums.length; i++)
        {
            con = (nums[i] + con) % p;

            need = (con - rem + p) % p;

            if(myhash.containsKey(need))
            {
                result = i - myhash.get(need);

                min1 = Math.min(min1, result); 
            }

            myhash.put(con, i);

        }

        return min1 == nums.length ? -1 : min1;
    }
}
