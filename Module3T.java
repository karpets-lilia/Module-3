package by.module3String;

public class Module3T {
    /*Подсчитать, сколько раз среди символов заданной строки встречается буква "a".*/
    public static void main(String[] args) {
        String t1 = "сколько раз среди символов заданной строки встречается буква а";
        String t2 = "а";
        System.out.println(count(t1, t2));
    }
    public static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }
}
