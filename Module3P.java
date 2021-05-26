package by.module3String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Module3P {
    /*Посчитать количествострочных (маленьких) и прописных (больших) букв в введенной строке. Учитывать
    * только английские буквы. */
    public static void main(String[] args) {
       String s = "One Two Three";
            int upperCase = 0;
            int lowerCase = 0;
            for (int k = 0; k < s.length(); k++) {
                if (Character.isUpperCase(s.charAt(k))) {
                    upperCase++;
                }
                if (Character.isLowerCase(s.charAt(k))) {
                    lowerCase++;
                }
            }
        System.out.printf("Всего %d заглавных букв и %d прописных.",upperCase,lowerCase);
        }
    }
