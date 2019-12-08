package com.example.zooapplication;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    //SINGLETON PATTERN
    private static AnimalRepository instance = null;
    private List<Animal> animals = new ArrayList<>();

    private AnimalRepository() {
        Animal animal1 = new Animal();
        animal1.age = 2;
        animal1.sex = "M";
        animal1.type = "Dog";
        animal1.name = "Sputnik";

        Animal animal2 = new Animal();
        animal2.age = 2;
        animal2.sex = "F";
        animal2.type = "Cat";
        animal2.name = "Fipoo";

        this.animals.add(animal1);
        this.animals.add(animal2);

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
