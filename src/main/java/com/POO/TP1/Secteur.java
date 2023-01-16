package com.POO.TP1;

import java.util.List;

public class Secteur {
    private TypeAnimal typeAnimauxDansSecteur;
    private List<Animal> animauxDansSecteur;


    /**
     * @param t TypeAnimal
     */
    public Secteur(TypeAnimal t) {
        typeAnimauxDansSecteur = t;
    }


    /**
     * @param a Animal
     */
    public void ajouterAnimal(Animal a) {
        animauxDansSecteur.add(a);
    }

    /**
     * @return int
     */
    public int getNombreAnimaux() {
        return animauxDansSecteur.size();
    }

    /**
     * @return TypeAnimal
     */
    public TypeAnimal obtenirType() {
        return typeAnimauxDansSecteur;
    }
}
