class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> myhash = new HashMap<>();

        Stack<Integer> mystack = new Stack();

        for(int i = nums2.length - 1; i >= 0; i--)
        {
            while(!mystack.isEmpty() && mystack.peek() <= nums2[i])
            {
                mystack.pop();
            }

            myhash.put(nums2[i], mystack.size() == 0 ? -1 : mystack.peek());
            mystack.push(nums2[i]);
        }

        int[] result = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++)
        {
            result[i] = myhash.get(nums1[i]);
        }

        return result;
    }
}