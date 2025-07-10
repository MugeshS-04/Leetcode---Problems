class Solution {
    public int countSegments(String s) {

        s = s.trim();
        
        int count = 0;

        if(s.length() == 0)
        {
            return 0;
        }

        String[] words = s.split("\\s+");

        return words.length;
    }
}