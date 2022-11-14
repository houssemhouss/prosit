/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.main;

import java.util.Collection;

/**
 *
 * @author HP
 */
public class SetMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enseignant e1 = new Enseignant(22, "Kaycer", "Khouini");
        Enseignant e2 = new Enseignant(14, "Ali", "BenMahmoud");
        Enseignant e3 = new Enseignant(30, "Belkis", "Khouini");

           EspritHashSet hash = new EspritHashSet();
              hash.ajouterEnseignant(e1);
              hash.ajouterEnseignant(e2);
              hash.ajouterEnseignant(e3);
              hash.displayEnseignants();
       
        EspritTreeSet tree = new EspritTreeSet();
        tree.ajouterEnseignant(e1);
        tree.ajouterEnseignant(e2);
        tree.ajouterEnseignant(e3);
        tree.displayEnseignants();
        tree.displayEnseignants();

        System.out.println("PRESENCE PAR ID 14 : " + tree.rechercherEnseignant(14));
        System.out.println("PRESENCE PAR ID 5 : " + tree.rechercherEnseignant(5));


    }

}
