/*
 * TP0 Exercice 1 ING1 BDML
 * Yoan FARIA
 * Septembre 2026
 */
package exo.pkg2;

import java.util.Scanner;

/**
 *
 * @author yoanm
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
        int nb; // nombre d
        int result; // resultat
        int ind; //indice
        result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt();
        
        // Addition des nombres premiers entiers
        ind=1;
        while (ind <= nb) {
            result=result+ind;
            ind=ind+1;
        }
        
        // Affichage des résultats
        System.out.println();
        System.out.println("La somme des "+ nb + "entier est :"+result);
        
    }
    
}
