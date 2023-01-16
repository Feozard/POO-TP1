package com.POO.TP1;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements Service {
    private int visiteurs;
    private List<Secteur> secteursAnimaux;
    private int nbVisiteurMaxParSecteur;

    public Zoo(int limite) {
        nbVisiteurMaxParSecteur = limite;
        secteursAnimaux = new ArrayList<Secteur>();
    }

    public void ajouterSecteur(TypeAnimal t) {
        secteursAnimaux.add(new Secteur(t));
    }

    public void nouveauVisiteur() throws LimiteVisiteurException {
        visiteurs++;
        if (visiteurs > nbVisiteurMaxParSecteur) {
            throw new LimiteVisiteurException();
        }
    }

    public int getLimiteVisiteur() {
        return nbVisiteurMaxParSecteur;
    }

    public void nouvelAnimal(Animal a) {
        for (int i = 0; i < secteursAnimaux.size(); i++) {
            if (secteursAnimaux.get(i).obtenirType() == a.getTypeAnimal()) {
                secteursAnimaux.get(i).ajouterAnimal(a);
                return 0;
            }
        }
    }

    public int nombreAnimaux() {
        int nbAnimaux = 0;
        for (int i = 0; i < secteursAnimaux.size(); i++) {
            nbAnimaux += secteursAnimaux.get(i).getNombreAnimaux();
        }
        return nbAnimaux;
    }
}
