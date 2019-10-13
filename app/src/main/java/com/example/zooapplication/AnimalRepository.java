package com.example.zooapplication;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    //SINGLETON PATTERN
    private static AnimalRepository instance = null;
    public List<Animal> animals;

    private AnimalRepository() {
        this.animals = new ArrayList<>();
    }
    public static AnimalRepository getInstance() {
        if (instance == null) {
            instance = new AnimalRepository();
        }
        return instance;
    }
}
