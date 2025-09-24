class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[5];

        for(int i = 0; i < text.length(); i++)
        {
            char t = text.charAt(i);

            if(t == 'b') freq[0]++;
            else if(t == 'a') freq[1]++;
            else if(t == 'l') freq[2]++;
            else if(t == 'o') freq[3]++;
            else if(t == 'n') freq[4]++;
        }

        if(check(freq) == false) return 0;

        boolean cond = true;
        int count = 0;

        while(cond)
        {
            freq[0]--;
            freq[1]--;
            freq[2]-= 2;
            freq[3]-= 2;
            freq[4]--;
            if(check(freq))
            {
                count++;
            }
            else
            {
                return count+1;
            }
        }

        return 0;
    }

    boolean check(int[] freq)
    {
        for(int i = 0; i < 5; i++)
        {
            if(freq[i] == 0) return false;
        }
        return true;
    }
}