package org.example;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome vp = new Palindrome();
        System.out.println(vp.isPalindrome("ab c d e da;da,"));
        System.out.println(vp.isPalindrome(":a b, cde,dc,ba,"));
        System.out.println(vp.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(vp.isPalindrome("0P"));

    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
