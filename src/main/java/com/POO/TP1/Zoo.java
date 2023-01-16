package com.POO.TP1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int visiteurs;
    private List<Secteur> secteursAnimaux;
    private int nbVisiteurMaxParSecteur;

    /**
     * @param limite int
     */
    public Zoo(int limite) {
        nbVisiteurMaxParSecteur = limite;
        secteursAnimaux = new ArrayList<Secteur>();
    }

    /**
     * @param t TypeAnimal
     */
    public void ajouterSecteur(TypeAnimal t) {
        secteursAnimaux.add(new Secteur(t));
    }


    /**
     * @throws LimiteVisiteurException
     */
    public void nouveauVisiteur() throws LimiteVisiteurException {
        visiteurs++;
        if (visiteurs > nbVisiteurMaxParSecteur) {
            throw new LimiteVisiteurException();
        }
    }

    /**
     * @return int
     */
    public int getLimiteVisiteur() {
        return nbVisiteurMaxParSecteur;
    }


    /**
     * @param a Animal
     */
    public void nouvelAnimal(Animal a) {
        for (int i = 0; i < secteursAnimaux.size(); i++) {
            if (secteursAnimaux.get(i).obtenirType() == a.getTypeAnimal()) {
                secteursAnimaux.get(i).ajouterAnimal(a);
                return;
            }
        }
    }

    /**
     * @return int
     */
    public int nombreAnimaux() {
        int nbAnimaux = 0;
        for (int i = 0; i < secteursAnimaux.size(); i++) {
            nbAnimaux += secteursAnimaux.get(i).getNombreAnimaux();
        }
        return nbAnimaux;
    }
}
