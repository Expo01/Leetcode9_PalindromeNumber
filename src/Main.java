public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}

// my solution, read and solved in ~ 5 minutes. easy peasy for once
class Solution {
    public boolean isPalindrome(int x) {
        char[] c = Integer.toString(x).toCharArray();
        int start = 0;
        int end = c.length - 1;
        while (start < end) {
            if (c[start] != c[end]) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}