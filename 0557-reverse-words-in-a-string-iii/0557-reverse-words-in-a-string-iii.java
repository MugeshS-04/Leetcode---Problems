class Solution {
    public String reverseWords(String s) {
        StringBuilder sc = new StringBuilder();
        String result = new String();
        boolean flag = true;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ' && flag)
            {
                result = result + sc.toString();
                sc.setLength(0);
                flag = false;
            }
            else if(s.charAt(i) == ' ' )
            {
                result = result +" "+ sc.toString();
                sc.setLength(0);
            }
            else
            {
                sc.insert(0, s.charAt(i));
            }
        }

        if(!flag) result = result + " " + sc.toString();
        else result = result +  sc.toString();

        return result;
    }
}