class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        int i = 0;

        String[] temp = new String[strs.length];
        boolean[] check = new boolean[strs.length];

        for(String val : strs)
        {
            char[] arr = val.toCharArray();
            Arrays.sort(arr);
            temp[i] = new String(arr);
            i++;
        }

        int start = 0;

        while(start < strs.length)
        {
            String word = temp[start];
            List<String> mylist = new ArrayList();
            System.out.print(word);

            for(i = start; i < strs.length; i++)
            {
                if(word.equals(temp[i]) && check[i] == false)
                {
                    mylist.add(strs[i]);
                    check[i] = true;
                }
            }

            if(mylist.size() != 0)
            {
                result.add(new ArrayList(mylist));
            }

            start++;
        }

        return result;
    }
}