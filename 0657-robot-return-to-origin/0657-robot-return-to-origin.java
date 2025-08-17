class Solution {
    public boolean judgeCircle(String moves) {
        int hor = 0;
        int ver = 0;

        for(int i = 0; i < moves.length(); i++)
        {
            char ch = moves.charAt(i);
            if(ch == 'U') ver++;
            else if(ch == 'D') ver--;
            else if(ch == 'L') hor++;
            else hor--;
        }

        return hor == 0 && ver == 0 ? true : false;
    }
}