import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word1, word2, word3;

        System.out.print("Enter word 1: ");
        word1 = input.nextLine();

        System.out.print("Enter word 2: ");
        word2 = input.nextLine();

        System.out.print("Enter word 3: ");
        word3 = input.nextLine();

        System.out.println("\nYour three words are:");
        System.out.println(word1 + " " + word2 + " " + word3);

        input.close();
    }
}
