class Solution {
    public int myAtoi(String s) {
        
        //triming leading and trailing spaces
        int i = 0;
        int j = s.length() - 1;

        while(s.charAt(i) == ' ')
        {
            i++;
        }


        while(s.charAt(j) == ' ')
        {
            j--;
        }

        StringBuilder sb = new StringBuilder();

        for(int index = i; index <= j; index++)
        {
            if(index == i && s.charAt(index) == '-')
            {
                sb.append('-');
                int temp_index = index+1;
                while(s.charAt(temp_index) == '0')
                {
                    temp_index++;
                }

                index = temp_index;
            }
            else if(s.charAt(index) == '-')
            {
                break;
            }

            if(Character.isDigit(s.charAt(index)))
            {
                sb.append(s.charAt(index));
            }

            if(Character.isLetter(s.charAt(index)))
            {
                break;
            }
        }

        System.out.print(sb);

        int result = 0;

        if(sb.length() > 0)
        {
            result = Integer.parseInt(sb.toString());
        }

        return result;
    }
}