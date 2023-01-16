package com.POO.TP1;

public class Animal {
    private String nomAnimal;
    private TypeAnimal typeAnimal;

    /**
     * @param nom String
     * @param type TypeAnimal
     */
    public Animal(String nom, TypeAnimal type) {
        nomAnimal = nom;
        typeAnimal = type;
    }

    /**
     * @return String
     */
    public String getNomAnimal() {
        return nomAnimal;
    }

    /**
     * @return TypeAnimal
     */
    public TypeAnimal getTypeAnimal() {
        return typeAnimal;
    }
}
