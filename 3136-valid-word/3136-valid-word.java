class Solution {
    public boolean isValid(String word) {
        HashSet <Character> myhash = new HashSet<>();

        myhash.add('a');
        myhash.add('e');
        myhash.add('i');
        myhash.add('o');
        myhash.add('u');
        myhash.add('A');
        myhash.add('E');
        myhash.add('I');
        myhash.add('O');
        myhash.add('U');
        
        if(word.length() < 3)
        {
            return false;
        }

        boolean cons = false;
        boolean vowel = false;

        for(int i = 0; i < word.length(); i++)
        {
            if(!Character.isLetterOrDigit(word.charAt(i)))
            {
                return false;
            }

            if(!myhash.contains(word.charAt(i)) && !Character.isDigit(word.charAt(i)))
            {
                cons = true;
            }

            if(myhash.contains(word.charAt(i)))
            {
                vowel = true;
            }
        }

        if(cons == true && vowel == true)
        {
            return true;
        }

        return false;
    }
}