/*
 * TP0 Exercice 1 ING1 BDML
 * Yoan FARIA
 * Septembre 2026
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author yoanm
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour");
        System.out.println("Au revoir");
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prénom ?");
        prenom = sc.nextLine();
        System.out.println("Bonjour " + prenom + " !");

        sc.close();
    }
    
}
