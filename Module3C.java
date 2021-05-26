package by.module3String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Module3C {
    /*В строке найти колличество чисел*/
    public static void main(String[] args) {
        String str = "В строке 1 найти 23 к0лличество  чисе1";
        Pattern p = Pattern.compile("(^|\\s)\\d+(\\s|$)");
        Matcher m = p.matcher(str);
        int numberCount = 0;
        while (m.find()) {
            numberCount++;
        }
        System.out.println(Integer.toString(numberCount));
    }
}
