package by.module3String;

public class Module3E {
    /* Дан текст строка. Найдите наибольшее колличество идущих рядом пробелов в нем. */
    public static void main(String[] args) {
        int max = 0, curmax = 0;
        String text = "Найдите наибольшее   колличество идущих рядом пробелов в тексте.";
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                curmax++;
                if (curmax > max) {
                    max = curmax;
                }
            } else {
                curmax = 0;
            }
        }
        System.out.println("колличество идущих рядом пробелов в тексте: " + max);
    }
}