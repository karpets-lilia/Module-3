package by.module3String;

public class Module3L {
    /*Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
    * Случай когда самых длинных слов несколько не обрабатывать.*/
    public static void main(String args[]) {
        String somestring = "one two three four five";
        System.out.println(max(somestring));
    }

    private static String max(String s) {
        String[] words = s.split(" ");
        String string = "";
        for(String word: words) {
            if(word.length() > string.length())
                string = word;
        }
        return(string);
    }
}


