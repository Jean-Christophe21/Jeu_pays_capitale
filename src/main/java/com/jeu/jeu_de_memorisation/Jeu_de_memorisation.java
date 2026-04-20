/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jeu.jeu_de_memorisation;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author amevo
 */
public class Jeu_de_memorisation {

    public static void main(String[] args) {
        HashMap<String, String> liste_pays_capitale = new HashMap<>();
        // Initialisations des pays pour le jeu :
        liste_pays_capitale.put("Bénin", "Cotonou");
        liste_pays_capitale.put("Togo", "Lomé");
        liste_pays_capitale.put("Ghana", "Accra");
        liste_pays_capitale.put("Nigeria", "Abuja");
        liste_pays_capitale.put("Sénégal", "Dakar");
        liste_pays_capitale.put("Togo", "Lomé");
        liste_pays_capitale.put("Bénin", "Cotonou");
     

        Integer score = 0;  // stocke le score de l'utilisateur
        Scanner scanner = new Scanner(System.in); // permet de lire la réponse de l'utilisateur
        String reponse ="";   // contient la réponse de l'utilisateur
        
        for(HashMap.Entry<String, String> country_iterator: liste_pays_capitale.entrySet()){    // boucle permetttant l'exécution du jeu
            System.out.println("Voici le nom du Pays :" + country_iterator.getKey());
            System.out.println("Quelle est la capitale de ce pays ?");
            reponse = scanner.nextLine();
            if(reponse.toUpperCase().equals(country_iterator.getValue().toUpperCase())){
                ++score;
                System.out.println("\nBravo!! La réponse est correcte.\nLa capitale de : "+
                        country_iterator.getKey()+" est bien :"+country_iterator.getValue() + "\n\n");
            }
            else{
                System.out.println("\nLa réponse est incorrecte.\nLa capitale de : "+
                        country_iterator.getKey()+" est : "+country_iterator.getValue()+" et non : "+reponse + "\n\n");
            }
        }
        System.out.println("Votre score final est de :"+score+"\\"+liste_pays_capitale.size()+"\n\n Félicitation!!");
    }
}
