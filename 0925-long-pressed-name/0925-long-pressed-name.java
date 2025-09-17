class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int p1 = 0, p2 = 0;

        while (p2 < typed.length()) {
            if (p1 < name.length() && name.charAt(p1) == typed.charAt(p2)) {
                // Match current char
                p1++;
                p2++;
            } else if (p1 > 0 && typed.charAt(p2) == name.charAt(p1 - 1)) {
                // Long press of previous char
                p2++;
            } else {
                // Invalid extra character
                return false;
            }
        }

        return p1 == name.length();

    }
}