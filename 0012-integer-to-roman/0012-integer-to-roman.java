class Solution {
    public String intToRoman(int num) {
        HashMap <Integer, String> myhash = new HashMap<>();

        myhash.put(1, "I");
        myhash.put(4, "IV");
        myhash.put(5, "V");
        myhash.put(9, "IX");
        myhash.put(10, "X");
        myhash.put(40, "XL");
        myhash.put(50, "L");
        myhash.put(90, "XC");
        myhash.put(100, "C");
        myhash.put(400, "CD");
        myhash.put(500, "D");
        myhash.put(900, "CM");
        myhash.put(1000, "M");

        String res = "";
    

        int[] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < arr.length; i++) {
            
            while (num >= arr[i]) { 
                res += myhash.get(arr[i]);
                num -= arr[i];
            }
        }


        return res;
    }
}