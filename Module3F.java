package by.module3String;

public class Module3F {
    /*В строке вставить после каждого символа 'a' символ 'b'*/
    public static void main(String args[]) {
        String text = new String("Java is a popular programming language, created in 1995.");
        System.out.println(putSymbolAfter(text, "a", "b"));
    }
    public static String putSymbolAfter(String text, String symbolBefore, String symbolAfter) {
        return text.replaceAll(symbolBefore, symbolBefore + symbolAfter);
    }
}

