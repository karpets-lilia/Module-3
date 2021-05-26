package by.module3String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Module3U {
    /*Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным знаком
    * или вопросительным знаком. Определить количество предложений в строке X. */
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            int s = getСountSentence(strings);
            System.out.println(s);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static int getСountSentence(String X){
        int count = 0;
        String pattern = "([.!?])([\\s\\n])([A-Z]*)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(X);
        while (m.find( )) {
            count++;
        }
        count++;
        return count;
    }
}
