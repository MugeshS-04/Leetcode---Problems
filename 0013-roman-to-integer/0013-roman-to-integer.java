class Solution {
    public int romanToInt(String s) {

        int result = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'I' && i+1 < s.length() && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'))
            {
                if(s.charAt(i+1) == 'V') result += 4;
                else result += 9;
                i++;
            }
            else if(s.charAt(i) == 'X' && i+1 < s.length() && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'))
            {
                if(s.charAt(i+1) == 'L') result += 40;
                else result += 90;
                i++;
            }
            else if(s.charAt(i) == 'C' && i+1 < s.length() && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))
            {
                if(s.charAt(i+1) == 'D') result += 400;
                else result += 900;
                i++;
            }
            else
            {
                switch(s.charAt(i))
                {
                    case 'I':
                        result+=1;
                        break;
                    case 'V':
                        result+=5;
                        break;
                    case 'X':
                        result+=10;
                        break;
                    case 'L':
                        result+=50;
                        break;
                    case 'C':
                        result+=100;
                        break;
                    case 'D':
                        result+=500;
                        break;
                    case 'M':
                        result+=1000;
                        break;
                }
            }
        }

        return result;
    }
}