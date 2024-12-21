public class palindrome {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "katak";
        boolean isPalindrome = isPalindrome(str, 0, str.length() - 1);
        if (isPalindrome) {
            System.out.println(str + " adalah palindrome");
        } else {
            System.out.println(str + " bukan palindrome");
        }
    }
}