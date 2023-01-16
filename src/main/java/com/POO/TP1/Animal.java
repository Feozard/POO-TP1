package com.POO.TP1;

public class Animal {
    private String nomAnimal;
    private TypeAnimal typeAnimal;

    public Animal(String nom, TypeAnimal type) {
        nomAnimal = nom;
        typeAnimal = type;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public TypeAnimal getTypeAnimal() {
        return typeAnimal;
    }
}
