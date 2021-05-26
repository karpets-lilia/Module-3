package by.module3String;

public class Module3A {
    /*Замените  в строке все вхождения 'word' на 'letter'.*/
    public static void main(String[] args) {

        String oldString = "Some delegations expressed the view that rather than negotiating a text word for word.";
        String newString =  oldString.replace("word", "letter");

        System.out.println("Old string: " + oldString);
        System.out.println("New string: " + newString);
    }
}

