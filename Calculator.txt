/*
 * TP0 Exercice 1 ING1 BDML
 * Yoan FARIA
 * Septembre 2026
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author yoanm
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        int operateur = sc.nextInt();

        System.out.println("Entrer la première valeur :");
        float operande1 = sc.nextFloat();

        System.out.println("Entrer la deuxième valeur :");
        float operande2 = sc.nextFloat();

       if (operateur == 1) {
           System.out.println("The Result is "+(operande1 + operande2));
       } else if (operateur == 2) {
            System.out.println("Résultat : " + (operande1 - operande2));
        } else if (operateur == 3) {
            System.out.println("Résultat : " + (operande1 * operande2));
        } else if (operateur == 4) {
            if (operande2 != 0){
                System.out.println("Résultat : " + (operande1 / operande2));
            } else {
                System.out.println("Calcul impossible");
            }
        } else if (operateur == 5) {
            if (operande2 != 0) {
                System.out.println("Résultat : " + (operande1 % operande2));
            } else {
                System.out.println("Erreur : Modulo par zéro impossible.");
            }
        } else {
            System.out.println("Opérateur invalide.");
        }

        sc.close();
    }
    
}
