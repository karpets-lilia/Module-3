package by.module3String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Module3H {
    /*Создать приложение, разбирающее текс(текст хранится в строке) и позволяющее выполнять с текстом
     три различных операции: отсортировать абзацы по колличеству предложений;
     в каждом предложении отсортировать слова по длине;
     отсортировать лексемы в предложении по убыванию колличества вхождений заданного символа,
     а в случае равенства- по алфавиту. */
    public static class RegularExp {

        private static void makeTextOperation(String text) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String start = "- Enter \"1\" for sorting paragraphs by amount of sentences; \n" +
                    "- Enter \"2\" for sorting sentences by long words;\n" +
                    "- Enter \"3\" for sorting leksem by discending \n" +
                    "for end enter \"exit\"\n";
            String choice = "";
            System.out.println(start);
            while (!choice.equalsIgnoreCase("exit")) {
                System.out.print("Enter command: ");
                choice = reader.readLine();
                switch (choice) {
                    case "1":
                        sortParagraphs(text);
                        break;
                    case "2":
                        sortWords(text);
                        break;
                    case "3":
                        sortLexemes(text);
                        break;
                    case "exit":
                        System.out.println("\nOver.");
                        break;
                    default:
                        System.out.println("Incorrect. Please repeat one more time.\n");
                }
            }
        }

        private static void sortParagraphs(String text) {
            String[] paragraphs = text.split("\n");
            int[] counterSentences = new int[paragraphs.length];
            int maxLengthParagraph = 0;
            for (int i = 0; i < paragraphs.length; i++) {
                String[] sentences = splitSentences(paragraphs[i]);
                counterSentences[i] = sentences.length;
                if (maxLengthParagraph < sentences.length) {
                    maxLengthParagraph = sentences.length;
                }
            }
            for (int i = 1; i <= maxLengthParagraph; i++) {
                for (int j = 0; j < counterSentences.length; j++) {
                    if (i == counterSentences[j]) {
                        System.out.println(paragraphs[j]);
                    }
                }
            }
            System.out.println();
        }

        private static void sortWords(String text) {
            String[] paragraphs = text.split("\n");
            for (String paragraph : paragraphs) {
                String[] sentences = splitSentences(paragraph);
                for (String sentence : sentences) {
                    String[] words = splitWords(sentence);

                    for (int k = words.length - 1; k >= 0; k--) {
                        for (int m = 0; m < k; m++) {
                            if (words[m].length() > words[m + 1].length()) {
                                String tmp = words[m];
                                words[m] = words[m + 1];
                                words[m + 1] = tmp;
                            }
                        }
                    }

                    for (String word : words) {
                        System.out.print(word + " ");
                    }
                    System.out.print("\b. ");
                }
                System.out.println();
            }
            System.out.println();
        }

        private static void sortLexemes(String text) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter simbol for sorting leksem by discending: ");
            String letter = reader.readLine();
            String[] paragraphs = text.split("\n");
            for (String paragraph : paragraphs) {
                String[] sentences = splitSentences(paragraph);
                for (String sentence : sentences) {
                    String[] words = splitWords(sentence);

                    for (int k = words.length - 1; k >= 0; k--) {
                        for (int m = 0; m < k; m++) {
                            int countRight = 0;
                            int countLeft = 0;
                            for (int n = 0; n < words[m].length(); n++) {
                                if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                    countLeft++;
                                }
                            }
                            for (int n = 0; n < words[m + 1].length(); n++) {
                                if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                    countRight++;
                                }
                            }
                            if (countLeft < countRight) {
                                String tmp = words[m];
                                words[m] = words[m + 1];
                                words[m + 1] = tmp;
                            } else if (countLeft == countRight) {
                                String[] forCompare = {words[m], words[m + 1]};
                                Arrays.sort(forCompare);
                                words[m] = forCompare[0];
                                words[m + 1] = forCompare[1];
                            }
                        }
                    }
                    for (String word : words) {
                        System.out.print(word + " ");
                    }
                    System.out.print("\b. ");
                }
                System.out.println();
            }
            System.out.println();
        }

        private static String[] splitSentences(String text) {
            Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
            return pattern.split(text);
        }

        private static String[] splitWords(String sentence) {
            Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
            return pattern.split(sentence);
        }

        public static void main(String[] args) throws IOException {
            String text = "The Hello World project is a time-honored tradition in computer programming. It is a simple exercise that gets you started when learning something new. Let’s get started with GitHub!\n" +
                    "\n" +
                    "You’ll learn how to:\n" +
                    "\n" +
                    "Create and use a repository\n" +
                    "Start and manage a new branch\n" +
                    "Make changes to a file and push them to GitHub as commits\n" +
                    "Open and merge a pull request\n" +
                    "\n" +
                    "What is GitHub?\n" +
                    "GitHub is a code hosting platform for version control and collaboration. It lets you and others work together on projects from anywhere.\n" +
                    "\n" +
                    "This tutorial teaches you GitHub essentials like repositories, branches, commits, and Pull Requests. You’ll create your own Hello World repository and learn GitHub’s Pull Request workflow, a popular way to create and review code.\n" +
                    "\n" +
                    "No coding necessary\n" +
                    "To complete this tutorial, you need a GitHub.com account and Internet access. You don’t need to know how to code, use the command line, or install Git (the version control software GitHub is built on).";
            makeTextOperation(text);
        }
    }
}