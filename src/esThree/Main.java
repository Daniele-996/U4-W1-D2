package esThree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text;

        while (true) {
            System.out.println("Inserisci una frase a piacere o :q per terminare");
            text = scan.nextLine();

            if (text.equals(":q")) {
                break;
            }

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                result.append(text.charAt(i));
                if (i < text.length() - 1) {
                    result.append(",");
                }
            }

            System.out.println("Output: " + result.toString());
        }

        scan.close();
    }
}
