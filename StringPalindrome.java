public class StringPalindrome {
    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String str = "sanya";
 
        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}