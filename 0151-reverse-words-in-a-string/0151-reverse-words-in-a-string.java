class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        int start = 0;
        int end = s.length()-1;

        while(s.charAt(start) == ' ')
        {
            start++;
        }
        while(s.charAt(end) == ' ')
        {
            end--;
        }

        int temp = end;
        boolean flag = false;

        while(start <= end)
        {
           if(s.charAt(end) == ' ' && flag == true)
           {
                sb.append(s.substring(end+1, temp+1));
                sb.append(" ");
                flag = false;
                temp = end-1;
           }
           else if(s.charAt(end) == ' ')
           {
                temp = end-1;
           }
           else
           {
                flag = true;
           }
           end--;
        }
        sb.append(s.substring(end+1, temp+1));

        return sb.toString();
    }
}