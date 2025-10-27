import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculatrice ===");
        System.out.println("Choisir une opération");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Votre choix :");

        System.out.print("Entrez le premier nombre: ");
        int num1 = scanner.nextInt();

        System.out.print("Entrez le deuxieme nombre: ");
        int num2 = scanner.nextInt();

        int resultat;

        int choix = scanner.nextInt();

        if (choix == 1) {
            resultat = num1 + num2;
            System.out.println("Résultat: " + resultat);
        } else if (choix == 2) {
            resultat = num1 - num2;
            System.out.println("Résultat: " + resultat);
        } else if (choix == 3) {
            resultat = num1 * num2;
            System.out.println("Résultat: " + resultat);
        } else if (choix == 4) {
            resultat = num1 / num2;
            System.out.println("Résultat: " + resultat);
        }
        scanner.close();
    }
}