public class Solution {
    public int MaxFreqSum(string s) {
        String vowel = "aeiou";

        Dictionary<char, int> myhash = new Dictionary<char, int>();

        for(int i = 0; i < s.Length; i++)
        {
            myhash[s[i]] = myhash.GetValueOrDefault(s[i], 0)+1;
        }

        int max_vowel = 0;
        int max_cons = 0;

        foreach(var v in myhash)
        {
            char val = v.Key;
            int c = v.Value;

            if(vowel.Contains(val))
            {
                if(c > max_vowel)
                {
                    max_vowel = c;
                }
            }
            else
            {
                if(c > max_cons)
                {
                    max_cons = c;
                }
            }
        }

        return max_cons + max_vowel;
    }
}