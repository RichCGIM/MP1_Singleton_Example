package com.example.zooapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupAnimals();

        AnimalRepository instance = AnimalRepository.getInstance();
    }

    private void setupAnimals() {
        AnimalRepository instance = AnimalRepository.getInstance();

        Animal cat1 = new Animal();
        cat1.type = "Cat";
        cat1.name = "Garfield";
        cat1.sex = "Male";
        cat1.age = 12;

        Animal cat2 = new Animal();
        cat2.type = "Cat";
        cat2.name = "Deeba";
        cat2.sex = "Female";
        cat2.age = 8;

        instance.animals.add(cat1);
        instance.animals.add(cat2);

        System.out.println();
    }
}
