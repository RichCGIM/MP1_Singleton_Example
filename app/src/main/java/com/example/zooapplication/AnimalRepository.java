package com.example.zooapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AnimalRepository {
    //SINGLETON PATTERN
    private static AnimalRepository instance = null;
    private List<Animal> animals = new ArrayList<>();

    private AnimalRepository() {
        Animal animal = new Animal();
        animal.age = 2;
        animal.sex = "M";
        animal.type = "Dog";
        animal.name = "Sputnik";
        this.animals.add(animal);
    }


    public static AnimalRepository getInstance() {
        if (instance == null) {
            instance = new AnimalRepository();
        }
        return instance;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return this.animals;
    }
}
