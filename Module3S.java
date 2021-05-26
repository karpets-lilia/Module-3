package by.module3String;

public class Module3S {
    /*с помощью функции копирования и операции конкатенации составить
     из частей слова "информатика" слово "торт"*/
    public static void main(String[] args) {
        String str = "информатика";
        char[] chars = new char[4];
        str.getChars(7, 8, chars, 0);
        str.getChars(3, 4, chars, 1);
        str.getChars(4, 5, chars, 2);
        str.getChars(7, 8, chars, 3);
        String newWord = "";
        for (char ch : chars) {
            newWord.concat(String.valueOf(ch));
        }
        System.out.println(String.valueOf(chars));
    }
}