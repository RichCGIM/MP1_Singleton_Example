package com.example.zooapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etType, etName, etSex, etAge;
    Button btAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AnimalRepository repository = AnimalRepository.getInstance();

        etType = findViewById(R.id.etType);
        etName = findViewById(R.id.etName);
        etSex = findViewById(R.id.etSex);
        etAge = findViewById(R.id.etAge);
        btAdd = findViewById(R.id.btAdd);

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get field values
                String type = etType.getText().toString();
                String name = etName.getText().toString();
                String sex = etSex.getText().toString();
                int age = Integer.parseInt(etAge.getText().toString());

                // create animal
                Animal animal = new Animal();
                animal.type = type;
                animal.name = name;
                animal.sex = sex;
                animal.age = age;

                // add animal to repo
                repository.addAnimal(animal);

                // clear the fields
                etAge.getText().clear();
                etType.getText().clear();
                etName.getText().clear();
                etSex.getText().clear();
            }
        });
    }
}
