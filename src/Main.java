import java.util.Scanner;

public class Main {

    private static String word;
    private static String hiddenWord = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv ett ord");
        word = scanner.next();
        for (int i = 0; i < word.length(); i++){
            hiddenWord = hiddenWord + "_";
        }
        for (int i = 0; i < 11; i++){
            System.out.println(hiddenWord);

        }
    }
    public static void showWord(){
        char[] wordArray = word.toCharArray();

    }
}