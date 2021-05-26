package by.module3String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Module3D {
    /*Удалить в строке все лишние пробелы, тоесть серии подряд идущих пробелов заменить на одиночные пробелы.
     * Крайние пробелы в строке удалить.*/
    public static void main(String[] args) {
        String str = " Удалить         в  строке  все        лишние  пробелы. ";
        System.out.println(str.replaceAll("( +)", " ").trim());
    }
}
