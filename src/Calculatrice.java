import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculatrice ===");
        System.out.println("Choisissez une opération");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Puissance");
        System.out.println("6. Modulo");
        System.out.print("Votre choix :");

        int choix = scanner.nextInt();

        System.out.print("Entrez le premier nombre: ");
        double num1 = scanner.nextDouble();

        System.out.print("Entrez le deuxieme nombre: ");
        double num2 = scanner.nextDouble();

        double resultat;

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

        } else if (choix == 5) {
            resultat = Math.pow(num1, num2);
            System.out.println("Résultat: " + resultat);

        } else if (choix == 6) {
            resultat = num1 % num2;
            System.out.println("Résultat: " + resultat);

        } else {
            // Si le numéro tapé est erroné
            System.out.println("Numéro d'opération invalide !");
        }

        scanner.close();
    }
}