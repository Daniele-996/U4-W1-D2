package esTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero compreso tra 0 e 3");
        int num = scan.nextInt();
        switch (num) {
            case 0:
                System.out.println("Il numero è: zero");
                break;
            case 1:
                System.out.println("Il numero è: uno");
                break;
            case 2:
                System.out.println("Il numero è: due");
                break;
            case 3:
                System.out.println("Il numero è: tre");
                break;
            default:
                System.out.println("Il numero non rientra nei parametri");
        }
        scan.close();
    }
}
