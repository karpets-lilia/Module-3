package by.module3String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Module3M {
    /*Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например,
     * если было введено "abc cde def",то должно быть выведено "abcdef". */
    public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        String strings = reader.readLine();
        String s = getDeleteSpase(strings);
        System.out.println(removeDuplicates(s));
    }  catch (IOException e) {
        e.printStackTrace();
        }
    }
    private static String removeDuplicates (String s){
    StringBuilder noDupes = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String si = s.substring(i, i + 1);
            if (noDupes.indexOf(si) == -1) {
                noDupes.append(si);
            }
        }
        return noDupes.toString();
    }

    private static String getDeleteSpase(String s){
        String b = s.replaceAll(" ", "");
        return b;
    }
}


