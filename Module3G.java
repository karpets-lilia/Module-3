package by.module3String;

public class Module3G {
    /*Проверить является ли данное слово полиндромом*/
    public static void main(String args[]) {
        String str = "12321";
        System.out.println(isPalindrome(str));
    }
    public static Boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}
