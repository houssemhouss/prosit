/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.main;

import java.util.Comparator;

/**
 *
 * @author HP
 */
public class EnseignantComparatorByName implements Comparator<Enseignant> {

    @Override
    public int compare(Enseignant o1, Enseignant o2) {
        return o1.getNom().compareTo(o2.getNom());
    }

}
