class Solution {
    public int maximum69Number (int num) {
        String val = String.valueOf(num);
        char arr[] = val.toCharArray();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == '6')
            {
                arr[i] = '9';
                break;
            }
        }
        num = Integer.parseInt(new String(arr));
        return num;
    }
}