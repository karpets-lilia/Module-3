package by.module3String;

public class Module3B {
    /*В строке найти количество цифр*/
    public static void main(String[] args) {
        int count = 0;
        String str = "В строке 1 найти кол1ичество циф4р";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("цифр в строке " + count);
    }
}
