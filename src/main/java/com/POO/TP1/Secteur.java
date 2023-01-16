package com.POO.TP1;

import java.util.List;

public class Secteur {
    private TypeAnimal typeAnimauxDansSecteur;
    private List<Animal> animauxDansSecteur;

    public Secteur(TypeAnimal t) {
        typeAnimauxDansSecteur = t;
    }

    public void ajouterAnimal(Animal a) {
        animauxDansSecteur.add(a);
    }

    public int getNombreAnimaux() {
        return animauxDansSecteur.size();
    }

    public TypeAnimal obtenirType() {
        return typeAnimauxDansSecteur;
    }
}
