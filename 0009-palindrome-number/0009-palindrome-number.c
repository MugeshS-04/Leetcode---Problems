bool isPalindrome(int x) {
    // Negative numbers are not palindromes
    if (x < 0 || (x % 10 == 0 && x != 0))
        return false;
    
    int reversed = 0;
    int original = x;

    while (x > reversed) {
        reversed = reversed * 10 + x % 10;
        x /= 10;
    }

    // If the number of digits in x is odd, we need to remove the middle digit
    // from reversed to compare properly
    return x == reversed || x == reversed / 10;
}