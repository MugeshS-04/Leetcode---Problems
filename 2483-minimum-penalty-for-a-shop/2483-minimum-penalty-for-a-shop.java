class Solution {
    public int bestClosingTime(String customers) {
        int[] prefix1 = new int[customers.length()];
        int[] prefix2 = new int[customers.length()];

        prefix1[0] = customers.charAt(0) == 'Y'? 1 : 0;
        prefix2[0] = customers.charAt(0) == 'N'? 1 : 0;

        for(int i = 1; i < customers.length(); i++)
        {
            prefix1[i] += (customers.charAt(i) == 'Y'? 1 : 0) + prefix1[i-1];
            prefix2[i] += (customers.charAt(i) == 'N'? 1 : 0) + prefix2[i-1];

        }

        int total = prefix1[prefix1.length-1];
        int best = -1;
        int min_pen = Integer.MAX_VALUE;

        for(int i = 0; i <= prefix1.length; i++)
        {
            int pen;
            if(i == 0) pen = total;
            else{
                int before = prefix2[i-1];
                int after = total - prefix1[i-1];
                pen = before + after;
            }

            if(pen < min_pen)
            {
                min_pen = pen;
                best = i;
            }
        }

        return best;
    }
}